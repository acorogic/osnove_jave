package p22_08_2023;

import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {


//    Zadatak
//    Napisati program koji validira unos input polja za broj.
//    Polje za unos prima samo brojeve u opsegu od 10 do 50.Korisnik unosi vrednosti dok ne unese validan  broj.
//    Primer izvrsenja:
//    Unesite broj: 5
//    Greska: Broj nije u opsegu od 10 do 50.
//    Unesite broj: -1
//    Greska: Broj nije u opsegu od 10 do 50.
//    Unesite broj: 51
//    Greska: Broj nije u opsegu od 10 do 50.
//    Unesite broj: 4
//    KRAJ

    Scanner s= new Scanner(System.in)  ;
    int broj= 11;

while (broj <10 || broj >50) {
        System.out.println("unesite broj :" );
        broj = s.nextInt();
        System.out.println("Broj nije u opsegu od 10 do 50" + broj);
    }

        System.out.println("kraj");
}
}


