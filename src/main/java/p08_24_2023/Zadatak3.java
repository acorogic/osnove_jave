package p08_24_2023;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {

//        3.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i koji zamenjuje vrednosti prvog (na poziciji nula) i zadnjeg elemnta niza.
//        Objasnjenje: Ako je niz 2,4,5,6,7 nakon izmene treba da bude 7,4,5,6,2
//        Napomena: U zadataku nakon kreiraanja niza, ne treba da se desi kod koji setuje fiksne vrednosti u niz.

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        int prviClanNiza= numbers.get(0);

        int poslednjiClanNizaIndex= numbers.size()-1;

        int poslednjiclanNiza= numbers.get(poslednjiClanNizaIndex);

        numbers.set(poslednjiClanNizaIndex,prviClanNiza);
        numbers.set(prviClanNiza, poslednjiclanNiza);
    }
}
