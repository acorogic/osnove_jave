package d08_25_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa
//        prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
        Scanner s = new Scanner(System.in);
        System.out.println("Unesi vrednost broja");
int broj = s.nextInt();
stampajVrednostZa10Vecu(broj);

    }
    public static void stampajVrednostZa10Vecu(int unetiBroj) {
       int uvecanBroj= unetiBroj+10;
        System.out.println("Broj uvecan za 10 je sledeci: " + uvecanBroj);
    }
}
