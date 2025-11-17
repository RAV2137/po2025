package samochod;

public class Silnik extends Komponent{
    double maxObroty;
    double Obroty;

    public Silnik(double maxObroty) {
        this.maxObroty = maxObroty;
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
