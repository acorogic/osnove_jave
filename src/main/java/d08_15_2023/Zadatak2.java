package d08_15_2023;

import org.w3c.dom.ls.LSOutput;

public class Zadatak2 {
    public static void main(String[] args) {


//    Napisati program koji stampa podatke o kreditnoj kartici
//    u formatu kao na slici. Od informacija se pamti
//    broj kartice
//            (16 cifara sa razmacima),
//            mesec i godina do kada vazi kartica,
//    kao i ime i prezime vlasnika kartice.
//
//    Kartica se stampa sa zvezdicama i ne
//    brinite ukoliko neka zvezdica mrdne i nije u liniji to ce zavisiti od duzine imena.
//    Napomena: svaka informacija mora da bude u okviru posebne promenljive.

    String cardNumber= "1234 1232 4321 1212";
    int validMonth= 10;
    int validYear= 2025;
    String cardOwnerFirstName= "Milan";
    String cardOwnerLastName= "Jovanovic";
        System.out.println("******************************");
        System.out.println("* "+ "Credit card        "+ "      *");
        System.out.println("* "+ "****                     *");
        System.out.println("* "+ "****                     *");
        System.out.println("* "+ cardNumber + "        *");
        System.out.println("* "+ "            valid>" +validMonth+ "/"+ validYear+ "  *" );
        System.out.println("*                            * " );
        System.out.println("*    "+ cardOwnerFirstName + " " + cardOwnerLastName + "       *" );
        System.out.println("******************************");





}}
