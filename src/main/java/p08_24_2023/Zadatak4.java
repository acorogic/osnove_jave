package p08_24_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        4.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i koji prikazuje element na poziciji K.
//                K unosi korisnik i smatrajte da unosi u opsegu od 0 do 4.
//        Primer:
//        Unesite pozicjiu: 2
//        Na pozicji 2 je vrednost 7.
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        System.out.println("Unesite K (0-4)");
        int k= s.nextInt();

        int vrednostK= numbers.get(k);
        System.out.println(vrednostK);






    }
}
