package p09_11_2023;

public class Tacka {
    private int xyKoordinata ;
    private int yyKoordinata;

    public Tacka (){}

    public Tacka(int xyKoordinata, int yyKoordinata){
        this.xyKoordinata= xyKoordinata;
        this.yyKoordinata=yyKoordinata;}


    public void setXyKoordinata(int novaXyKoordinata) {
        xyKoordinata=novaXyKoordinata;
    }
    public int getXyKoordinata(){
        return xyKoordinata;
    }

    public void setYyKoordinata(int novaYyKoordinata) {
        yyKoordinata= novaYyKoordinata;
    }

    public int getYyKoordinata() {
        return yyKoordinata;
    }


}
