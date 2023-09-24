package p09_18_2023.Zadatak1;

public abstract class PlatnaKartica {
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

    public abstract void dodajSredstva();

    public abstract void izvrsiTransakciju(int kolicinaNovca);

    public abstract void izvrsiTransakciju();


    public void stampaj() {
        System.out.println(this.brojKartice + "," + this.mesecVazenja+ "/" + this.godinaVazenja + " , " + this.suma+ "$");
    }
}
