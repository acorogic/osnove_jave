package p08_18_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
//        Napisati program koji sa tastature ucitava broj N i operaciju koja se izvrsava nad njim.
//                Na kraju programa se ispisuje nova vrednost promenljive N.
//                Ukoliko se za operaciju unese uvecaj, to uvecava promenljivu N za 1.
//        Ukoliko se za operaciju unese smanji, to smanjuje promenljivu N za 1.

        Scanner a= new Scanner(System.in);
        System.out.println("Uneti broj n:  ");
        int n= a.nextInt();
        System.out.println("Unesi komandu od dve ponudjene **povecaj ili smanji**");
        String komanda = a.next();


        if( komanda.equals("povecaj")) {
            int operacijaPovecaj= n+1;
            System.out.println(operacijaPovecaj);}
        if (komanda.equals("smanji"))
        { int operacijaSmanji= n-1;
            System.out.println(operacijaSmanji); }

        System.out.println("kraj programa");

        // print ubaciti na kraju nema potrbe da bude u printu

        //n moze biti samo jedna promenljiva n koja dobija  vrednost u petlji





        }



    }

