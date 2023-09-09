package p08_25_2023;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//        7. Napisati metodu koja proverava da li je trougao pravougli.
//                Metoda prima stranice trougla i hipotenuzu trougla.
//        Ako je trougao pravougli onda vraca true, u suptrotnom vraca false.
//                Trougao je pravougli ukoliko je a*a+b*b=c*c

        Scanner s = new Scanner(System.in);
        System.out.println("unesite vrednost a");
        int a= s.nextInt();
        System.out.println("unesite vrednost b");
        int b=s.nextInt();
        System.out.println("unesite vrednost c");
        int c= s.nextInt();


    }
public static boolean trougaoJePravougli (int a, int b, int c) {
    boolean trougao= true;
        if ( (c*c) ==(a*a)+ (b*b)) {
           trougao=true;
            return trougao;
        }
        else {trougao=false;
        return trougao;}
}
//vracanje nije stampanje u metodi, metode rade ili jedno ili drugo
    //pre ulaska u if pretlju deklarisati promenljive
}
