package Java_test_2;

import java.util.ArrayList;

public class InstagramStory {

    private InstagramUser autorStorija;
    private String swipeUp;

    private String linkDoSlike;
    private ArrayList<InstagramAddOn> addOns;
    private ArrayList<InstagramUser> instagramUsers;

    public InstagramStory(InstagramUser autorStorija, String swipeUp, String linkDoSlike) {
        this.autorStorija = autorStorija;
        this.swipeUp = swipeUp;
        this.linkDoSlike = linkDoSlike;
        this.addOns = new ArrayList<>();
        this.instagramUsers = new ArrayList<>();
    }

    public InstagramUser getAutorStorija() {
        return autorStorija;
    }

    public String getSwipeUp() {
        return swipeUp;
    }

    public String getLinkDoSlike() {
        return linkDoSlike;
    }

    public ArrayList<InstagramAddOn> getAddOns() {
        return addOns;
    }

    public ArrayList<InstagramUser> getInstagramUsers() {
        return instagramUsers;
    }

    public void setSwipeUp(String swipeUp) {
        this.swipeUp = swipeUp;
    }

    public void dodajAddOn(InstagramAddOn novAddOn) {
        this.addOns.add(novAddOn);
    }


    public void obrisiAddOn(String addOnId) {
        for (int i = 0; i < addOns.size(); i++) {
            if (addOnId.equals(addOns.get(i).getId())) {
                addOns.remove(i);
            }
        }


    }

    private boolean korisnikPogledaoStory(String user) {
        for (int i = 0; i < instagramUsers.size(); i++)
            if (instagramUsers.get(i).getUsernameKorisnika().equals(user))
            {return true;}


    else {return false;}

            return false;}

public void pogledajStory(InstagramUser user) {
        if (korisnikPogledaoStory(user.getUsernameKorisnika() )){ instagramUsers.add(user);
}}


    public void postaviStory() {
        System.out.println( "@"+ this.autorStorija+ "/t"+ autorStorija.getImePrezime() );
        System.out.println("Story");
        System.out.println("image"+ this.linkDoSlike);

        for (int i = 0; i < addOns.size(); i++) {
            System.out.println(addOns.get(i));


        }

        if (swipeUp!= null) {
            System.out.println("swipe up");

    }}

    public int brojPregleda() {
        return instagramUsers.size();
    }

    public void korisniciKoijisuPregledaliStory()
    {
        System.out.println("pregledali" + this.brojPregleda());
        for (int i = 0; i < instagramUsers.size(); i++) {
            instagramUsers.get(i).stampa();
        }

        }

}





















