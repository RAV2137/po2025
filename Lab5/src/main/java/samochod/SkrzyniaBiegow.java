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
        if(aktualnyBieg+1>=iloscBiegow){
            return;
        }
        aktualnyBieg=aktualnyBieg+1;
    }

    void zmienjszBieg(){
        if(aktualnyBieg-1 <=0)
        {
           return;
        }
        aktualnyBieg = aktualnyBieg - 1;
    }

    int aktualnyBieg(){
        return aktualnyBieg;
    }

    void aktualnePrzelozenie(){}

}
