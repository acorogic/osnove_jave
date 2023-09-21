package d09_19_2023.Zadatak1;

public class zadatak1 {
    public static void main(String[] args) {
SuperKartica kartica1= new SuperKartica(1234, "James Bond", 50);



        Ambalaza flasa1= new StaklenaAmbalaza("11111", "coca cola", true, 100);
        Ambalaza flasa2= new StaklenaAmbalaza("22222", "pepsi", true, 200);
        Ambalaza flasa3= new StaklenaAmbalaza("33333", "kisela voda", false, 100);
        Ambalaza tetrapak1= new Tetrapak ("55556", "sok od pommoradze", 500, 550, true, 200);
Korpa korpa1= new Korpa();
        korpa1.dodajAmbalazu(flasa1);
        korpa1.dodajAmbalazu(flasa3);
        korpa1.dodajAmbalazu(flasa3);
        korpa1.dodajAmbalazu(tetrapak1);

        korpa1.izbaciAmbalazu("11111");
        flasa1.stampaj();
        flasa2.stampaj();

        kartica1.stampajKarticu();
    }


}
