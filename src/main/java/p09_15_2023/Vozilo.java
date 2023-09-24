package p09_15_2023;

public class Vozilo {

    private  String registracija;
    private String marka;
    protected int brzina;

    protected int brojVrata;

    public Vozilo() {
    }

    public String getRegistracija() {
        return registracija;
    }

    public void setRegistracija(String registracija) {
        this.registracija = registracija;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBrzina() {
        return brzina;
    }

    public void setBrzina(int brzina) {
        this.brzina = brzina;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public void dodajgas(){
        this.brzina= this.brzina+10;
    }

    public void stampaj(){
        System.out.println(this.marka+ this.brzina);
    }

}
