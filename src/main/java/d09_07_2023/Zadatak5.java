package d09_07_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Zadatak 5: Kreiranje klase "Oprema"
//        Napišite klasu "Oprema" sa atributima: tip (String),
//                marka (String) i cena (double). U glavnoj metodi kreirajte 3
//        objekta ove klase i postavite im vrednosti unosom sa tasture. Ispisati informacije o opremi

        Scanner s = new Scanner(System.in);

        Oprema oprema1= new Oprema();

        System.out.println("Unesite tip opreme");
        oprema1.tip= s.next();


        System.out.println("Unesite marku opreme");
        oprema1.marka= s.next();

        System.out.println("Unesite cenu opreme");
        oprema1.cena= s.nextDouble();


        Oprema oprema2= new Oprema();

        System.out.println("Unesite tip opreme");
        oprema2.tip= s.next();


        System.out.println("Unesite marku opreme");
        oprema2.marka= s.next();

        System.out.println("Unesite cenu opreme");
        oprema2.cena= s.nextDouble();

        Oprema oprema3= new Oprema();

        System.out.println("Unesite tip opreme");
        oprema3.tip= s.next();


        System.out.println("Unesite marku opreme");
        oprema3.marka= s.next();

        System.out.println("Unesite cenu opreme");
        oprema3.cena= s.nextDouble();


        System.out.println(oprema1.tip+ " " + "oprema 1, brenda "+ oprema1.marka+ " kosta " + oprema1.cena+ "dinara.");
        System.out.println(oprema2.tip+ " " + "oprema 2, brenda "+ oprema2.marka+ " kosta " + oprema2.cena+ "dinara.");
        System.out.println(oprema3.tip+ " " + "oprema 3, brenda "+ oprema3.marka+ " kosta " + oprema3.cena+ "dinara.");



    }
}
