package p21_08_2023;

import java.util.Scanner;

public class Zadatak6 {

    //    (ZA VEZBANJE)Napisati program koji od korisnika ucitava N
//    jednocifrenih brojeva i od njih formira rezultujuci broj kao na primeru
//    Unesite N: 5
//    Unesite broj: 1
//    Unesite broj: 2
//    Unesite broj: 0
//    Unesite broj: 4
//    Unesite broj: 1
//    Rezultujuci broj je 12041 (Promenljiva tipa int)
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.println("Unesite broj N");
        int brojClanovaNiza= s.nextInt();
        int brojeviZaStampu=0;
        for (int i = 0; i < brojClanovaNiza; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            brojeviZaStampu=brojeviZaStampu+i*1; //a*10 +b = niz za stampanje



        }
        //System.out.println( "rezultujuci broj je"+ niz);
    }





}
