package samochod;

public abstract class Komponent {
    String nazwa;
    public double waga;
    double cena;


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
