package samochod;

public class Samochod {
    boolean stanWlaczenia;
    String nrRejest;
    String model;
    double predkosc_max;
    SkrzyniaBiegow skrzynia;
    Silnik silnik;

    public void wlacz(){
        silnik.uruchom();
    }
    public void wylacz(){
        silnik.zatrzymaj();

    }


    public Samochod(boolean stanWlaczenia,String nrRejstracji, String model, double predkosc_max){
        this.stanWlaczenia = stanWlaczenia;
        this.nrRejest = nrRejstracji;
        this.model = model;
        this.predkosc_max = predkosc_max;
        skrzynia = new SkrzyniaBiegow(1, 6);
        silnik = new Silnik(7000, 200);
    }



}
