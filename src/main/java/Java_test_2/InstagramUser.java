package Java_test_2;

public class InstagramUser {
    private String usernameKorisnika;
    private String imePrezime;

    public InstagramUser(String usernameKorisnika) {
        this.usernameKorisnika = usernameKorisnika;
    }

    public InstagramUser(String usernameKorisnika, String imePrezime) {
        this.usernameKorisnika = usernameKorisnika;
        this.imePrezime = imePrezime;
    }

    public String getUsernameKorisnika() {
        return usernameKorisnika;
    }



    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void stampa() {
        System.out.println("@"+this.usernameKorisnika+ "/t" + this.imePrezime);
    }

    public String generisiLink () {
        String link="https://www.instagram.com/"+"["+this.usernameKorisnika+"]/";
return  link;

    }
}
