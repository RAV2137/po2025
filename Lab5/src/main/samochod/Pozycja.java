package main.samochod;

public class Pozycja {
    protected double x;
    protected double y;

    public Pozycja(){
        x=0;
        y=0;
    }

    public Pozycja(double x, double y){
        this.x = x;
        this.y = y;
    }

    public String getPozycja(){
        return String.valueOf(x)+ String.valueOf(y);
    }
    void aktualizujPozycje(double deltaX, double deltaY){
        x=x+deltaX;
        y=y+deltaY;
    }

}
