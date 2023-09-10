package d08_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {



//    2.Kreirati klasu FacebookPost koja ima:
//    Od atributa:
//    ime i prezime korisnika koji je objavio post
//    ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    tekst objave
//    broj lajkova
//    broj deljenja
//    Od metoda:
//    like(), koja povecava broj lajkova za 1.
//    dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//    share(), koja povecava broj deljenja za 1
//    print(), koja stampa objavu u formatu:
//            (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//            (tekst objave)
//    Likes (broj lajkova) | Shares (broj deljenja)
//
//    U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//    Primer stampanja:
//    Milan Jovanovic >>> Pera Peric
//    Ovo je tekst objave
//    Likes 3 | Shares 1

        FacebookPost post1= new FacebookPost();
        post1.imePrezimeAutorPosta= "Dezurni Smarac";
        post1.imePrezimeProfilObjave= "Smoreni Lik";
        post1.teksObjave= "e brate vidi ovo";
        post1.brojLajkova= 0;
        post1.brojDeljenja=2;

        //post1.dislike();
        post1.like();
        post1.print();


        FacebookPost post2= new FacebookPost();
        post2.imePrezimeAutorPosta= "Mika Mikic";
        post2.imePrezimeProfilObjave= "Pera Peric";
        post2.teksObjave= "Srbija je prvak sveta";
        post2.brojLajkova= 2;
        post2.brojDeljenja=0;

        post2.share();
        post2.print();

}}
