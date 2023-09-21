package d09_19_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa {

    private ArrayList<Ambalaza> ambalaze;
    

    public Korpa() {
       
        this.ambalaze = new ArrayList<>();
    }



    public void dodajAmbalazu (Ambalaza novaAmbalaza){
        this.ambalaze.add(novaAmbalaza);
    }

   public void izbaciAmbalazu(String barkod){
       for (int i = 0; i < ambalaze.size(); i++) {


       if (barkod.equals(ambalaze.get(i).barkod))
       {ambalaze.remove(i);
       }

   }



}
    private ArrayList<Double> cenaSaPopustom(double popust){
        double popustPoArtiklu = popust/this.ambalaze.size();
        double cenaPopust = 0;
        ArrayList<Double>ceneSaPopustom = new ArrayList<>();
        for (int i = 0; i < ambalaze.size(); i++) {
            if(ambalaze.get(i).cena()>=popustPoArtiklu){
                cenaPopust = ambalaze.get(i).cena()-popustPoArtiklu;
            }
            else {
                cenaPopust = 0;
            }
            ceneSaPopustom.add(cenaPopust);
        }
        return ceneSaPopustom;
    }

    public double ukupnaCena(SuperKartica kartica){
        double sum = 0;
        for (int i = 0; i < this.cenaSaPopustom(kartica.getPopust()).size(); i++) {
            double cenaArtikla = this.cenaSaPopustom(kartica.getPopust()).get(i);
            sum+=cenaArtikla;
        }
        return sum;
    }

}
