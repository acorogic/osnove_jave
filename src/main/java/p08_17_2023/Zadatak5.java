package p08_17_2023;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        Napisati program koji ucitava brojeve a, b i c sa tastature i proverava da li je broj a u opsegu od b do c.
//                Primer izvrsenja:
//        Unesite b: 5
//        Uneiste c: 50
//        Unesite a: 15
//        A je u opsegu izmedju 5 i 50

        Scanner s = new Scanner(System.in);
        System.out.println("Uneti broj a  ");
        int a = s.nextInt();
        System.out.println("Uneti broj b  ");
        int b = s.nextInt();
        System.out.println("Uneti broj c  ");
        int c = s.nextInt();

        if (a < b &&  a > c)
        {
            System.out.println("A je u opsegu izmedju" + b + "i"+ c);
        }


    }
}
