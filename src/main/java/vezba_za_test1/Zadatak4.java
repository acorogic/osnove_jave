package vezba_za_test1;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
//        4. Zadatak (Metode)
//        Napisati metodu koja vrsi konverziju metara u cm, dm, km. Metoda kao parametre
//        prima vrednost u metrima i jedinicu u kojoj treba izvrsiti konverziju i vraca
//        konvertovanu vrednost.
//        Podsetnik za konverziju jedinica:
//        1m = 100 cm
//        1m = 10 dm
//        1m = 0.001 km
//        Primer poziva metode
//        Ako se u metodu prosledi vrednost 15 i jedinica cm, metoda vraca 1500.
//        Ako se u metodu prosledi vrednost 1500 i jedinica km, metoda vraca 1.5
//        U glavnom programu pozvati metodu za konverziju cm, dm i km i ispisati
//        odgovarajuce poruke na ekranu.
//        Primer izvrsenja programa:
//        3.5m je 350cm
//        3.5m je 35dm
//        3.5m je 0.0035km
        Scanner s = new Scanner(System.in);

        System.out.println("dobrodosli u kovertor duzina");
        System.out.println("Unesite duzinu u metrima");
        int vrednostUmetrima = s.nextInt();
        System.out.println("odaberite jedinicu: cm, dm ili km");
        String izborJedinice = s.next();
        double konvertovanaVrednost =konvertor(vrednostUmetrima, izborJedinice);

        if (izborJedinice.equals("cm")) {
            System.out.println(vrednostUmetrima + "m" + " je " + konvertovanaVrednost + " cm");
        } else if  (izborJedinice.equals("dm")) {
            System.out.println(vrednostUmetrima + "m" + " je " + konvertovanaVrednost + " dm");}
        else if (izborJedinice.equals("km")) {
            System.out.println(vrednostUmetrima + "m" + " je " + konvertovanaVrednost + " km");


        }

        else {
            System.out.println("pogresno unet naziv jedinice za konverziju");


    }}

    public static Double konvertor (int vrednost, String tipKonverzije) {
        if (tipKonverzije.equals("cm")) {
            double centimetri = vrednost * 100;
            return centimetri;
        } else if (tipKonverzije.equals("dm")) {
            double decimetri = vrednost * 10;
            return decimetri;
        } else if (tipKonverzije.equals("km")) {
            double kilometri = vrednost * 0.001;
            return kilometri;
        }
        else {return 0.0;}


    }

}
