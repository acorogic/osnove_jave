package d09_12_2023;

public class Racun {
//    Kreirati klasu Racun koja ima:
//    broj racuna (npr: 170-289328923-23)
//    ime i prezime osobe
//    trenutno stanje na racunu (npr: 100, 1220)
//    gettere i setter za sve atribute, sem settera za stanje na racunu
//    metodu uplatiNaRacun kojoj se dodaje prosledjena vrednost na stanje
//    metodu skiniSaRacunai kojom se stanje umanjuje za prosledjenja vrednost
//    metodu koja stampa podatke o racunu u formatu:
//    Ime i prezime  -  broj racuna
//    stanje na racunu je (trenutno stanje) rsd.

    private String broj;
    private String imePrezime;
    private double stanje;

    public Racun(String broj, String imePrezime, double stanje){
        this.broj = broj;
        this.imePrezime = imePrezime;
        this.stanje = stanje;
    }
    public void setBroj(String broj){
        this.broj = broj;
    }
    public String getBroj(){
        return this.broj;
    }
    public void setImePrezime(String imePrezime){
        this.imePrezime = imePrezime;
    }
    public String getImePrezime(){
        return this.imePrezime;
    }
    public double getStanje(){
        return this.stanje;
    }
    public void uplatiNaRacun(double iznos){
        this.stanje =this.stanje+iznos;
    }
    public void skiniSaRacuna(double iznos){
        if(this.stanje>=iznos)
            this.stanje= this.stanje-iznos;
        else System.out.println("Nemate dovoljno sredstava za transakciju!");
    }
    public void stampaj(){
        System.out.println(this.imePrezime +" - "+this.broj);
        System.out.println("Stanje na racunu je "+this.stanje+" rsd.");
    }
}


