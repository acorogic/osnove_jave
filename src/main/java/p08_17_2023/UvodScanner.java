package p08_17_2023;

import java.util.Scanner;

public class UvodScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("unesite broj a ");
        int a = s.nextInt();
        System.out.println("unesite broj b ");
        int b= s.nextInt();

        System.out.println("unos drugih promeljivih");
        System.out.println("unesi ime ");
        String ime = s.next();
        System.out.println("kraj");
        System.out.println("nije kraj");

        s.close();


    }
}
