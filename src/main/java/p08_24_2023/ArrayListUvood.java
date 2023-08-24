package p08_24_2023;

import java.util.ArrayList;

public class ArrayListUvood {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Bmw");
        cars.add("mazda");
        cars.add("tojota");
        cars.add("tesla");
        cars.size();
        cars.get(0);
        cars.set(2, "ford"); //0 bmw, 1 mazda, 2 tojota ==>ford

        cars.get(3);

//Elementi niza su indeksi, niz raste dodavanjem, dinamicki niz
        System.out.println(cars);
        //indeksi su pomeraj od nultog clana niza

        System.out.println("kraj");
        //elementi stringa se slazu po definisanom tipu (string, int etc)
//wrapers za primitivne tipove podataka, vec referentne
        //niz brojeva nije arraylist<int> vec int Integer

    }
}
