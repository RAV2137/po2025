package samochod;

public abstract class Komponent {
    String nazwa;
    double waga;
    double cena;


    String getNazwa(){
        return nazwa;
    }
    double getWaga(){
        return waga;
    }
    double getCena(){
        return cena;
    }

}
