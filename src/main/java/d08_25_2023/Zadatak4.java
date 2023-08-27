package d08_25_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {


//    Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//    Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
/// / / / /
//    Napomena: Metoda nista ne vraca.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite karakter");
        String znak= s.next();
        System.out.println("Unesite broj ponavljanja");
        int brojPonavljanja = s.nextInt();
        printChar(brojPonavljanja, znak);

    }
    public static void printChar (int n, String karakter){
        for (int i = 0; i <n ; i++) {
            System.out.print(karakter);

        }
    }
}