package main.samochod;

public class Samochod extends Thread {
    public String nrRejestSa;
    public String modelSa;
    public double wagaSa;
    public double predkoscSa;

    public SkrzyniaBiegow skrzynia;
    public Silnik silnik;
    public Pozycja pozycja;
    public Pozycja cel;

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
                double odleglosc = Math.sqrt(Math.pow(cel.x - pozycja.x, 2) +
                        Math.pow(cel.y - pozycja.y, 2));
                double dx = predkoscSa * deltat * (cel.x - pozycja.x) /
                        odleglosc;
                double dy = predkoscSa * deltat * (cel.y - pozycja.y) /
                        odleglosc;
                pozycja.aktualizujPozycje(dx,dy);
            }
            try {
                Thread.sleep(100); // pauza 100ms
            } catch (InterruptedException e) {
                return; // zakończ wątek jeśli przerwany
            }
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


