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
<<<<<<< HEAD
        samochod.wlacz();
=======
        samochod.silnik.zmniejszObroty();
        double z=samochod.silnik.getWaga();

        Samochod auto = new Samochod("blachy", "model", 160,8000,5);
>>>>>>> cf8ccb26f4c03630f004fca43db766b0fe14ed65
    }
}
