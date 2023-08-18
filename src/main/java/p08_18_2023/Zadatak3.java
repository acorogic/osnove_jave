package p08_18_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napisati program koji ispisuje za uneti broj a da li je deljiv sa 2 ili sa 3.
//        Ispisati poruke na kraju programa u obe situacije.
//
//        Upoznajte se sa opertorom moduo % dok ne dodjemo do tog operatora.
//
//        HINT: Broj B je deljiv brojem A ukoliko je ostatak pri deljenju sa A jedan nuli.

        Scanner s = new Scanner(System.in);
        System.out.println("Uneti bilo koju celobrojnu vrednost");
        int a = s.nextInt();

        if (a % 3 == 0) {
            System.out.println("broj" + a + "   je deljiv sa tri");
        } else if (a % 2 == 0) {
            System.out.println("broj " + a + "je deljiv sa dva");



// moze da se spoji sa ili || -ispod back space dugmeta id odradi deljivost sa 2 ili 3 else nije deljiv sa 2 ili 3
        }


    }
}
