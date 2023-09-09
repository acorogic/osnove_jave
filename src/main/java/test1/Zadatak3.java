package test1;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        Napišite program koji simulira popularnu igricu "Veće-Manje".
//                Cilj igre je da korisnik pogodi tajni broj u što manje pokušaja.
//                Program će automatski izabrati nasumičan broj u opsegu od 1 do 50, a
//        korisniku će biti dozvoljeno da pokuša da pogodi taj broj najviše 5 puta. Nakon svakog pokušaja,
//                korisnik će dobiti povratnu informaciju da li je uneti broj manji ili veći od tajnog broja.
//                Igra će trajati sve dok korisnik ne pogodi tajni broj ili dok ne iskoristi sve pokušaje.
//        Evo primera izvršenja programa za oba scenarija, prema vašem opisu:
//
//        Primer izvršenja kada je tajni broj 37:
//        Tajni broj je spreman, pokušajte da pogodite broj.
//                Unesite broj: 5
//        Tajni broj je veći.
//        Unesite broj: 20
//        Tajni broj je veći.
//        Unesite broj: 35
//        Tajni broj je veći.
//        Unesite broj: 37
//        Čestitamo, pogodili ste tajni broj!
//
//
//                Primer izvršenja kada je tajni broj 37, ali igrač nije uspeo da ga pogodi u 5 pokušaja:
//        Tajni broj je spreman, pokušajte da pogodite broj.
//                Unesite broj: 5
//        Tajni broj je veći.
//        Unesite broj: 20
//        Tajni broj je veći.
//        Unesite broj: 35
//        Tajni broj je veći.
//        Unesite broj: 48
//        Tajni broj je manji.
//        Unesite broj: 40
//        Tajni broj je manji.
//
//        Kraj igre! Niste pogodili tajni broj u 5 pokušaja.




//    generate random metoda
//
//    import java.util.Random;
//
//    class GenerateRandom {
//        public static void main( String args[] ) {
////        // Instance of random class
////        Random rand = new Random();
////        // Setting the upper bound to generate the
////        // random numbers in specific range
////        int upperbound = 25;
////        // Generating random values from 0 - 24
////        // using nextInt()
////        int int_random = rand.nextInt(upperbound);
////        // Generating random using nextDouble
////        // in 0.0 and 1.0 range
////        double double_random = rand.nextDouble();
////        // Generating random using nextDouble
////        // in 0.0 and 1.0 range
////        float float_random = rand.nextFloat();
////
////        // Printing the generated random numbers
////        System.out.println("Random integer value from 0 to" + (upperbound-1) + " : " + int_random);
////        System.out.println("Random float value between 0.0 and 1.0 : " + float_random);
////        System.out.println("Random double value between 0.0 and 1.0 : " + double_random);

        Scanner s =new Scanner(System.in);
        Random random= new Random();

        int generisaniBroj= random.nextInt(50) +1;
        int brojPokusaja=0;


        boolean terminate= false;

        while(!terminate) {
            System.out.println("unesite broj");
            int unetiBroj= s.nextInt();
            brojPokusaja= brojPokusaja+1;

            if (unetiBroj==generisaniBroj) {
                System.out.println("pogodili ste broj");
            terminate=true;}
            else if (unetiBroj<generisaniBroj) {
                System.out.println("Tajni broj je veci");}
            else if (unetiBroj<generisaniBroj) {
                System.out.println("tajni broj je manji");}

            if (brojPokusaja==5) {
                System.out.println("Kraj igre! Niste pogodili tajni broj u 5 pokušaja");
            terminate=true;}

            }

        }

        }

