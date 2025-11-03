package samochod;

public class SkrzyniaBiegow extends Komponent{
    int aktualnyBieg;
    int iloscBiegow;
    double aktualnePrzelozenie;

    public SkrzyniaBiegow(int aktualnyBieg,int iloscBiegow){
        this.aktualnyBieg=aktualnyBieg;
        this.iloscBiegow=iloscBiegow;
        Sprzeglo sprz = new Sprzeglo(100);
    }

    void zwiekszBieg(){
        aktualnyBieg=aktualnyBieg+1;
    }

    void zmienjszBieg(){
        aktualnyBieg=aktualnyBieg-1;
    }

    int aktualnyBieg(){
        return aktualnyBieg;
    }

    void aktualnePrzelozenie(){}

}
