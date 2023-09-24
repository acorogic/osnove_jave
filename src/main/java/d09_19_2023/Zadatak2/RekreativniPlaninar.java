package d09_19_2023.Zadatak2;

public class RekreativniPlaninar extends Planinar {

    private int clanarina;

    private int tezinaOpreme; // u kg celobrojno
    private String okrugPlaninara;
    private int maxUsponBezOpreme; // uslov za uspesno penjanje = maxUsponBezOpreme - tezinaOpreme*50m

    public RekreativniPlaninar(int idBroj, String imePrezime, int tezinaOpreme, String okrugPlaninara, int maxUsponBezOpreme) {
        super(idBroj, imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.okrugPlaninara = okrugPlaninara;
        this.maxUsponBezOpreme = maxUsponBezOpreme;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public String getOkrugPlaninara() {
        return okrugPlaninara;
    }

    public int getMaxUsponBezOpreme() {
        return maxUsponBezOpreme;
    }



    @Override
    public int clanarina() {
        int rekreativnaClanarina = 1000;

        return rekreativnaClanarina;

    }

    @Override
    public boolean uspesanUspon(Planina planina) {

        if (planina.getVisinaPlanine()> (this.maxUsponBezOpreme-(this.tezinaOpreme*50)))
        {return false;}
        else {return true;}

    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac: " + ","+ " id:" + this.getIdBroj());
        System.out.println("ime:" + this.getImePrezime());
        System.out.println("okrug:" + this.okrugPlaninara);

    }


}

