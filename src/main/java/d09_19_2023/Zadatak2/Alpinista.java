package d09_19_2023.Zadatak2;

import java.util.ArrayList;

public class Alpinista extends Planinar {

    private ArrayList<Integer> poeni;

    private int maxUspon = 4000;

    public Alpinista(int idBroj, String imePrezime) {

        super(idBroj, imePrezime);
        this.poeni = new ArrayList<>();
    }

    public int ukupanBrojPoena()

    {
        int ukupanBroj=0;

        for (int i = 0; i < poeni.size(); i++) {
            ukupanBroj= ukupanBroj+ poeni.get(i);

        }
        return ukupanBroj;
    }
    @Override
    public int clanarina() {
        int clanarina=1500;
        return clanarina-(ukupanBrojPoena()*50);
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine()<this.maxUspon) {
        return true;}
        else {return false;}
    }


    @Override
    public void stampaj() {
        System.out.println("Alpinista: " + this.getIdBroj());
        System.out.println("ime i prezime" + this.getImePrezime());
        System.out.println("broj poena" + this.ukupanBrojPoena());

    }
}
