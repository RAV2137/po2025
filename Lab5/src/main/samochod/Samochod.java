package main.samochod;

public class Samochod {
    public String nrRejestSa;
    public String modelSa;
    public double wagaSa;
    public double predkoscSa;

    public SkrzyniaBiegow skrzynia;
    public Silnik silnik;
    public Pozycja pozycja;

    public void wlacz(){
        silnik.uruchom();
    }
    public void wylacz(){silnik.zatrzymaj();}



    public Samochod(String model, String nrRejest, Silnik silnik, Sprzeglo sprzeglo, SkrzyniaBiegow skrzynia) {
        this.modelSa = model;
        this.nrRejestSa = nrRejest;

        this.silnik = silnik;
        this.skrzynia = skrzynia;
        skrzynia.sprzeglo=sprzeglo;

        wagaSa = silnik.waga + skrzynia.waga + sprzeglo.waga;
        predkoscSa = 200;          // do dokończenia ilośc biegów i przełożenie
        pozycja = new Pozycja();
    }
}


