package p09_14_2023;

public class Film {
    private String nazivFilma;
    private int godinaFilma;

    public Film(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    public void setGodinaFilma(int godinaFilma) {
        this.godinaFilma = godinaFilma;
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public int getGodinaFilma() {
        return godinaFilma;
    }
}
