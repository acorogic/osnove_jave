package p09_18_2023.Zadatak2;

public abstract class Student {
    protected String imePrezime;
    protected   int brIndexa;
    protected int godinaStudija;

    public Student(String imePrezime, int brIndexa, int godinaStudija) {
        this.imePrezime = imePrezime;
        this.brIndexa = brIndexa;
        this.godinaStudija = godinaStudija;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrIndexa() {
        return brIndexa;
    }

    public void setBrIndexa(int brIndexa) {
        this.brIndexa = brIndexa;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    public abstract int cenaSkolarine ();

    public abstract boolean studijeBudzet();


    public void stampaj (){
        System.out.println(this.imePrezime+ "," + this.brIndexa+ "," + this.godinaStudija);
        System.out.println("Finansiranje: " +studijeBudzet());
        System.out.println("Cena skolarine:" + cenaSkolarine());

    }

}
