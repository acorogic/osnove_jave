package p09_07_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Racun posiljalac = new Racun();
        posiljalac.brojRacuna="123";
        posiljalac.imeIprezime= "mika mikic";
        posiljalac.stanjeNaRacunu= (double) 1000.0;

        Racun primalac
                = new Racun();

        primalac.brojRacuna= "234";
        primalac.imeIprezime="pera peric";
        primalac.stanjeNaRacunu= 200.0;
        Double sumaZatranskaciju= (double) 500.0;

        double transkacija= posiljalac.stanjeNaRacunu-sumaZatranskaciju;
        double stanjePrimalac=primalac.stanjeNaRacunu+sumaZatranskaciju;
        System.out.println(stanjePrimalac);
    }
}
