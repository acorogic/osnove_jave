package d09_12_2023;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        ZeleniKarton zk1= new ZeleniKarton("brka brkic", 123, "matematika", "radovan jovic", 6 );
        ZeleniKarton zk2= new ZeleniKarton("raka rakic",  334, "srpski ", "lepa lepic", 10);
        ZeleniKarton zk3= new ZeleniKarton("ratko ratkic", 445, "matematika", "radovan jovic", 7);
        ZeleniKarton zk4= new ZeleniKarton("mika mikic", 333, "engleski", "boban petrovic", 9);
        ZeleniKarton zk5= new ZeleniKarton("tina tinic", 887, "umetnost", "lepi lepic", 10);

        ArrayList<ZeleniKarton> kartons= new ArrayList<>();
        kartons.add(zk1);
        kartons.add((zk2));
        kartons.add(zk3);
        kartons.add(zk4);
        kartons.add(zk5);

        for (int i = 0; i < kartons.size(); i++) {
            kartons.get(i).stampaj();

        }
        int sumaOcena=0;


        for (int i = 0; i < kartons.size(); i++) {

           sumaOcena= sumaOcena+ kartons.get(i).getOcena();

        }
        double srednjaOcena= sumaOcena*1.0/ (kartons.size());
        System.out.println("Srednja ocena je : " + srednjaOcena);


        int sumaPolozenih =0;
        int brojPolozenih=0;

        for (int i = 0; i < kartons.size(); i++) {
            if (kartons.get(i).statusIspita())
            {sumaPolozenih= sumaPolozenih+ kartons.get(i).getOcena();brojPolozenih++;

        }


    }
        double srednjaOcenaPolozenih= sumaPolozenih*1.0/brojPolozenih;
        System.out.println("prosecna ocena polozenih ispita je: " + srednjaOcenaPolozenih);
}}
