package p09_12_2023;

public class ClanskaKarta {
    private int popust; //u rasponu od 5-10%
    private int brojKartice;



    ClanskaKarta(int popust, int brojKartice){
        this.popust= popust;
        this.brojKartice=brojKartice;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public int getPopust() {
        return popust;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public int getBrojKartice() {
        return brojKartice;
    }
}
