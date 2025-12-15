package main.samochod;

public class Samochod {
    public String nrRejestSa;
    public String modelSa;
    public double wagaSa;
    public double predkoscSa;

    public SkrzyniaBiegow skrzynia;
    public Silnik silnik;
    public Pozycja pozycja;

    public void wlacz(){silnik.uruchom(); predkoscSa();}
    public void wylacz(){silnik.zatrzymaj(); predkoscSa();}

    public void predkoscSa() {
        skrzynia.aktualnePrzelozenie();
        if (!skrzynia.sprzeglo.wcisniecie) {
            predkoscSa = silnik.Obroty * skrzynia.aktualnePrzelozenie / 60 * 2 / 1000 * 3600;
        }
        else { predkoscSa=0;};
    }
    public void zwiekszObroty(){silnik.zwiekszObroty(); predkoscSa();}
    public void zmniejszObroty(){silnik.zmniejszObroty(); predkoscSa();}

    public void wcisnijSprzeglo(){skrzynia.sprzeglo.wcisnij(); predkoscSa();}
    public void zwolnijSprzeglo(){skrzynia.sprzeglo.zwolnij(); predkoscSa();}

    public void zwiekszBieg(){skrzynia.zwiekszBieg(); predkoscSa();}
    public void zmniejszBieg(){skrzynia.zmniejszBieg(); predkoscSa();}


    public Samochod(String model, String nrRejest, Silnik silnik, Sprzeglo sprzeglo, SkrzyniaBiegow skrzynia) {
        this.modelSa = model;
        this.nrRejestSa = nrRejest;

        this.silnik = silnik;
        this.skrzynia = skrzynia;
        skrzynia.sprzeglo=sprzeglo;

        wagaSa = silnik.waga + skrzynia.waga + sprzeglo.waga;
        pozycja = new Pozycja();
    }
}


