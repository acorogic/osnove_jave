package Java_test_2;

public abstract class InstagramAddOn {
    private int id;
    private int koordinataX;
    private int getKoordinataY;

    private int visina;
    private int sirina;

    public InstagramAddOn(int koordinataX, int getKoordinataY, int visina, int sirina) {
        this.koordinataX = koordinataX;
        this.getKoordinataY = getKoordinataY;
        this.visina = visina;
        this.sirina = sirina;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public int getKoordinataX() {
        return koordinataX;
    }

    public int getGetKoordinataY() {
        return getKoordinataY;
    }

    public int getVisina() {
        return visina;
    }

    public int getSirina() {
        return sirina;
    }

    public abstract int minSirina ();

    public abstract int minVisina();

    public void povecajDimenzije(int novaVisina, int novaSirina) {
        int visina=this.visina;
        int sirina=this.sirina;

        visina=visina+novaVisina;
        sirina=sirina+novaSirina;
    }

    public void smanjiDimenzije(int novaVisina, int novaSirina) {
        int visina= this.visina;
        int sirina=this.sirina;

        visina=visina-novaVisina;
        sirina=sirina-novaSirina;
    }

    public abstract void stampaj();

}
