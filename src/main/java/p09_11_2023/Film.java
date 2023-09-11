package p09_11_2023;

public class Film {

    private String nazivFilma;
    private int godinaFilma;

    private Reziser reziserFilma;


    public Film(String nazivFilma, int godinaFilma, Reziser reziserFilma){
        this.nazivFilma=nazivFilma;
        this.godinaFilma=godinaFilma;
        this.reziserFilma= reziserFilma;
    }

    public void setNazivFilma (String nazivFilma){
        this.nazivFilma= nazivFilma;
    }

    public String getNazivFilma(){
        return this.nazivFilma;
    }

    public void setGodinaFilma (int godinaFilma){
        this.godinaFilma=godinaFilma;
    }
    public int getGodinaFilma(){
        return this.godinaFilma;
    }

    public void stampa () {
        System.out.println("naziv filma: " + this.nazivFilma + "godina filma:  " + this.godinaFilma );
    }
}
