import java.util.HashSet;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        Random randomNumbers = new Random();

        HashSet<Integer> liczby = new HashSet<Integer>();

        while (liczby.size() < 6) {
            liczby.add(randomNumbers.nextInt(1,50));

        }
        //zad2
//        int liczba_wygranych=0;
//        int[] n = new int[6];
//        System.out.println("Liczby wygywające: " + liczby);
//            for (int i=0; i<liczby.size(); i++){
//                n[i]=Integer.parseInt(args[i]);
//                System.out.println(n[i]);
//        }

//        for (Integer I : liczby) {
//            for(int x : n) {
//                    if (x == I){
//                        liczba_wygranych+=1;
//                    }
//                }
//            }
//        System.out.println("Wygranych: " + liczba_wygranych);

        //zad3

        long time=System.currentTimeMillis();
        int ilosc_losowan=0;
        int liczba_wygranych=0;
        boolean wylosowano= false;
        while (!wylosowano){

            HashSet<Integer> liczby_2 = new HashSet<Integer>();
            liczba_wygranych=0;
            while (liczby_2.size() < 6) {
                liczby_2.add(randomNumbers.nextInt(1, 50));
            }
            for (Integer I : liczby) {
                for(int x : liczby_2) {
                    if (x == I){
                        liczba_wygranych+=1;
                    }
                }
            }
            ilosc_losowan+=1;
            if (liczba_wygranych==6){
                wylosowano=true;
                System.out.println("Czas: " + (System.currentTimeMillis()-time)/1000.0);
                System.out.println(ilosc_losowan);
                System.out.println("Lotto: "+ liczby);
                System.out.println(liczby_2);
            }
        }

        }
    }
