package d08_24_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        2.Zadatak
//        Napisati program koji ucitava N brojeva i smesta ih u niz.
//                Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//                Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza N");
        int n = s.nextInt();
        ArrayList<Integer> niz = new ArrayList<>();
        int sumaParnihbrojeva = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj ");
            int broj = s.nextInt();
            niz.add(i, broj);

            if (broj % 2 == 0) {
                sumaParnihbrojeva++;

            }


        }
        System.out.println(" U nizu ima " + sumaParnihbrojeva + " parna broja");
        System.out.println("kraj programa");
    }
}
