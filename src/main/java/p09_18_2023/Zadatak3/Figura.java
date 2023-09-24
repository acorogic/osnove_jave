package p09_18_2023.Zadatak3;

public abstract class  Figura {
//    Kreirati abstraktnu klasu Figura koja ima
//        abstraktnu metodu povrsina
//        abstraktnu metodu obim
//        metodu koja stampa podatke u formatu:
//        Povrsina je (povrsina)
//                Obim je (obim)
public Figura(){}
    public abstract double povrsina();

    public abstract double obim();

    public void stampa (){
        System.out.println("povrsina je : "+ this.povrsina());
        System.out.println("obim je : " + this.obim());
    }





}
