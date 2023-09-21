package d09_19_2023.Zadatak1;

public class Tetrapak extends Ambalaza{
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean recycle;
 private int osnovnaCena;

    }

    public Tetrapak(String barkod, String artikal, int netoTezina, int brutoTezina, boolean recycle, int osnovnaCena) {
        super(barkod, artikal, netoTezina, brutoTezina);
        this.recycle = recycle;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena;

        if (this.recycle) {
            cena = this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        } else {
            cena = this.osnovnaCena;
        }
return cena;}






    @Override
    public void stampaj() {System.out.println(this.artikal + this.osnovnaCena + this.netoTezina + this.brutoTezina + this.tezinaPakovanja() + this.recycle + this.cena());
        System.out.println("ukupna cena je: " + this.cena());

    }
}
