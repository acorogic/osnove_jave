package p08_15_2023;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napisati program koji na ekranu stampa podatke u formatu:
//        Sifra [SIFRA PROIZVODA]
//[NAZIV PROIZVODA]  - $[CENA] - Popust [POPUST]%
//[BOJA], [VELICINA Svaku informaciju za proizvod je potrebno cuvati u okviru zasebne promenljive.
//              Primer izvrsenja:
//        Sifra x932k20
//        Nike Patike - $90 - Popust 13.5%
//                Crna, 46.5
int sifraProizvoda =125468744;
String nazivProizvoda= "hdd sdd  xxdrive";
int cena= 50;
int popust= 30;
String boja= "white";
String velicina= "2,5 inch";
        System.out.println("sifra" + sifraProizvoda);
        System.out.println(nazivProizvoda+ "-"+ cena+"$"+ "-"+ popust + "%");
        System.out.println(boja+ ","+ velicina);




    }
}
