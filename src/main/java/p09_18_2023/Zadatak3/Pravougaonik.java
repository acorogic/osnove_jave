package p09_18_2023.Zadatak3;

public class Pravougaonik extends Figura {

    private int stranicaA;
    private int stranicaB;

    public Pravougaonik(int stranicaA, int stranicaB) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
    }

    @Override
    public double povrsina() {

        double povrsina= stranicaA*stranicaB;
        return povrsina;
    }

    @Override
    public double obim() {
        double obim= 2* stranicaA+ 2*stranicaB;
        return obim;
    }
}
