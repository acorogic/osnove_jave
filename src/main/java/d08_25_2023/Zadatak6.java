package d08_25_2023;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
//        Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//        Primer izvrsenja:
//        izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//        izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1


        Scanner s = new Scanner(System.in);
        System.out.println("unesite prvu vrednost ");
        int broj1= s.nextInt();
        System.out.println("unesite drugu vrednost ");
        int broj2= s.nextInt();
        System.out.println ("Broj celih brojeva izmedju " + broj1 + " i " + broj2 + " je: " + brojac(broj1, broj2));
    }
    public static int brojac (int m, int n) {
        
int brojac=0;

if (m<=n) {
    for (int i = m; i < n-1; i++)
brojac++;}

    else {
        for (int i = n; i <m-1 ; i++) {
            brojac++;
        }
    }

return brojac;

}}
