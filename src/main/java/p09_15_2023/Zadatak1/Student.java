package p09_15_2023.Zadatak1;

public class Student extends Osoba {

    private int brIndexa;
    private int dugZaSkolarinu;

    public Student(String imePrezime, int jmbg, int brIndexa, int dugZaSkolarinu) {
        super(imePrezime, jmbg);
        this.brIndexa = brIndexa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public Student(int brIndexa, int dugZaSkolarinu) {
        super();
        this.brIndexa = brIndexa;
        this.dugZaSkolarinu = dugZaSkolarinu;
    }

    public void smanjiDugZaSkolarinu(int iznosUplate){

        this.dugZaSkolarinu= this.dugZaSkolarinu- iznosUplate;

    }
@Override
    public void stampa() {
        System.out.println(this.imePrezime+ " , " + this.jmbg+ " , " + this.brIndexa+ " , " + "Dug za skolarinu"+ this.dugZaSkolarinu );
    }


}
