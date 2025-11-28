package main.samochod;

public class Silnik extends Komponent{
    double maxObroty=8000;
    double Obroty;

    public Silnik(double Obroty) {
        this.Obroty = Obroty;
    }

    public void uruchom(){
        Obroty=800;
    }
    void zatrzymaj(){
        Obroty=0;
    }
    public void zmniejszObroty(){
        if (Obroty-100 < 0){
            return;
        }
        Obroty=Obroty-100;
    }

    public void zwiekszObroty(){
        if (Obroty+100 > maxObroty){
            return;
        }
        Obroty=Obroty+100;
    }


}
