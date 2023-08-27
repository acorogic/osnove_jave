package d08_24_2023;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        5. Napisati program koji ucitava niz A duzine N i broj X.
//                Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: 1, 3
//
//        Kako bi bolje razumeli sta je ideja u ovom zadatku, upoznajte se sa status kodovima.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj N");
        int n = s.nextInt();
        ArrayList<Integer> brojevi = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite broj");
            int broj = s.nextInt();
            brojevi.add(i, broj);
        }
        System.out.println("uneti broj x");
        int brojX = s.nextInt();

        String istiBrojevi = " ";
        for (int i = 0; i < brojevi.size(); i++) {
            if (brojevi.get(i) == brojX) {
                istiBrojevi = istiBrojevi + i + ", ";
            }

        }
        System.out.println("Elementi niza A koji su jednaki broju X imaju indekse" + istiBrojevi);
    }
}

