package samochod;

public class Pozycja {
    double x;
    double y;

    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }

    String getPozycja(){
        return String.valueOf(x)+ String.valueOf(y);
    }
    void aktualizujPozycje(double deltaX, double deltaY){
        x=x+deltaX;
        y=y+deltaY;
    }

}
