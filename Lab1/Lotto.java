import java.util.Random;

import java.util.HashSet;

public class Lotto{
    public static void main(String[] args){
        Random randomNumbers = new Random();

        HashSet<Integer> liczby = new HashSet<Integer>();

        while(liczby.size()<6){
            liczby.add(randomNumbers.nextInt(10));


        }

        System.out.println("Liczby: "+ liczby);
    }
}
