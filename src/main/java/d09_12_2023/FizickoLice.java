package d09_12_2023;

public class FizickoLice {
//    Za potrebe agencije za nekretnine kreirati  klasu FizickoLice koje ima:
//    ime i prezime
//    broj licne karte
//            jmbg
//    podatak da li je osoba vec jednom kupovala nekretninu preko agencije (boolean)
//    konstuktore
//    gettere i settere, jmbg ne sme da se menja
//    metodu stampaj, koja stmpa podatke u formatu:
//    ime i prezime, broj licne karte

    private String imePrezime;
    private int brojLicneKarte;
    private int jbmg;
    private boolean stariKupac;

    public FizickoLice(String imePrezime, int brojLicneKarte, int jmbg, boolean stariKupac){
        this.imePrezime = imePrezime;
        this.brojLicneKarte = brojLicneKarte;
        this.jbmg = jmbg;
        this.stariKupac = stariKupac;
    }

    public void setImePrezime(String imePrezime){
        this.imePrezime = imePrezime;
    }
    public String getImePrezime(){
        return this.imePrezime;
    }

    public void setBrojLicneKarte(int brojLicneKarte){
        this.brojLicneKarte = brojLicneKarte;
    }
    public int getBrojLicneKarte(){
        return this.brojLicneKarte;
    }
    public int getJbmg(){
        return this.jbmg;
    }
    public void setStariKupac(boolean stariKupac){
        this.stariKupac = stariKupac;
    }
    public boolean getStariKupac(){
        return this.stariKupac;
    }

    public void stampaj(){
        System.out.print(this.imePrezime+", broj licne karte: "+ this.brojLicneKarte);
    }
}
