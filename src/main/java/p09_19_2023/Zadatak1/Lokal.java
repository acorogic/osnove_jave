package p09_19_2023.Zadatak1;

public class Lokal extends  Objekat {

    public Lokal() {
    }

    public Lokal(String adresa, int povsinaObjekta, int zona) {
        super(adresa, povsinaObjekta, zona);
    }

    @Override
    public double porez() {
        return this.povsinaObjekta*1.3;
    }

    @Override
    public void stampaj() {
        System.out.println("adresa lokala: " + this.adresa+ "povrsina lokala:" + this.povsinaObjekta);
        System.out.println("zona lokala je:" + this.zona);


    }
}
