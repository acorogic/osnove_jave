package d09_07_2023;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {



//    Kreiranje klase "Film"
//    Napišite klasu "Film" sa atributima: naslov (String), godinaIzdanja (int) i reziser (String).
//    U glavnoj metodi kreirajte 2-3 objekta ove klase i postavite im vrednosti unosom sa tastature.
//    Ispisati informacije o filmovima.

        Scanner s= new Scanner(System.in);
Film film1= new Film();
        System.out.println("Unesite naslov prvog filma" );
        film1.naslov= s.next();

        System.out.println("Unesite godinu izdanja");
        film1.godinaIzdanja= s.nextInt();

        System.out.println("Unesite ime rezisera");
        film1.reziser= s.next();


        Film film2= new Film();
        System.out.println("Unesite naslov drugog filma" );
        film2.naslov= s.next();

        System.out.println("Unesite godinu izdanja");
        film2.godinaIzdanja= s.nextInt();

        System.out.println("Unesite ime rezisera");
        film2.reziser= s.next();




        System.out.println("PrvFilm " + " " + film1.naslov+ "je snimljen"+ " "+ film1.godinaIzdanja + " "+ "i reziser je"+ " " + film1.reziser );
        System.out.println("Film " + " " + film2.naslov+ "je snimljen"+ " "+ film2.godinaIzdanja + " "+ "i reziser je"+ " " + film2.reziser );


}}
