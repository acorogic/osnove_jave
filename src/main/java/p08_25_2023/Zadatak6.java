package p08_25_2023;

public class Zadatak6 {
    public static void main(String[] args) {

//        6. Napisati metodu koja vraca suprotno negativni broj od prosledjenog.
//                Metoda prima broj N i vraca ga sa negativnom vrednoscu.
//        Primer: Ako se metoda pozove za N=10, vraca -10
int N= 5;
        int nn= vracanjeNegativneVrednosti(N);
        System.out.println(nn);
    }

    public static int vracanjeNegativneVrednosti (int N) {
        int negativnaVrednost= -1*N;
        return negativnaVrednost;


    }
}
