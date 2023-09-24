package d09_19_2023.Zadatak2;

public abstract class Planinar {
    private int idBroj;
    private  String imePrezime;

    public Planinar(int idBroj, String imePrezime) {
        this.idBroj = idBroj;
        this.imePrezime = imePrezime;
    }

    public int getIdBroj() {
        return idBroj;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public  abstract void stampaj();

    public abstract int clanarina();

    public abstract boolean uspesanUspon (Planina planina);


}
