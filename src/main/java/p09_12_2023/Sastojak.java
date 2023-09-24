package p09_12_2023;

public class Sastojak {

    private String nazivSastojka;
    private int cena;

    public Sastojak (String nazivSastojka, int cena){
        this.nazivSastojka= nazivSastojka;
        this.cena=cena;
    }

    public Sastojak() {

    }

    public void setNazivSastojka(String nazivSastojka) {
        this.nazivSastojka = nazivSastojka;
    }

    public String getNazivSastojka() {
        return nazivSastojka;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getCena() {
        return cena;
    }

    public void print (){
        System.out.println(this.nazivSastojka+ " " + this.cena);
    }
}
