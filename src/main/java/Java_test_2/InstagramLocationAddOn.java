package Java_test_2;

public class InstagramLocationAddOn extends InstagramAddOn {


    private String nazivLokacije;

    public InstagramLocationAddOn(int koordinataX, int getKoordinataY, int visina, int sirina, String nazivLokacije) {
        super(koordinataX, getKoordinataY, visina, sirina);
        this.nazivLokacije = nazivLokacije;
    }

    public String getNazivLokacije() {
        return nazivLokacije;
    }

    public void setNazivLokacije(String nazivLokacije) {
        this.nazivLokacije = nazivLokacije;
    }

    @Override
    public int minSirina() {
        return 100;
    }

    @Override
    public int minVisina() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("["+ this.getKoordinataX()+ this.getGetKoordinataY()+ "("+ this.minVisina()+ " "+ this.minSirina()+ ")"+ this.nazivLokacije);

    }
}
