package p08_18_2023;

import java.util.Scanner;

public class Zadtatak10 {
    public static void main(String[] args) {



//    (Za vezbanje)
//    Napisati program koji stampa 20 pozicija.
//    Za aktivnu poziciju stampa *
//    Za neaktivnu pozciju stampa _
//    Korisnik unosi granice za nekativni opseg, unoseci A i B.
//    Primer izvrsenja:
//    Unesite a: 5
//    Unesite b: 10
//            * * * * _ _ _ _ _ _ * * * * * * * * * *
//    Objasnjenje: stampamo _ od 5 do 10 u ostalim situacijama stampamo *

        Scanner s = new Scanner(System.in);
        System.out.println("unesite a");
        int a= s.nextInt();

        System.out.println("unesite b");
        int b= s.nextInt();

        for (int i = 1; i <= 20; i++) {

            if (i>=a && i<=b) {
                System.out.print(" _ ");}
            else {
                System.out.print(" * ");

        }

}}}
