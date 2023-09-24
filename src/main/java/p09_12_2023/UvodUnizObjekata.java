package p09_12_2023;

import p09_07_2023.User;

import java.util.ArrayList;

public class UvodUnizObjekata {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        ArrayList<Korisnik> korisnici= new ArrayList<>();
        Korisnik aco= new Korisnik("aco rogic");
        Korisnik mico= new Korisnik("mico micic");
        korisnici.add(mico);
        korisnici.add(aco);

        for (int i = 0; i < korisnici.size(); i++) {

            korisnici.get(i).print();

        }


    }
}
