package d09_12_2023;

public class Zadatak1 {
    public static void main(String[] args) {
        FizickoLice lice1= new FizickoLice("pera peric", 12345, 4455, true);
        FizickoLice lice2= new FizickoLice("zika zikic", 45644, 755, false);

        Ugovor noviUgovor= new Ugovor("23.3.2044" , lice1, lice2, 20000, "fruskogorska 45");
        noviUgovor.stampaj();

    }
}
