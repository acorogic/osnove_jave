package p08_17_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati program koji ucitava brojeve a, b i c sa tastature i za svaki broj proverava da li je validan. Ukoliko je broj nije validan, ispisuje se greska za svaki broj.
//                Broj nije validan ukoliko je broj negativan.
//        Primer izvrsenja 1:
//        Unesite a: 10
//        Unesite b: -22
//        Unesite c: -4
//        Unet broj B=-22 nije validan
//        Unet broj C=-4 nije validan
//
//        Primer izvrsenja 2:
//        Unesite a: -10
//        Unesite b: -22
//        Unesite c: 4
//        Unet broj A=-10 nije validan
//        Unet broj C=-4 nije validan

        Scanner s = new Scanner(System.in);
        System.out.println("Uneti broj a  ");
        int a = s.nextInt();
        System.out.println("Uneti broj b  ");
        int b = s.nextInt();
        System.out.println("Uneti broj c  ");
        int c = s.nextInt();
         if (a<0)  {
            System.out.println("Broj a=" + a + " nije validan");
        }
        if (b<0) {
            System.out.println("Broj b=" + b + " nije validan");
        }
        if (c<0) {
            System.out.println("Broj c=" + c + " nije validan");
        }
    }
}
