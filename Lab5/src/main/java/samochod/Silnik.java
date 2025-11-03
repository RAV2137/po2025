package samochod;

public class Silnik extends Komponent{
    double maxObroty;
    double Obroty;

    public Silnik(double maxObroty, double Obroty) {
        this.maxObroty = maxObroty;
        this.Obroty = Obroty;
    }

    public void uruchom(){
        Obroty=800;
    }
    void zatrzymaj(){
        Obroty=0;
    }
    void zmniejszObroty(){
        Obroty=Obroty+100;
    }
    void zwiekszObroty(){
        Obroty=Obroty-100;
    }


}
