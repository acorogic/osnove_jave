package p09_15_2023;

public class Nasledjivanje {
    public static void main(String[] args) {

        Auto auto1= new Auto();
        auto1.setRegistracija("ue 666");
        auto1.setBrojVrata(5);
        auto1.setBrzina(190);
        auto1.setMarka("mecka");

        Kamion kamion1=new Kamion();
        kamion1.setRegistracija("bg 011");
        kamion1.setNosivost(22000);
        kamion1.setBrzina(100);
        kamion1.setMarka("volvo");
        kamion1.dodajgas();
auto1.stampaj();
    }
}
