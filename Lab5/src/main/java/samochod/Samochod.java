package samochod;

public class Samochod {
    boolean stanWlaczenia;
    String nrRejest;
    String model;
    double predkosc_max;
    SkrzyniaBiegow skrzynia;
    public Silnik silnik;
    public Pozycja pozycja;

    public void wlacz(){
        silnik.uruchom();
    }
    public void wylacz(){silnik.zatrzymaj();}



    public Samochod(boolean stanWlaczenia,String nrRejstracji, String model, double predkosc_max){
        this.stanWlaczenia = stanWlaczenia;
        this.nrRejest = nrRejstracji;
        this.model = model;
        this.predkosc_max = predkosc_max;
        skrzynia = new SkrzyniaBiegow(1, 6);
        silnik = new Silnik(7000);
        pozycja = new Pozycja();
    }
    public Samochod(String nrRejstracji, String model, double predkosc_max, int maxObroty, int iloscBiegow){
        this.stanWlaczenia = false;
        this.nrRejest = nrRejstracji;
        this.model = model;
        this.predkosc_max = predkosc_max;
        skrzynia = new SkrzyniaBiegow(1, iloscBiegow);
        silnik = new Silnik(maxObroty);
        Pozycja pozycja = new Pozycja();

    }

}