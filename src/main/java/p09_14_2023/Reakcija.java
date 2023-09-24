package p09_14_2023;

public class Reakcija {
    private String reakcija ;//smajli, like, srce
    private String imePrezime;

    public Reakcija(String reakcija, String imePrezime) {
        this.reakcija = reakcija;
        this.imePrezime = imePrezime;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }
}
