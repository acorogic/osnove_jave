package d09_15_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        ArrayList<Igrac> igraci = new ArrayList<>();
        ArrayList<Trener>treneri = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime  trenera ");
            String ime = s.next();
            System.out.print("Unesite prezime  trenera ");
            String prezime = s.next();
            System.out.print("Unesite jmbg  trenera ");
            String jmbg = s.next();
            System.out.print("Unesite godinu rodjenja  trenera "));
            int godina = s.nextInt();
            System.out.print("Unesite godine iskustva  trenera ");
            int iskustvo = s.nextInt();
            System.out.print("Unesite tip  trenera ");
            String tip = s.next();
            treneri.add(new Trener(ime+" "+prezime, jmbg, godina, iskustvo, tip));
            System.out.println();
        }


        for (int i = 0; i < 2; i++) {
            System.out.print("Unesite ime igraca ");
            String ime = s.next();

            System.out.print("Unesite prezime igraca ");
            String prezime = s.next();

            System.out.print("Unesite jmbg igraca ");
            String jmbg = s.next();

            System.out.print("Unesite godinu rodjenja igraca "));
            int godina = s.nextInt();

            System.out.print("Unesite broj na dresu  igraca ");
            int broj = s.nextInt();

            System.out.print("Unesite poziciju igraca ");
            String pozicija = s.next();
            System.out.print("Da li je igrac kapiten ");
            boolean kapiten = s.nextBoolean();
            igraci.add(new Igrac(ime+" "+prezime, jmbg, godina, broj, pozicija, kapiten));
            System.out.println();
        }

        System.out.println();


        System.out.println();

        for (int i = 0; i < igraci.size(); i++) {
            igraci.get(i).stampaj();
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < treneri.size(); i++) {
            treneri.get(i).stampaj();
            System.out.println();
        }

        System.out.println("kraj programa");
    }

}



