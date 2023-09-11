package p09_11_2023;

public class Student {
    private String ime;
    private String prezime;
    private int brojIndexa;

    private boolean budzet;

    public  void setIme(String novoIme){
       this.ime=novoIme;}

    public String getIme(){
        return ime;}

    public  void setPrezime(String prezime){
        this.prezime= prezime;}

    public String getPrezime( ){
        return prezime;}


    public void setBrojIndexa (int BrojIndexa) {
        this.brojIndexa=BrojIndexa;}
    public Integer getBrojindexa (){
        return brojIndexa;}

    public void setBudzet (boolean budzet) {
        this.budzet=budzet;}

    public boolean getBudzet () {
        return budzet;}
    public void stampa () {
        System.out.println("ime i prezime studenta:" + this.ime + this.prezime);
        System.out.println("broj indeksa je:" + this.brojIndexa);

        if (this.budzet) {
            System.out.println("student je na budzetu");
        } else {
            System.out.println("student nije na budzetu");


        }
    }}
