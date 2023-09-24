package p09_15_2023.Zadatak2;

public class PlatnaKartica {
    protected double suma;
    protected int brojKartice;
    protected int godinaVazenja;
    protected int mesecVazenja;

    public PlatnaKartica(int suma, int brojKartice, int godinaVazenja, int mesecVazenja) {
        this.suma = suma;
        this.brojKartice = brojKartice;
        this.godinaVazenja = godinaVazenja;
        this.mesecVazenja = mesecVazenja;
    }

    public double getSuma() {
        return suma;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public int getGodinaVazenja() {
        return godinaVazenja;
    }

    public int getMesecVazenja() {
        return mesecVazenja;
    }

    public void dodajSredstva(int kolicinaNovca){
        this.suma=this.suma+kolicinaNovca;
    }
public void izvrsiTransakciju(int kolicinaNovca)
{ this.suma=this.suma-kolicinaNovca;}

    public void stampaj() {
        System.out.println(this.brojKartice + "," + this.mesecVazenja+ "/" + this.godinaVazenja + " , " + this.suma+ "$");
    }
}
