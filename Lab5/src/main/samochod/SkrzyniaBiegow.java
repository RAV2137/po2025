package main.samochod;

public class SkrzyniaBiegow extends Komponent{
    public int aktualnyBieg;
    public int iloscBiegow=6;
    public double aktualnePrzelozenie;
    public Sprzeglo sprzeglo;

    public SkrzyniaBiegow(int aktualnyBieg, String nazwaSp, double cenaSp, double wagaSp, int stanSp){
        this.aktualnyBieg=aktualnyBieg;
        Sprzeglo sprzeglo = new Sprzeglo(stanSp);
        sprzeglo.nazwa=nazwaSp;
        sprzeglo.cena=cenaSp;
        sprzeglo.waga=wagaSp;
    }


    //<editor-fold desc="Funkcje">
    void zwiekszBieg(){
        if(aktualnyBieg+1>=iloscBiegow){ return; }
        aktualnyBieg=aktualnyBieg+1;
    }

    void zmienjszBieg(){
        if(aktualnyBieg-1 <=0) { return; }
        aktualnyBieg = aktualnyBieg - 1;
    }

    int aktualnyBieg(){
        return aktualnyBieg;
    }

    void aktualnePrzelozenie(){}
    //</editor-fold>
}
