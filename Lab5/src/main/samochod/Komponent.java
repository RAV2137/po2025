package main.samochod;

public abstract class Komponent {
    public String nazwa;
    public double waga;
    public double cena;


    public String getNazwa(){
        return nazwa;
    }
    public double getWaga(){
        return waga;
    }
    public double getCena(){
        return cena;
    }

}
