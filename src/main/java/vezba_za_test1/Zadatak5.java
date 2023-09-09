package vezba_za_test1;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
//        1. Napisati program koji za unetu visinu i težinu osobe računa indeks telesne
//        mase (BMI) i na osnovu tog rezultata osobu raspoređuje u jednu od četiri kategorije.
//        BMI se računa po formuli
//                𝐵𝑀𝐼 =
//                𝑡𝑒𝑧𝑖𝑛𝑎 𝑢 𝑘𝑔
//        (𝑣𝑖𝑠𝑖𝑛𝑎 𝑢 𝑚)
//        2
//        dok se kategorija određuje prema tabeli 1.1.
//                Tabela 1.1 Određivanje kategorije na osnovu indeksa telesne mase
//        Primer izvrsenja: Unesite tezinu osobe (kg): 110
//        Unesite visinu osobe (m): 1.9
//        Kategorija je Gojaznost

        Scanner s = new Scanner(System.in);
        System.out.println("unesite visinu u m");
        double visina= s.nextDouble();
        System.out.println("Unesite tezinu u kg");
        double tezina= s.nextDouble();

        double bmi= tezina/(visina*visina);
        System.out.println(bmi);

        if (bmi<18.5) {
            System.out.println("neuhranjenost");}
        else if (bmi>18.5 && bmi<24.99) {
            System.out.println("normalna tezina");}
        else if (bmi>25 && bmi<29.99) {
            System.out.println("prekomerna tezina");}
            else {
            System.out.println("gojaznost");


            
        }




    }
}
