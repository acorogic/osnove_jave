package p09_11_2023;

import java.util.Random;

public class User {
    private int uniqId;
    public String ime; //atribut

    private String email;

    private int starost;

    public String GetEmail(){
        return this.email;}

   public void SetEmail (String email) {
        this.email= email;

    }

    public void stampaEmail () {
        System.out.println("novi user email" + this.email);



    }


    //konstruktor specijalna metoda nema void nema static, zove se kao klasa IDENTICNO
    //vise konstruktora moraju deliti parametre

    public User(){
        System.out.println("pozvan je konstruktor");
        Random random = new Random();
        this.uniqId=random.nextInt(); //moze konstruktor ovo da radi ,ali je 99% prazan

    }

    public User(String ime, String email, int starost) //ne smeju dva ista konstruktora
    {this.ime= ime;
    this.email=email;
    this.starost=starost;}
}
