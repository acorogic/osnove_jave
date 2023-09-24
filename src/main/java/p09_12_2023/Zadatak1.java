package p09_12_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        ClanskaKarta ck1 = new ClanskaKarta(10,2566);

        Kupac kupac1= new Kupac("mika mikic", ck1);

       Proizvod prozivod1= new Proizvod("grand kafa");
prozivod1.setCenaIzradeProzivoda(100);
       prozivod1.setKupacArtikla(kupac1);

ClanskaKarta k= kupac1.getClanskaKartaKupca();
        System.out.println(kupac1.getClanskaKartaKupca().getPopust()); ///chainovanje
prozivod1.stampaj();
    }
}
