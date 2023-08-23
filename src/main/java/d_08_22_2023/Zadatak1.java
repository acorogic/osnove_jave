package d_08_22_2023;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int sumaBrojeva = 0;
        boolean krajBrojanja = false;

        while (!krajBrojanja) {
            System.out.println("Unesite vrednost:");
            int broj = s.nextInt();
            sumaBrojeva = sumaBrojeva + broj;
            if (sumaBrojeva > 100) {
                System.out.println("Prekoracenje! Kraj programa. Sracunata suma je " + sumaBrojeva);
                krajBrojanja = true;
            }
        }



    }
    }

