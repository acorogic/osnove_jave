package p08_17_2023;

import java.util.Scanner;

public class Zadatak3 {


//    Napisati program koji sa tastature ucitava tri broja a, b i c i ispisuje
//    srednju vrednost za ta tri broja. Sve promenljive u programu su po tipu double

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("uneti broj a:  ");
        Double a = s.nextDouble();
        System.out.println("uneti broj b:  ");
        Double b = s.nextDouble();
        System.out.println("uneti broj c:  ");
        Double c = s.nextDouble();

        double d = (a+b+c)/3;
        System.out.println("srednja vrednost uneta tri broja je sledeca: "+ d);



    }
}
