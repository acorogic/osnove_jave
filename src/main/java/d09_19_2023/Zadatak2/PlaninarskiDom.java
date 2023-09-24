package d09_19_2023.Zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.planinari = new ArrayList<>();
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setPlaninari(ArrayList<Planinar> planinari) {
        this.planinari = planinari;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }


    public void uclaniPlaninara(Planinar noviPlaninar) {
        this.planinari.add(noviPlaninar);
    }

    public int uspesnanUspon(Planina planina) {
         int brojac= 0;

        for (int i = 0; i < planinari.size(); i++) {
            if(planinari.get(i).uspesanUspon(planina)) {brojac=brojac+1;}}
        return brojac;





    }
    public void izbaciPlaninara(Planinar planinar) {
        for (int i = 0; i < planinari.size(); i++) {
            if (planinar.getIdBroj()== planinari.get(i).getIdBroj()) {
                planinari.remove(i);}
            }

        }

    public int mesecniPrihod()
    {
        int mesecniPrihod=0;

        for (int i = 0; i < planinari.size(); i++) {
           mesecniPrihod= mesecniPrihod+ planinari.get(i).clanarina();

        }
        return mesecniPrihod;

    }


}

