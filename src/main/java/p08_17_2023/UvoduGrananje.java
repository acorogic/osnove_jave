package p08_17_2023;

import java.util.Scanner;

public class UvoduGrananje {
    public static void main(String[] args) {

        System.out.println("pocetak");

        Scanner s = new Scanner(System.in);

        System.out.println("unesite broj a  ");
        int a= s.nextInt();

        System.out.println("unesite broj b");
        int b= s.nextInt();

        if (b<a)
        {System.out.println(b + "   je manje od  " + a);}



        System.out.println("kraj");


    }
}
