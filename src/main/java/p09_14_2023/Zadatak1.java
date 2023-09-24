package p09_14_2023;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        Sastojak sastojak1= new Sastojak("so", 100);
        Sastojak sastojak2= new Sastojak("jaja", 20);
        Sastojak sastojkk3= new Sastojak("ulje", 200);


        Pasta fidelinka= new Pasta();
        fidelinka.dodajSastojak(sastojak1);
        fidelinka.dodajSastojak(sastojak2);
        fidelinka.dodajSastojak(sastojkk3);

        fidelinka.stampaj();
        System.out.println("cena paste je:"+ fidelinka.cenaPaste());
fidelinka.brisanje("jaja");
fidelinka.stampaj();
    }
}
