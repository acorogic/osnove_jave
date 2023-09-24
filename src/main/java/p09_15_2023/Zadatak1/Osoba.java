package p09_15_2023.Zadatak1;

public class Osoba {
    protected String imePrezime;

    protected int jmbg;

    public Osoba(String imePrezime, int jmbg) {
        this.imePrezime = imePrezime;
        this.jmbg = jmbg;
    }

    public Osoba() {
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public  void stampa () {
        System.out.println(this.imePrezime+ " , " + this.jmbg);
    }
}
