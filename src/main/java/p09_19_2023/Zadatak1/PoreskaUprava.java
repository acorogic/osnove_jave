package p09_19_2023.Zadatak1;

import java.util.ArrayList;
import java.util.Objects;

public class PoreskaUprava {

    private String imeGrada;
    private Objekat objekat;
    private ArrayList<Objekat> objekti;


    public PoreskaUprava(String imeGrada, Objekat objekat) {
        this.imeGrada = imeGrada;
        this.objekat = objekat;
        this.objekti = new ArrayList<>();
    }


    public void dodajObjekat(Objekat o) {
        this.objekti.add(o);
    }

    public Objekat najveciPorez() {
        Objekat objekatNajveciPorez = this.objekti.get(0);
        double najveciPorez = 0;


        for (int i = 0; i < this.objekti.size(); i++) {
            double porez = this.objekti.get(i).porez();
            if (porez > najveciPorez) {
                najveciPorez = porez;
                objekatNajveciPorez = this.objekat;
            }
        }

        return objekatNajveciPorez;
    }


    public Objekat najmanjiPorez() {
        Objekat objekatNajmanjiPorez = objekti.get(0);
        double najmanjiPorez = 0;

        for (int i = 0; i < objekti.size(); i++) {
            double porez = objekti.get(i).porez();

            if (porez < najmanjiPorez) {
                najmanjiPorez = porez;
                objekatNajmanjiPorez = objekat;

            }

        }
        return objekatNajmanjiPorez;
    }


    public double ukupanPorezGrada() {
        double ukupanPorez = 0;

        for (int i = 0; i < objekti.size(); i++) {
            ukupanPorez = ukupanPorez + objekti.get(i).porez();

        }
        return ukupanPorez;
    }

    public void stampa() {
        for (int i = 0; i < objekti.size(); i++) {
            objekti.get(i).stampaj();

        }
    }
}

