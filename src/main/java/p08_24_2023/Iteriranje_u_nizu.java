package p08_24_2023;

import java.util.ArrayList;

public class Iteriranje_u_nizu {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        System.out.println(numbers) ; //print je metoda u ovom slucaju nije native komanda
        //
        for (int i = 0; i <numbers.size() ; i++) {
            int x= numbers.get(i);
            System.out.println(x + ", ");

        }
    }
}
