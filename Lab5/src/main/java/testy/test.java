package testy;
import samochod.*;


public class test {
    public static void main(String[] args) {

//
//        Silnik silnik= new Silnik(7000, 200);
//        silnik.uruchom();
//
//        SkrzyniaBiegow sprzynia = new  SkrzyniaBiegow(7000, 200);

        Samochod samochod = new  Samochod(true, "cos", "cos", 160);
        samochod.wylacz();
        samochod.silnik.zmniejszObroty();

        Samochod auto = new Samochod("blachy", "model", 160,8000,5);
    }
}
