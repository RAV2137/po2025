package main.samochod;

public class Samochod {
    boolean stanWlaczenia;
    String nrRejestSa;
    String modelSa;
    double wagaSa;
    double predkosc_maxSa;

    public SkrzyniaBiegow skrzynia;
    public Silnik silnik;
    public Pozycja pozycja;

    public void wlacz(){
        silnik.uruchom();
    }
    public void wylacz(){silnik.zatrzymaj();}


    public Samochod(String modelSa, String nrRejestSa, double wagaSa, double predkosc_maxSa,
                    String nazwaSk, double cenaSk, double wagaSk,int biegSk,
                    String nazwaSi, double cenaSi, double wagaSi, int obrotySi,
                    String nazwaSp, double cenaSp, double wagaSp, int stanSp) {

            this.modelSa=modelSa;
            this.nrRejestSa = nrRejestSa;
            this.wagaSa = wagaSa;
            this.predkosc_maxSa = predkosc_maxSa;

            skrzynia = new SkrzyniaBiegow(biegSk,nazwaSp, cenaSp, wagaSp, stanSp);
            skrzynia.nazwa=nazwaSk;
            skrzynia.cena=cenaSk;       //chyba do klasy to trzeba wrzucić bo syf
            skrzynia.waga=wagaSk;
//            sprzeglo = new Sprzeglo();

            silnik = new Silnik(obrotySi);
            silnik.nazwa=nazwaSi;
            silnik.cena=cenaSi;
            silnik.waga=wagaSi;

            pozycja = new Pozycja();
        }


    }

//    public Samochod(boolean stanWlaczenia,String nrRejstracji, String model, double predkosc_max){
//        this.stanWlaczenia = stanWlaczenia;
//        this.nrRejest = nrRejstracji;
//        this.model = model;
//        this.predkosc_max = predkosc_max;
//        skrzynia = new SkrzyniaBiegow(1, 6);
//        silnik = new Silnik(7000);
//        pozycja = new Pozycja();
//    }
//    public Samochod(String nrRejstracji, String model, double predkosc_max, int maxObroty, int iloscBiegow){
//        this.stanWlaczenia = false;
//        this.nrRejest = nrRejstracji;
//        this.model = model;
//        this.predkosc_max = predkosc_max;
//        skrzynia = new SkrzyniaBiegow(1, iloscBiegow);
//        silnik = new Silnik(maxObroty);
//        Pozycja pozycja = new Pozycja();
//
//    }

