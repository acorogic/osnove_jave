package d09_14_2023.Zadatak1;

import java.util.ArrayList;

public class Student {

//    Napisati klasu Student koja ima
//
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)

    private int brIndexa;

    private String imePrezime;

    private String tipStudija; //(osnovne, master, doktorske)


    private ArrayList<Ispit> ispiti = new ArrayList<>();

    public Student(int brIndexa, String imePrezime, String tipStudija) {
        this.brIndexa = brIndexa;
        this.imePrezime = imePrezime;
        this.tipStudija = tipStudija;

        this.ispiti = new ArrayList<>();
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }


    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    public void dodajIspit(Ispit noviIspit) {
        this.ispiti.add(noviIspit);

    }


    public double srednjaOcena() {


        int sumaOcena = 0;
        int brojIspita = 0;

        for (int i = 0; i < ispiti.size(); i++)
            if (ispiti.get(i).polozenIspit()) {
                sumaOcena = sumaOcena + ispiti.get(i).getOcena();
                brojIspita = brojIspita + 1;
            }
        return 1.0 * sumaOcena / brojIspita;
    }


    public void stampajSrednjuOcenu() {
        System.out.println("srednja ocena je: " + this.srednjaOcena());


    }

}


