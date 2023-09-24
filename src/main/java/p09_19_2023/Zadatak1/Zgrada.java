package p09_19_2023.Zadatak1;

public class Zgrada extends Objekat {

    private int brojStanova;

    public Zgrada(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    public Zgrada(String adresa, int povsinaObjekta, int zona, int brojStanova) {
        super(adresa, povsinaObjekta, zona);
        this.brojStanova = brojStanova;
    }

    public int getBrojStanova() {
        return brojStanova;
    }

    public void setBrojStanova(int brojStanova) {
        this.brojStanova = brojStanova;
    }

    @Override
    public double porez() {
        return this.povsinaObjekta * this.brojStanova * this.koeficient();
    }

    @Override
    public void stampaj() {
        System.out.println("Adresa zgrade je:" + this.adresa + "povrsina zgrade je:" + this.povsinaObjekta);
        System.out.println("broj stanova u zgradi je:" + this.brojStanova);
        System.out.println("zona je:" + this.zona);

    }

//    Kreirati klasu Zgrada koja nasledjuje klasu Objekat koja ima
//    broj stanova
//    konstuktore, gettere i setter
//    porez racuna po formuli koeficijent * povrsina * broj stanova
//    prepisati metodu stampaj tako da stampa sve podatke vezane za zgradu


}
