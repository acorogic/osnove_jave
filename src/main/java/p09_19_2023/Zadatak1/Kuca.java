package p09_19_2023.Zadatak1;

public class Kuca  extends Objekat{

    private int stanari;

    public Kuca(int stanari) {
        this.stanari = stanari;
    }

    public Kuca(String adresa, int povsinaObjekta, int zona, int stanari) {
        super(adresa, povsinaObjekta, zona);
        this.stanari = stanari;
    }

    public int getStanari() {
        return stanari;
    }

    public void setStanari(int stanari) {
        this.stanari = stanari;
    }

    @Override
    public double porez() {
        return this.povsinaObjekta*koeficient();
    }

    @Override
    public void stampaj() {
        System.out.println("ova kuca puna srece"+ "ima povrsinu:"+ this.povsinaObjekta+ " i nalazi se na adresi: + "+ this.adresa);
        System.out.println("Zona je" + this.zona+ "broj stanara u kuci je:" + this.stanari);

    }
}
