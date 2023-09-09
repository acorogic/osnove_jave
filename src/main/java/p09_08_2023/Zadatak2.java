package p09_08_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        Auto auto1= new Auto();
        auto1.vozac= "mika";
        auto1.markaAuta="yugo";
        auto1.brojVrata= 5;
        auto1.potrosnja= 5;
        auto1.brzina=120;

        auto1.print();

        auto1.godinaProizvodnje= 1949;
        auto1.mesecRegistracije= 9;
        auto1.kubikaza= 2100;

        if (auto1.oldtimer()){
            System.out.println("auto je oldtimer");}
        else {
            System.out.println("auto nije oldtimer");


            if (auto1.istekRegistracije(3)) {
                System.out.println("registacija je istekla");}
                else {
                    System.out.println("registracija nije istekla");}}


                System.out.println( "Cena registracije je " + auto1.cenaRegistracije()+ " dinara");

        }
    }








