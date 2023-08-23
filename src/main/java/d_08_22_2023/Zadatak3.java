package d_08_22_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ucitava RIMSKE brojeva od korisnika i na
//        ekranu ispisuje arapsku vrednost sve dok korisnik ne unese KRAJ..
//
//        Primer izvrsenja:
//        Unesite rimski broj: X
//        Arapski: 10
//        Unesite rimski broj: C
//        Arapski: 50
//        Unesite rimski broj: D
//        Arapski: 500
//        Unesite rimski broj: M
//        Arapski: 1000
//        Unesite rimski broj: I
//        Arapski: 1

//       Unesite rimski broj: KRAJ
//        Kraj programa.


        System.out.println("Program rimsko arapski konvertor brojeva X C D M I V L");
        Scanner s = new Scanner(System.in);
        boolean terminate = false;
        while (!terminate) {
            System.out.println("Unesite rimski broj : ");
            String romanNumber = s.next();
            if (romanNumber.equals("kraj")) {
                terminate = true;
            } else if (romanNumber.equals("X")) {
                System.out.println("Arapski broj je 10");
            } else if (romanNumber.equals("C")) {
                System.out.println("Arapski broj je 100");
            } else if (romanNumber.equals("D")) {
                System.out.println("Arapski broj je 500");
            } else if (romanNumber.equals("M")) {
                System.out.println("Arapski broj je 1000");
            } else if (romanNumber.equals("I")) {
                System.out.println("Arapski broj je 1");
            } else if (romanNumber.equals("V")) {
                System.out.println("Arapski broj je 5");
            } else if (romanNumber.equals("L")) {
                System.out.println("Arapski broj je 50");
            }


        }
        System.out.println("kraj programa");
    }
}
