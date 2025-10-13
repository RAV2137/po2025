import java.util.Random;

import java.util.HashSet;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {
        int liczba_wygranych=0;

        Random randomNumbers = new Random();

        HashSet<Integer> liczby = new HashSet<Integer>();

        while (liczby.size() < 6) {
            liczby.add(randomNumbers.nextInt(1,50));

        }
        int[] n = new int[6];
        System.out.println("Liczby wygywające: " + liczby);
            for (int i=0; i<liczby.size(); i++){
                n[i]=Integer.parseInt(args[i]);
                System.out.println(n[i]);
        }

        for (Integer I : liczby) {
            for(int x : n) {
                    if (x == I){
                        liczba_wygranych+=1;
                    }
                }
            }
        System.out.println("Wygranych: " + liczba_wygranych);
        }
    }
