package main.samochod;

public class SkrzyniaBiegow extends Komponent{
    public int aktualnyBieg=0;
    public int iloscBiegow;
    public double aktualnePrzelozenie;
    public Sprzeglo sprzeglo;


    public SkrzyniaBiegow(String nazwa, double cena, double waga, int iloscBiegow){
        this.nazwa=nazwa;
        this.cena=cena;
        this.waga=waga;
        this.iloscBiegow=iloscBiegow;
        aktualnePrzelozenie();
    }


    //<editor-fold desc="Funkcje">
    public void zwiekszBieg(){
        if(aktualnyBieg+1>=iloscBiegow){ return; }
        aktualnyBieg=aktualnyBieg+1;
    }

    public void zmniejszBieg(){
        if(aktualnyBieg-1 <=0) { return; }
        aktualnyBieg = aktualnyBieg - 1;
    }

    void aktualnePrzelozenie(){
        aktualnePrzelozenie= (double) (1+aktualnyBieg) / iloscBiegow ;
    }
    //</editor-fold>
}
