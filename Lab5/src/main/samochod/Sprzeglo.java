package main.samochod;

public class Sprzeglo extends Komponent{
    public int stanSprzegla;
    public boolean wcisniecie;

    public Sprzeglo(String nazwa, Double cena, double waga,int stanSprzegla){
        this.nazwa=nazwa;
        this.cena=cena;
        this.waga=waga;
        this.stanSprzegla = stanSprzegla;
    }

    void wcisnij(){
        wcisniecie=true;
    }
    void zwolnij(){
        wcisniecie=false;
    }

}
