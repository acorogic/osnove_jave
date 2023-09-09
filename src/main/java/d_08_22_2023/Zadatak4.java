package d_08_22_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu bar dve dvojke ili tri jedinice.
//                Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner s = new Scanner(System.in);
        int sumaJedinica = 0;
        int sumaDvojki = 0;
        boolean terminate = false;
        while (!terminate) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();


            if (broj == 2) {
                sumaDvojki++;
            } else if (broj == 1) {
                sumaJedinica++;
            }

            if (sumaDvojki == 2) {
                terminate = true;
                System.out.println("Kraj jer je uneto dve dvojke");
            } else if (sumaJedinica == 3) {
                terminate = true;
                System.out.println("Kraj jer je uneto tri jedinice");

            }
        }

    }
}

