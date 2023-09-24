package p09_14_2023;

import java.util.ArrayList;

public class Reziser {
    private String punoIme;
    private ArrayList<Film> filmovi; //niz mora biti kreiran u konstruktoru, bez setera, setovanje se odvija u metodi

    public Reziser(ArrayList<Film> filmovi) {
        this.filmovi = filmovi; //kreira niz
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

//  public void dodajFilm(Film) {
//        filmovi.add(Film);
    }

