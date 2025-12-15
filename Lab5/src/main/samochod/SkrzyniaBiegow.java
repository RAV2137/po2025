package main.samochod;

public class SkrzyniaBiegow extends Komponent{
    public int aktualnyBieg;
    public int iloscBiegow;
    public double aktualnePrzelozenie;
    public Sprzeglo sprzeglo;

    public SkrzyniaBiegow(int aktualnyBieg, String nazwaSp, double cenaSp, double wagaSp, int stanSp){
        this.aktualnyBieg=aktualnyBieg;
        Sprzeglo sprzeglo = new Sprzeglo(stanSp);
        sprzeglo.nazwa=nazwaSp;
        sprzeglo.cena=cenaSp;
        sprzeglo.waga=wagaSp;
        int iloscBiegow=6;
    }

    public SkrzyniaBiegow(String nazwa, double cena, double waga, int iloscBiegow){
        this.nazwa=nazwa;
        this.cena=cena;
        this.waga=waga;
        this.iloscBiegow=iloscBiegow;
    }


    //<editor-fold desc="Funkcje">
    public void zwiekszBieg(){
        if(aktualnyBieg+1>=iloscBiegow){ return; }
        aktualnyBieg=aktualnyBieg+1;
    }

    public void zmienjszBieg(){
        if(aktualnyBieg-1 <=0) { return; }
        aktualnyBieg = aktualnyBieg - 1;
    }

    int aktualnyBieg(){
        return aktualnyBieg;
    }

    void aktualnePrzelozenie(){}
    //</editor-fold>
}
