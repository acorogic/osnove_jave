package p09_11_2023;

public class Zadatak3 {
    public static void main(String[] args) {

        Reziser reziser1= new Reziser();

        reziser1.setImeIprezime("mika mikic");
        reziser1.setStarostRezisera(55);



        reziser1.stampa();

        Film film1= new Film("Rambo", 1982, reziser1);
        //film1.setNazivFilma("sam u kuci");
        //film1.setGodinaFilma(1999);
        film1.stampa();

        //reziser1.reziraoFilm(film1); // povezani su objekti reziser i film  preko tipa promeljive Film


    }
}
