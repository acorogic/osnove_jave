package p22_08_2023;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak
//        Napisati program koji od korisnika ucitava brojeve sve dok ne unesu makar po jedan broj od 1 do 4.
//        Primer:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:2
//        Unesite broj:3
//        Unesite broj:0
//        Unesite broj:5
//        Unesite broj:3
//        Unesite broj:4
//        Kraj programa
//
//        Objasnjenje: Od svakih 1, 2, 3 i 4 je unet po jedan.
        Scanner s = new Scanner(System.in);
        System.out.println("uneti broj :");
        int broj;
        int  suma1 = 0;
        int  suma2 = 0;
        int  suma3 = 0;
        int  suma4 = 0;
//boolean dok je true while ide
        while (true) {
            System.out.println("unesite broj :");
            broj= s.nextInt();
            if (broj==1) {
                suma1++;} else if (broj==2) {
                suma2++;
            }
                //itd do 4
            }
        }

}
