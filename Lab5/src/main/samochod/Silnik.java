package main.samochod;

public class Silnik extends Komponent{
    double maxObroty;
    public double Obroty;


    public Silnik(String nazwa, Double cena, double waga, int maxObroty) {
        this.nazwa=nazwa;
        this.cena=cena;
        this.waga=waga;
        this.maxObroty = maxObroty;
    }

    public void uruchom(){
        Obroty=800;
    }
    void zatrzymaj(){
        Obroty=0;
    }
    public void zmniejszObroty(){
        if (Obroty-100 < 0  ){
            return;}
        else if(Obroty-100 <800){
            Obroty=0;
            return;
        }
        Obroty=Obroty-100;
    }

    public void zwiekszObroty(){
        if (Obroty+100 > maxObroty || Obroty<800){
            return;
        }
        Obroty=Obroty+100;
    }


}
