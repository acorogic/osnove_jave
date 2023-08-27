package d08_24_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        .Zadatak
//        Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A
//        stampa sve elemente niza koji su veci od nule.
//        Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: -4
//        Unesite broj: 3
//        Unesite broj: -7
//        Unesite broj: 9
//
//        Brojevi veci od nule u nizu A su: 1, 3, 9,


        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int n = s.nextInt();
        ArrayList<Integer> brojevi = new ArrayList<>();
        ArrayList<Integer> brojeviManjiod0 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            brojevi.add(i, broj);

            if (broj < 0) {
                //System.out.println("broj manji od mule je" + broj);
                brojeviManjiod0.add(i, broj);
            }

        }
        System.out.print("Brojevi manji od nule u nizu su sledeci: ");
        for (int i = 0; i < brojeviManjiod0.size(); i++) {
            System.out.print(brojeviManjiod0.get(i) + " ");

        }

        System.out.println("kraj programa");
    }
}
