package p08_24_2023;

import java.util.ArrayList;

public class Zadatak1 {

//    1.Zadatak
//    Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i prikazuje sumu nultog i zadnjeg elementa tog niza.

    public static void main(String[] args) {
//
        ArrayList<Integer> brojevi = new ArrayList<>();

        brojevi.add(5);
        brojevi.add(10);
        brojevi.add(20);
        brojevi.add(25);
        brojevi.add(1);

        int zadnjiClanUnizu= brojevi.size()-1;
        System.out.println(zadnjiClanUnizu);


        int suma = brojevi.get(0) + brojevi.get(zadnjiClanUnizu);

        System.out.println("suma prvog i zadnjeg broja u nizu je " + suma);


    }
}
