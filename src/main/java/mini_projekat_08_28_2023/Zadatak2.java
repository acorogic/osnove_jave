package mini_projekat_08_28_2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Zadatak2 {
    public static void main(String[] args) {

//
//        **Zadatak: Simulacija iscrtavanja korisnika na Slacku**
//
//        Napišite program koji simulira prikazivanje korisnika na Slacku.
//        Prikaz korisnika treba da se izvede tako da prvo budu prikazani aktivni korisnici, a potom neaktivni.
//        Program će čuvati sledeće informacije:
//        Niz korisnika - u ovom nizu će biti sačuvani svi korisnici koji imaju pristup Slacku.
//                Niz aktivnosti - svaki korisnik će biti označen kao aktivan ili neaktivan.
//                Informacije o aktivnostima biće čuvane u nizu gde će za svakog korisnika biti zabeleženo da li je
//                trenutno aktivan ili ne  (true ili false).. Naravno, korisnik i njegova aktivnost će biti upareni po istom indeksu.
//                To znači da će se za korisnika na poziciji N u nizu "korisnici" čitati aktivnost sa pozicije N u nizu "aktivnosti".
//
//                Program će ispisivati informacije za svakog korisnika na sledeći način:
//        Za aktivne korisnike:
//  | slika |o Ime Prezime
//        Za neaktivne korisnike:
//  | slika |x Ime Prezime
//
//        Na primer, ako je niz korisnika:
//        Pera Peric
//        Darko Darkovic
//        Marko Markovic
//        Stefan Stefanovic
//        Uros Urosevic
//        Milan Milanovic
//
//        I ako su aktivnosti korisnika:
//
//        true
//        false
//        true
//        true
//        false
//        true
//
//        Program treba da ispiše:
//
//| slika |o Pera Peric
//| slika |o Marko Markovic
//| slika |o Stefan Stefanovic
//| slika |o Milan Milanovic
//| slika |x Darko Darkovic
//| slika |x Uros Urosevic

        ArrayList<String> korisnici = new ArrayList<>();
        korisnici.add("Mika Mikic");
        korisnici.add("Pera Peric");
        korisnici.add("Zika Zikic");
        korisnici.add("Toma Tomic");
        korisnici.add("Lepa Lepic");


        ArrayList<Boolean> aktivni = new ArrayList<>();
        aktivni.add(true);
        aktivni.add(false);
        aktivni.add(false);
        aktivni.add(true);
        aktivni.add(false);

        ArrayList<String> konverzijaBoooleanUstring = new ArrayList<>();
        for (int i = 0; i < korisnici.size(); i++) {

            Boolean korisniciAktivnostStampa = aktivni.get(i);
            if (korisniciAktivnostStampa) {
                konverzijaBoooleanUstring.add("|o");
            } else {
                konverzijaBoooleanUstring.add("|x");
            }


        }
        ArrayList<String> zdruzenaListaZaSortiranje = new ArrayList<>();
        for (int i = 0; i < korisnici.size(); i++) {
            String korisniciStampa = korisnici.get(i);
            String aktivnostDa_Ne = konverzijaBoooleanUstring.get(i);
            zdruzenaListaZaSortiranje.add(aktivnostDa_Ne + " " + korisniciStampa);

        }
        Collections.sort(zdruzenaListaZaSortiranje);


        for (int i = 0; i < zdruzenaListaZaSortiranje.size(); i++) {
            String sredjenNiz = zdruzenaListaZaSortiranje.get(i);
            System.out.println("slika" + sredjenNiz);

        }


    }
}



