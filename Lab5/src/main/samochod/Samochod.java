package main.samochod;

import java.util.ArrayList;
import java.util.List;

public class Samochod extends Thread {
    public String nrRejestSa;
    public String modelSa;
    public double wagaSa;
    public double predkoscSa;

    public SkrzyniaBiegow skrzynia;
    public Silnik silnik;
    public Pozycja pozycja;
    public Pozycja cel;

    private List<Listener> listeners = new ArrayList<Listener>();   //lista słuchaczy

    public void wlacz(){silnik.uruchom(); predkoscSa();}
    public void wylacz(){silnik.zatrzymaj(); predkoscSa();}

    public void predkoscSa() {
        skrzynia.aktualnePrzelozenie();
        if (!skrzynia.sprzeglo.wcisniecie) {
            predkoscSa = silnik.Obroty * skrzynia.aktualnePrzelozenie / 60 * 2 / 1000 * 3600;
        }
    }
    public void zwiekszObroty(){silnik.zwiekszObroty(); predkoscSa();}
    public void zmniejszObroty(){silnik.zmniejszObroty(); predkoscSa();}

    public void wcisnijSprzeglo(){skrzynia.sprzeglo.wcisnij(); predkoscSa();}
    public void zwolnijSprzeglo(){skrzynia.sprzeglo.zwolnij(); predkoscSa();}

    public void zwiekszBieg(){skrzynia.zwiekszBieg(); predkoscSa();}
    public void zmniejszBieg(){skrzynia.zmniejszBieg(); predkoscSa();}

    public void jedzDo(Pozycja pozycja){cel=pozycja;}

    public void run(){
        double deltat = 0.1;
        while (true) {
            if (cel != null) {
                double dxC = cel.x - pozycja.x;
                double dyC = cel.y - pozycja.y;
                double odleglosc = Math.sqrt(dxC * dxC + dyC * dyC);
                //Usunięcie drgania samochodu
                if (odleglosc <= 0.001) {
                    pozycja.x = cel.x;
                    pozycja.y = cel.y;
                    cel = null;
                    notifyListeners();
                } else {
                    double krok = predkoscSa * deltat;

                    if (krok > odleglosc) {
                        krok = odleglosc;
                    }

                    double dx = krok * dxC / odleglosc;
                    double dy = krok * dyC / odleglosc;

                    pozycja.aktualizujPozycje(dx, dy);
                    notifyListeners();
                }
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                return;
            }
        }

    }

    public void addListener(Listener listener) {
        listeners.add(listener);
    }
    public void removeListener(Listener listener) {
        listeners.remove(listener);
    }
    private void notifyListeners() {
        for (Listener listener : listeners) {
            listener.update();
        }
    }

    public Samochod(String model, String nrRejest, Silnik silnik, Sprzeglo sprzeglo, SkrzyniaBiegow skrzynia) {
        this.modelSa = model;
        this.nrRejestSa = nrRejest;

        this.silnik = silnik;
        this.skrzynia = skrzynia;
        skrzynia.sprzeglo=sprzeglo;

        wagaSa = silnik.waga + skrzynia.waga + sprzeglo.waga;
        pozycja = new Pozycja();
        //stworzenie wątku
        this.start();
    }
}


