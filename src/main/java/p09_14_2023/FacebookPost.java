package p09_14_2023;

import java.util.ArrayList;

public class FacebookPost {
    private String imePrezimePost;
    private String objava;

    private ArrayList<Reakcija> reakcije;



    public FacebookPost(String imePrezimePost, String objava) {
        this.imePrezimePost= imePrezimePost;
        this.objava=objava;
        this.reakcije = new ArrayList<>();
    }




    public String getImePrezimePost() {
        return imePrezimePost;
    }

    public void setImePrezimePost(String imePrezimePost) {
        this.imePrezimePost = imePrezimePost;
    }

    public String getObjava() {
        return objava;
    }

    public void setObjava(String objava) {
        this.objava = objava;
    }

    public ArrayList<Reakcija> getReakcije() {
        return reakcije;
    }

    public void setReakcije(ArrayList<Reakcija> reakcije) {
        this.reakcije = reakcije;
    }

    public void reaguj(Reakcija novaReakcija) {
        this.reakcije.add(novaReakcija);
    }

    private int brojReakcija(String reakcija) {
        int brojReakcija = 0;
        for (int i = 0; i < reakcije.size(); i++) {
            if (reakcije.get(i).getReakcija().equals(reakcija)) {
                return brojReakcija++;
            }


        }

        return brojReakcija;
    }

    public void stampaBrojReakcija() {
        System.out.println("broj reakcija je" + brojReakcija("lajk"));
    }

}
