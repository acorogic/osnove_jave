package d08_09_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati klasu Proizvod koja ima atribute
//        naziv proizvoda (String)
//                cenu proizvoda (double)
//        težinu proizvoda u gramima. (double)
//                i metode:
//        stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//                Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//                vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//        a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena.
//        Smatrati da je parametar popust u opsegu od 0 do 100.
//        racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe.
//        Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:
//        za tezinu do 100g, postarina iznosi 200din
//        za tezinu od 101g do 500g, postarina iznosi 400din
//        za tezinu preko 500g, postarina iznosi 1000din
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

        Proizvod artikal1= new Proizvod();
        artikal1.nazivProzivoda= "sok od paradjza";
        artikal1.cenaProzivoda= 100;
        artikal1.tezinaProzivodaG=1000;
        artikal1.stampaj();

        Proizvod artikal2= new Proizvod();
        artikal2.nazivProzivoda= "kafa";
        artikal2.cenaProzivoda= 200;
        artikal2.tezinaProzivodaG=100;
        artikal2.stampaj();

        artikal1.povecajCenu(10);
        artikal1.povecajCenu(10);

        artikal2.povecajCenu(30);
        artikal2.povecajCenu(20);

        System.out.println("nova cena artikla " + artikal1.nazivProzivoda+ " je "+ artikal1.cenaProzivoda + "dinara");
        System.out.println("nova cena artikla " + artikal2.nazivProzivoda+ " je "+ artikal2.cenaProzivoda + "dinara");

        System.out.println("cena sa popustom je " + artikal1.vratiCenuSaPopustom(10));
        System.out.println("cena postarine je "+ artikal1.racunajPostarinu());

        System.out.println("cena sa popustom je " + artikal2.vratiCenuSaPopustom(25));
        System.out.println("cena postarine je "+ artikal2.racunajPostarinu());
    }
}
