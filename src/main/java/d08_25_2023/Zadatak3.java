package d08_25_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//        Zadatak 3
//        Napisati metodu koja stampa podatke o korisniku u formatu:
//        JMBG: [jmbg]
//        Ime: [ime]
//        Prezime: [prezime]
//        God. rodjenja: [god]
//        Aktivan: [true/false]
//        Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.Metoda nista ne vraca.
printUserCredentials(12346464,"Milutin", "Milenkovic", 1389, true);
    }
    public static void printUserCredentials (int jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
        System.out.println( "JMBG: " + jmbg);
        System.out.println("IME: " +ime );
        System.out.println("PREZIME: "+ prezime);
        System.out.println("GODINA RODJENJA: "+godinaRodjenja);
        System.out.println("AKTIVAN: "+aktivan);
    }
}
