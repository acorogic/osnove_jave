package d08_09_2023;

public class FacebookPost {
    String imePrezimeAutorPosta;
    String imePrezimeProfilObjave;
    String teksObjave;
    int brojLajkova;
    int brojDeljenja;

    public void like () { this.brojLajkova= this.brojLajkova +1;}

    public void dislike () {
        this.brojLajkova=this.brojLajkova-1;
        if (this.brojLajkova<0) {this.brojLajkova=0;
        }
    }
public void share () {
        this.brojDeljenja= this.brojDeljenja+1;
}

public void print () {
    System.out.println (imePrezimeAutorPosta + " je objavio novi post" + " >>>>> " + imePrezimeProfilObjave );
    System.out.println(teksObjave);
    System.out.println("likes "+ brojLajkova + "|"+ " Shares "+ brojDeljenja);

}

}
