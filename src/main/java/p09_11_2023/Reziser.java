package p09_11_2023;

public class Reziser {
    private String imeIprezime;
    private int starostRezisera;
    //public   Film reziraoFilm; //povezivanje objekata ovo je referenca do objekta Film
    public Reziser(String imeIprezime, int starostRezisera){
        this.imeIprezime= imeIprezime;
        this.starostRezisera=starostRezisera;
        }

    public Reziser() {

    }


    public void setImeIprezime (String imeIprezime) {
        this.imeIprezime=imeIprezime;
    }

    public String getImeIprezime (){
        return imeIprezime;
    }


    public void setStarostRezisera(int starostRezisera) {
        this.starostRezisera=starostRezisera;
    }

    public int getStarostRezisera(){
        return starostRezisera;
    }

    public void stampa (){
        System.out.println( "ime i prezime rezisera: " + this.imeIprezime + "," + "starost"+ this.starostRezisera);

    }
}
