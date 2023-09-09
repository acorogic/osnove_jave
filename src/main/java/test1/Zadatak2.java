package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napišite program koji vrši validaciju udaljenosti između dalekovoda kako bi se utvrdilo da
//        li udaljenosti ispunjavaju propisane standarde Evropske unije.
//
//        Korisnik unosi udaljenosti između dalekovoda, a te informacije program smešta u niz brojeva.
//                Korisnik unosi N udaljenosti dalekovoda, gde je N unos korisnika.
//
//        Nakon unosa udaljenosti, program će prikazati grafički prikaz udaljenosti između svaka dva dalekovoda.
//                Zatim, program proverava da li rastojanje između dva dalekovoda ispunjava standarde, pri čemu
//        standardi za udaljenosti između dalekovoda važe ako su udaljenosti unutar opsega od 50 do 100 metara.
//            Ukoliko neka udaljenost ne ispunjava ove standarde, korisniku će se prikazati poruka o neispravnoj udaljenosti.
//
//                Na kraju izvršenja programa, program će izračunati ukupnu dužinu kablova potrebnu za celu
//        dalekovodnu infrastrukturu. Dužina kabla između dva dalekovoda iznosi 1.5 puta udaljenost između dalekovoda.
//
//        Primer izvršenja:
//        Unesite N: 5
//        Unesite rastojanje: 60
//        Unesite rastojanje: 66
//        Unesite rastojanje: 55
//        Unesite rastojanje: 105
//        Unesite rastojanje: 35
//
//                | …60m… | … 66m… | …55m… | …105m… | …35m… |
//
//        Rastojanje na poziciji 3, dužine 105m nije po standardima Evropske unije.
//        Rastojanje na poziciji 4, dužine 35m nije po standardima Evropske unije.
//
//        Potrebna dužina kablova za dalekovodnu infrastrukturu je 481.5m.

        Scanner s = new Scanner(System.in);
        System.out.println("unesite broj n");
        int n= s.nextInt();

        ArrayList <Integer> udaljenostDalekovoda = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("unesite udaljenost ");
            int udaljenost= s.nextInt();
            udaljenostDalekovoda.add(i, udaljenost);

        }
        System.out.println("|");
        for (int i = 0; i < n; i++) {
            System.out.println("..." + udaljenostDalekovoda.get(i)+ "m...|");

        }
double neophodnaDuzinakablova=0;


        for (int i = 0; i < udaljenostDalekovoda.size(); i++) {
            int udaljenost= udaljenostDalekovoda.get(i);
            if (udaljenost<50 || udaljenost>100) {
                System.out.println("rastojanje na pozizciji " +i + "duzine" + udaljenost+ "nije po pravilima eu");

        }
 neophodnaDuzinakablova= neophodnaDuzinakablova+udaljenost*1.5;}
            System.out.println(" Potrebna dužina kablova za dalekovodnu infrastrukturu je" + neophodnaDuzinakablova);

}}
