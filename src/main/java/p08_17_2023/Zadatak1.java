package p08_17_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji sa tastature ucitava ime, prezime, broj telefona, email  i jmbg korisnika prikazuje u formatu:
//[Ime] [Prezime] - [JMBG]
//        Broj Tel: [Broj telefona],
//        Email: [Email],
//
//        Unesite ime: Milan
//        Unesite prezime: Jovanovic
//        Unesite broj: +209329832
//        Unesite email: milan@gmail.com
//        Unesite jmbg: 329032938923
//
//        Milan Jovanovic - 329032938923
//        Broj tel:  +209329832
//        Email: milan@gmail.com

        Scanner a= new Scanner(System.in);
        System.out.println("Unesite ime:");
        String ime= a.next();

        System.out.println("Unesite prezime");
        String prezime= a.next();

        System.out.println("Unesite broj:");
        int brojTelefona= a.nextInt();

        System.out.println(" Unesite email");
        String email = a.next();

        System.out.println("Unesite jmbg:");
        int jmbg = a.nextInt();

        System.out.println(ime+ "   "+ prezime+ "   "+ jmbg  );
        System.out.println("Broj telefona" + brojTelefona);
        System.out.println("email" + email);



    }
}
