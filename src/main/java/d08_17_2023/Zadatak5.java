package d08_17_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
//        (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu
//        odgovarajuci zbir, razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.
//                Primer 1:                                              Primer 2:
//        Unestite a: 6                                        Unestite a: 6
//        Unesite b: 3                                         Unesite b: 3
//        Unesite operator: +                             Unesite operator: /
//        Rezultat: 9                                           Rezultat: 2

        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("uneti vrednost a: ");
        double a = s.nextDouble();
        System.out.print("uneti vrednost b: ");
        double b = s.nextDouble();
        System.out.print("izaberite racunsku operaciju koristeci jedan od ponudjenih znakova (+,-,*,/):");
        String operacija = s.next();
        double c = a + b;
        double d = a - b;
        double e = a * b;
        double f = a / b;

        if (operacija.equals("+")) {
            System.out.println("Rezultat: " + c);
        }
        if (operacija.equals("-")) {
            System.out.println("Rezultat: " + d);
        }
        if (operacija.equals("*")) {
            System.out.println("Rezultat: " + e);
        }
        if (operacija.equals("/")) {
            System.out.println("Rezultat: " + f);
        }
        System.out.println("Program je zavrsen, hvala na paznji");
    }
}
