package d09_14_2023.Zadatak1;

public class Ispit {


//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    private String nazivPredmeta;
    private int ocena; //5-10
    private String profesor;

    public Ispit(String nazivPredmeta, int ocena, String profesor) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.profesor = profesor;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public boolean polozenIspit() {
        if (ocena>5) {return true;}
        else {return false;}
    }

    public void printIspit(){
        System.out.println("("+ this.nazivPredmeta+")"+ "("+ this.profesor+")"+ "("+ this.ocena+")");
    }
}
