package p09_12_2023;

public class Kupac {
    private String imePrezime;
    private ClanskaKarta clanskaKartaKupca;

    public Kupac(String imePrezime, ClanskaKarta clanskaKarta){
        this.imePrezime=imePrezime;
        this.clanskaKartaKupca=clanskaKarta;
    }


    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setClanskaKartaKupca(ClanskaKarta clanskaKartaKupca) {
        this.clanskaKartaKupca = clanskaKartaKupca;
    }

    public ClanskaKarta getClanskaKartaKupca() {
        return clanskaKartaKupca;
    }

   public int popust () {
       int popust =this.clanskaKartaKupca.getPopust();
       return popust;
    }
}
