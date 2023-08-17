package p08_17_2023;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Zadatak
//        Napisati program koji ucitava stranice trougla a, b i c i ispisuje da li je trougao pravougli.
//        Trougao je pravougli ako je a2 + b2 = c2
//
//        Primer izvrsenja 1:
//        Unesite a: 3
//        Unesite b: 4
//        Unesite c: 5
//        Trougao je pravougli
//
//        Primer izvrsenja 2:
//        Unesite a: 3
//        Unesite b: 4
//        Unesite c: 6
//        Trougao nije pravougli

        System.out.println("Uneti broj a  ");
        int a = s.nextInt();
        System.out.println("Uneti broj b  ");
        int b = s.nextInt();
        System.out.println("Uneti broj c  ");
        int c = s.nextInt();


        if ((a*a) + (b*b)== (c*c)) {
            System.out.println("Trougao je pravougaoni");
        }
        else {
            System.out.println("Trougao nije pravougaoni");
        }
    }
}
