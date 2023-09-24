package p09_15_2023;

public class Kamion  extends Vozilo {



    private int nosivost;

    public Kamion() {
        super(); //mini  konstruktor objekat koji poziva atribute  nasledjivanje, postoji po defaultu
    }





    public int getNosivost() {
        return nosivost;
    }

    public void setNosivost(int nosivost) {
        this.nosivost = nosivost;
    }
}
