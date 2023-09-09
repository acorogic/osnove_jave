package d09_07_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Zadatak 2: Kreiranje klase "Automobil"
//        Napišite klasu "Automobil" sa atributima: marka (String), model (String) i
//    godinaProizvodnje (int). U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite
//        im vrednosti. Ispisati informacije o automobilima.

Automobil auto1= new Automobil();
auto1.marka= "mercedes";
auto1.model="s600";
auto1.godinaProizvodnje= 2001;

        Automobil auto2= new Automobil();
        auto2.marka= "fiat";
        auto2.model="tipo";
        auto2.godinaProizvodnje= 2004;

        Automobil auto3= new Automobil();
        auto3.marka= "vw";
        auto3.model="polo";
        auto3.godinaProizvodnje= 2008;

        System.out.println( "Auto marke " + auto1.marka+ " i modela " + auto1.model+ " je proizveden "+ auto1.godinaProizvodnje + " godine");
        System.out.println( "Auto marke " + auto2.marka+ " i modela " + auto2.model+ " je proizveden "+ auto2.godinaProizvodnje + " godine");
        System.out.println( "Auto marke " + auto3.marka+ " i modela " + auto3.model+ " je proizveden "+ auto3.godinaProizvodnje + " godine");


    }

}
