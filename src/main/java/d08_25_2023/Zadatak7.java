package d08_25_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//        Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
//        U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
//
//                Ako se proslede brojevi 4,6,1 u poziv metode, metoda vraca 1
//        Ako se proslede brojevi 4,6,33 u poziv metode, metoda vraca 4
        Scanner s = new Scanner(System.in);
        System.out.println("unesite prvi broj");
        int broj1= s.nextInt();
        System.out.println("unesite drugi broj");
        int broj2= s.nextInt();
        System.out.println("unesite treci broj");
        int broj3= s.nextInt();

        System.out.println("najmanji broj je " + najmanjiBroj(broj1, broj2, broj3));

    }
    public static int najmanjiBroj (int a, int b, int c)
    {
       int najmanjiBroj;
        if(a < b && a < c)
        {najmanjiBroj=a;}

        else if (b<a && b < c)
        {najmanjiBroj=b;}

        else {najmanjiBroj= c;}
        return najmanjiBroj;

}}
