package p09_19_2023.Zadatak1;

public abstract class Objekat {
    protected String adresa; //ulica i broj

    protected int povsinaObjekta;

    protected int zona;
public Objekat(){}
    public Objekat(String adresa, int povsinaObjekta, int zona) {
        this.adresa = adresa;
        this.povsinaObjekta = povsinaObjekta;
        this.zona = zona;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getPovsinaObjekta() {
        return povsinaObjekta;
    }

    public void setPovsinaObjekta(int povsinaObjekta) {
        this.povsinaObjekta = povsinaObjekta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public double koeficient(){
    double koeficient;

    if (this.zona==1) {koeficient=1.4;}
    else if (this.zona==2) {koeficient=1.1;}
    else   {koeficient=1.05;

    }
    return koeficient;

    }


    public abstract double porez();

public abstract void stampaj();
}
