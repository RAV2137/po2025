package zadania;

import static animals.Animal.*;
import animals.Animal;
import animals.Dog;
import animals.Parrot;
import animals.Snake;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];

        for (int i = 0;  i < 100; i++) {
            int numer = (int)(Math.random() *2);
            switch(numer) {
                case 0:
                    animals[i] = new Parrot();
                    break;
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Snake();
                    break;

            }
        }
        System.out.println(legs_counter(animals));
    }
//    static int legs_counter(Animal[] animals) {
//        int number_of_legs=0;
//        for (int i = 0 ; i <animals.length ; i++) {
//            number_of_legs=number_of_legs+animals[i].legs;
//            number_of_legs+=animals[i].legs;
//            number_of_legs+=animals[i].legs;
//        }
//        return number_of_legs;
//
//    }
}
