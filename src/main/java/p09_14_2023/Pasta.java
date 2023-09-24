package p09_14_2023;

import java.util.ArrayList;

public class Pasta {
//    Kreirati klasu Pasta koja ima:
//    niz sastojaka
//    metodu za dodavanje sastojka
//    defaultni konstruktor
//    metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
//    metodu za stampu koja stampa podatke u formatu:
//    Pasta je sa sastojcima:
//    naziv - cena.din
//    naziv - cena.din
//    naziv - cena.din
//    Cena paste je cena.din

    private ArrayList<Sastojak> sastojci;

    public Pasta() {

        this.sastojci = new ArrayList<>();
    }

    public ArrayList<Sastojak> getSastojci() {
        return sastojci;
    }
public void dodajSastojak(Sastojak noviSastojak){
        this.sastojci.add(noviSastojak);
}
    public void stampaj (){
        System.out.println("Pasta je sa sastojcima:");
        for (int i = 0; i < sastojci.size(); i++) {
            System.out.print( this.sastojci.get(i).getNaziv() +" -");
            System.out.print(this.sastojci.get(i).getCena() +" ");
        }

    }

    public int cenaPaste(){
        int cenaPaste=0;
        for (int i = 0; i < sastojci.size(); i++) {
            cenaPaste=cenaPaste+ this.sastojci.get(i).getCena();


        }
        return cenaPaste;
    }

    public void brisanje(String nazivSastojka) {

        for (int i = 0; i < this.sastojci.size(); i++) {
            if (this.sastojci.get(i).getNaziv().equals(nazivSastojka)) {
                this.sastojci.remove(i);
            }

        }

    }
}
