package p21_08_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {


//        Napisati program koji od korisnika ucitava N brojeva  i ispisuje sumu tih brojeva.
//                N nam kaze koliko broja ce korisnik da unese.
//                Primer izvrsenja:
//        Unesite N: 3
//        Unesite broj: 1
//        Unesite broj: 4
//        Unesite broj: 9
//        Suma je 14.

        Scanner s = new Scanner(System.in);
        System.out.println( "Unesite broj N");
        int brojBrojeva = s.nextInt();
        int sumaBrojeva= 0; //neutralna vrednost za sabiranje

        for (int i = 1; i <=brojBrojeva ; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            sumaBrojeva= sumaBrojeva+broj;




        }

        System.out.println("Suma brojeva je" + sumaBrojeva);

    }
}
