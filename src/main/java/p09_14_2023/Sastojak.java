package p09_14_2023;

public class Sastojak {
//    Kreirati klasu Sastojak koja ima:
//    naziv
//            cenu
//    gettere i settere
//            konstruktore
//    metodu za stampanje koja stampa  podatke u formatu:
//    naziv - cena.din


    private String naziv;
    private int cena;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public Sastojak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public void setCena(int cena) {
        this.cena = cena;


    }
}
