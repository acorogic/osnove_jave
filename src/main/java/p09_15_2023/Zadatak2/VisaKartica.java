package p09_15_2023.Zadatak2;

public class VisaKartica extends PlatnaKartica {

    private String ovlascenoLice;



    public VisaKartica(int suma, int brojKartice, int godinaVazenja, int mesecVazenja, String ovlascenoLice) {
        super(suma, brojKartice, godinaVazenja, mesecVazenja);
        this.ovlascenoLice = ovlascenoLice;
    }

    public String getOvlascenoLice() {
        return ovlascenoLice;
    }

    public void setOvlascenoLice(String ovlascenoLice) {
        this.ovlascenoLice = ovlascenoLice;
    }
    @Override
    public void izvrsiTransakciju (int kolicinaNovca){

        if ((0.018*kolicinaNovca)<=4) {this.suma= this.suma+4;}
        else {this.suma= this.suma+ kolicinaNovca+ 0.018*kolicinaNovca;

    }

    }
@Override
    public void stampaj(){
        System.out.println("Visa Card"+ this.brojKartice+ "," + this.mesecVazenja+ "/" + this.godinaVazenja+ " , " +this.suma+ "$");
    }
}
