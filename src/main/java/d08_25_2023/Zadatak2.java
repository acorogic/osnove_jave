package d08_25_2023;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati funkciju koja za dva jednocifrena broja koja su
//        ulazni parametri funkcije vraca novu vrednost koja se formira
//        kao na primeru. METODA NISTA NE STAMPA.
//        ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//        ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

      int broj1 =6;
      int broj2=2;

      int broj3=2;
      int broj4=3;

        System.out.println(zdruzivanjeBrojeva(broj1,broj2));
        System.out.println(zdruzivanjeBrojeva(broj3, broj4));
    }
    public static int zdruzivanjeBrojeva (int a, int b) {
        int c = (a*10) + b;
        return c;
    }
}
