package p08_24_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//        2.Zadatak
//        Napisati program koji u sebi ima definisan niz od 5 broja
//            (brojevi su proizvoljni) i menja vrednost elementa na poziciji 3 tako sto je povecava 10 puta.
//                Npr: 1,4,5,6,7 => 1,4,5,60,8
//        int a = 10;
//        a = a * 10;


        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        int treciClanUnizu = numbers.get(2);

        int uvecanClan10x= 10*treciClanUnizu;

        numbers.set(2, uvecanClan10x);
        System.out.println(uvecanClan10x);
    }
}
