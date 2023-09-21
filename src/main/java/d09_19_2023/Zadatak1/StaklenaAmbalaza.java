package d09_19_2023.Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{
//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.

private double kaucijaZaFlasu;

private boolean kaucijaPostoji;

private int osnovnaCena;

    public StaklenaAmbalaza( boolean kaucijaPostoji, int osnovnaCena) {
        this.kaucijaZaFlasu = 10.5;
        this.kaucijaPostoji = kaucijaPostoji;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String artikal,  boolean kaucijaPostoji, int osnovnaCena) {
        super(barkod, artikal);
        this.kaucijaZaFlasu = 10.5;
        this.kaucijaPostoji = kaucijaPostoji;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public void setKaucijaZaFlasu(double kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public boolean isKaucijaPostoji() {
        return kaucijaPostoji;
    }

    public void setKaucijaPostoji(boolean kaucijaPostoji) {
        this.kaucijaPostoji = kaucijaPostoji;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }



    @Override
    public double cena() {
        double cena;
        if (this.kaucijaPostoji) {cena= this.osnovnaCena*1.2+ this.kaucijaZaFlasu;
    }

        else {cena=this.osnovnaCena*1.2;}
        return cena;}

    @Override
    public void stampaj() {
        System.out.println("Artikal:"+ this.artikal+ "," +   "Cena: "+ this.osnovnaCena+ "," + "Kaucija postoji: " + this.kaucijaPostoji+ "," + "kaucija je: "+ this.kaucijaZaFlasu);
        System.out.println("ukupna cena je: " + this.cena());

    }
}
