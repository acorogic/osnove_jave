package Java_test_2;

public class InstagramMentionAddOn extends InstagramAddOn {

    private String tagovaniKorisnik;
    private InstagramUser user;

    public InstagramMentionAddOn(int koordinataX, int getKoordinataY, int visina, int sirina, String tagovaniKorisnik) {
        super(koordinataX, getKoordinataY, visina, sirina);
        this.tagovaniKorisnik = tagovaniKorisnik;
    }

    public String getTagovaniKorisnik() {
        return tagovaniKorisnik;
    }

    public void setTagovaniKorisnik(String tagovaniKorisnik) {
        this.tagovaniKorisnik = tagovaniKorisnik;
    }

    @Override
    public int minSirina() {
        return 80;
    }

    @Override
    public int minVisina() {
        return 50;
    }

    @Override
    public void stampaj() {
        System.out.println("["+ this.getKoordinataX()+ this.getGetKoordinataY()+ "("+ this.getVisina()+ " "+ this.getSirina()+ ")"+ this.user.generisiLink());

    }
}
