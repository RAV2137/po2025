package main.samochod;

public class Sprzeglo extends Komponent{
    public int stanSprzegla;
    public boolean wcisniecie;

    public Sprzeglo(String nazwa, Double cena, double waga,int stanSprzegla){
        this.nazwa=nazwa;
        this.cena=cena;
        this.waga=waga;
        if (stanSprzegla<0){
            stanSprzegla=0;
        }else if (stanSprzegla>100){
            stanSprzegla=100;}

        this.stanSprzegla = stanSprzegla;
    }

    void wcisnij(){
        wcisniecie=true;
    }
    void zwolnij(){
        wcisniecie=false;
    }

}
