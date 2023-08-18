package p08_18_2023;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {


//        Napisati program koji ucitava broj a i ispisuje poruke:
//        Ukoliko je broj a do 10 stampamo da je jednocifren broj
//        Ukoliko je broj a do 100 stampamo da je dvocifren broj
//        Ukoliko je broj a veci od 100 stampamo da je trocifren.


        Scanner s= new Scanner(System.in);
        System.out.println("Uneti broj a:  ");
        int a= s.nextInt();

        if (a<10) {
            System.out.println("uneti broj" + a+ " je jednocifren");
        }
         else if  ((a >= 10) && (a<100)) {
            System.out.println("uneti broj" + a +" je dvocifren");

        }

        else if ((a>= 100) && (a<1000)) {System.out.println("uneti broj" + a+ " je trocifren");

        }
    }
}
