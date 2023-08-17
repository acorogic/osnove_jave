package p08_17_2023;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
//        Napisati program koji sa tastature ucitava tri cela broja:
//        dan
//                mesec
//        godina
//        I formira datum u ispisu u formatu dan-mesec-godina

        Scanner a= new Scanner(System.in);
        System.out.println("Unesi dan, u formi broja");
        int dan= a.nextInt();
        System.out.println("Unesi mesec, u formi broja");
        int mesec= a.nextInt();
        System.out.println("Unesi godinu, u formi broja");
        int godina= a.nextInt();

        System.out.println(dan +"-"+ mesec +"-" + godina);


    }
}
