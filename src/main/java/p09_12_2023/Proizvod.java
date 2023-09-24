package p09_12_2023;

public class Proizvod {

    private String nazivProizvoda;
    private Kupac kupacArtikla;

    private int cenaIzradeProzivoda;








    public Proizvod(String nazivProizvoda){
        this.nazivProizvoda= nazivProizvoda;}




    public void setNazivProizvoda(String nazivProizvoda){
        this.nazivProizvoda=nazivProizvoda;}

    public String getNazivProizvoda(){
        return this.nazivProizvoda;
    }

    public void setKupacArtikla(Kupac kupacArtikla) {
        this.kupacArtikla = kupacArtikla;
    }

    public void setCenaIzradeProzivoda(int cenaIzradeProzivoda) {
        this.cenaIzradeProzivoda = cenaIzradeProzivoda;
    }

    public int popust (){
       int popust= this.kupacArtikla.popust();
       return popust;
 }




    public Double cenaProizvoda () {
        double cenaProzivoda= this.cenaIzradeProzivoda*1.9*(100-popust())/100;
                return cenaProzivoda;
    }

    public void stampaj (){
        System.out.println("cena kostanja proizvoda je"+ cenaProizvoda());
    }
}
