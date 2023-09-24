package p09_15_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {
PlatnaKartica kartica1= new PlatnaKartica(678, 1344343434, 2024, 12);
//kartica1.stampaj();


VisaKartica visa1= new VisaKartica(100, 123332, 2025, 3, "mika peric");
visa1.izvrsiTransakciju(10);
visa1.izvrsiTransakciju(10);
visa1.stampaj();
visa1.stampaj();
    }
}
