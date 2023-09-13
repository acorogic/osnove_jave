package d09_12_2023;

public class Zadatak3 {
    public static void main(String[] args) {
        Racun racun1 = new Racun("1233332", "zika todorovic", 10000);
        Racun racun2 = new Racun("334444", "jovan jovanovic", 5000);

        Transakcija transakcija1 = new Transakcija(12233, racun1, racun2);

        transakcija1.izvrsiTransakciju(10000);
        transakcija1.stampaj();
        racun1.stampaj();
        racun2.stampaj();

    }
    }
