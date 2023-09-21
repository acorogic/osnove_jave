package d09_19_2023.Zadatak1;

public class SuperKartica {
    private int brojKartice;
    private String imePrezimevlasnika;
    private int popust;

    public SuperKartica(int brojKartice, String imePrezimevlasnika, int popust) {
        this.brojKartice = brojKartice;
        this.imePrezimevlasnika = imePrezimevlasnika;
        this.popust = popust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImePrezimevlasnika() {
        return imePrezimevlasnika;
    }

    public void setImePrezimevlasnika(String imePrezimevlasnika) {
        this.imePrezimevlasnika = imePrezimevlasnika;
    }

    public int getPopust() {
        return popust;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public void stampajKarticu()
    {
        System.out.println("ime i prezime:" + this.imePrezimevlasnika+ "," + "broj kartice:" + this.brojKartice);
    }
}
