package d09_19_2023.Zadatak1;

public abstract class Ambalaza {
//
//    Kreirati abstraktnu klasu Ambalaza koja ima:
//    barkod (primer: 328232-2823)
//    naziv artikla
//    neto tezinu
//    bruto tezinu
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu koja racuna tezinu pakovanja kao razliku bruto i neto tezine.
//    abstraktnu metodu koja vraca cenu artikla
//    abstraktnu metodu stampaj

    protected String barkod;
    protected String artikal;

    protected int netoTezina;
    protected int brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String artikal, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.artikal = artikal;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public Ambalaza(String barkod, String artikal) {
        this.barkod=barkod;
        this.artikal=artikal;
    }

    public String getBarkod() {
        return barkod;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public String getArtikal() {
        return artikal;
    }

    public void setArtikal(String artikal) {
        this.artikal = artikal;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }

    public int tezinaPakovanja(){
         return this.brutoTezina-this.netoTezina;

    }
    public abstract double cena();

    public abstract void stampaj();
}
