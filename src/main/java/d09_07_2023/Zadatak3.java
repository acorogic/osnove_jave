package d09_07_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Kreiranje klase "Proizvod"
//        Napišite klasu "Proizvod" sa atributima: naziv (String) i cena (double).
//        U glavnoj metodi kreirajte 3 objekta ove klase i postavite im vrednosti.
//                Ispisati informacije o proizvodima

Proizvod proizvod1= new Proizvod();
proizvod1.naziv= "hleb";
proizvod1.cena= 49.99;


Proizvod proizvod2= new Proizvod();

proizvod2.naziv= "mleko";
proizvod2.cena=99.99;

Proizvod proizvod3= new Proizvod();
proizvod3.naziv= "toalet papir";
proizvod3.cena= 29.99;


        System.out.println("Artikal "+ proizvod1.naziv+ " "+ "ima cenu od "+ proizvod1.cena+ " dinara" );
        System.out.println("Artikal "+ proizvod2.naziv+ " "+ "ima cenu od "+ proizvod2.cena+ " dinara" );
        System.out.println("Artikal "+ proizvod3.naziv+ " "+ "ima cenu od "+ proizvod3.cena+ " dinara" );
    }
}
