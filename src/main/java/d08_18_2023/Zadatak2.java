package d08_18_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji simulira stampanje ocitane licne karte u vise primeraka.
//                Korisnik unosi podatke :
//        ime
//                prezime
//        jmbg
//        broj primeraka za stampu
//        Primer izvrsenja:
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite jmbg: 2109238932232
//        Unesite broj primeraka za stampu: 3
//
//        Primerak 1
//                **********************************
//        Ime i prezime: Milan Jovanovic
//        JMBG: 2109238932232
//                **********************************
//
//        Primerak 2
//                **********************************
//        Ime i prezime: Milan Jovanovic
//        JMBG: 2109238932232
//                **********************************
        Scanner s= new Scanner(System.in);
        System.out.println("Unesite Vase ime");
        String ime= s.next();
        System.out.println("Unesite Vase prezime");
        String prezime= s.next();
        System.out.println("Unesite JMBG");
        int jmbg= s.nextInt();
        System.out.println("Unesite broj primeraka za stampu");
        int brojKopija= s.nextInt();

        for (int i = 1; i <=brojKopija; i++) {
            System.out.println("Primerak"+ " "+ i );
            System.out.println("*******************");
            System.out.println("Ime i prezime: "+ ime+ " " + prezime);
            System.out.println("JMBG: " + jmbg);
            System.out.println("*******************");

        }


    }
}
