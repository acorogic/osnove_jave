package p09_15_2023;

public class Auto extends Vozilo {


    private int brojVrata;

    public Auto() {

    }




    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }
@Override
    public void stampaj (){
        System.out.println(this.brojVrata + this.brzina);
    }
}
