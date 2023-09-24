package p09_15_2023.Zadatak1;

public class Profesor extends Osoba{
    private String predajePredmet;
    private double plata;

    public Profesor(String predajePredmet, int plata) {
        this.predajePredmet = predajePredmet;
        this.plata = plata;
    }

    public Profesor(String imePrezime, int jmbg, String predajePredmet, int plata) {
        super(imePrezime, jmbg);
        this.predajePredmet = predajePredmet;
        this.plata = plata;
    }

    public void povecajPlatu(int procenatPovecanja) {
    this.plata= this.plata+ (procenatPovecanja*0.01)*this.plata;}


    public void stampajProfu(){
        System.out.println(this.imePrezime + "," + this.jmbg+ ","+ this.predajePredmet+ ", " + this.plata);
    }
}
