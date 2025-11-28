package main.samochod;

public class SkrzyniaBiegow extends Komponent{
    public int aktualnyBieg;
    public int iloscBiegow=6;
    public double aktualnePrzelozenie;

    public SkrzyniaBiegow(int aktualnyBieg){
        this.aktualnyBieg=aktualnyBieg;
        Sprzeglo sprz = new Sprzeglo(100);
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
