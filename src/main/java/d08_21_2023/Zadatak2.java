package d08_21_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve.
//                Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 32
//        Unesite broj: 121
//        Unesite broj: 1333
//        Unesite broj: 144
//        Suma je: 265

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int brojN= s.nextInt();
        int sumaTrocifernihBrojeva =0 ;

        for (int i = 0; i < brojN; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();

            if (broj >99 && broj <1000) { sumaTrocifernihBrojeva= sumaTrocifernihBrojeva+broj;}

        }
        System.out.println("suma trocifernih brojeva je : "+ sumaTrocifernihBrojeva);
    }
}
