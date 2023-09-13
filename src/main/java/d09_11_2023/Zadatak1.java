package d09_11_2023;

public class Zadatak1 {
    public static void main(String[] args) {



    Autor nobelovac = new Autor("Zan Mari Gistav", "Le Klezio");
    Autor domaciAutor= new Autor("Desanka", "Maksimovic");

    Knjiga knjiga1= new Knjiga();
knjiga1.setAutor(nobelovac);
knjiga1.setGodina(2004);
knjiga1.setISBN("12234566789");
knjiga1.setNaziv("Mucnina");
knjiga1.print();




Knjiga knjiga2= new Knjiga();
        knjiga2.setAutor(domaciAutor);
        knjiga2.setGodina(1975);
        knjiga2.setISBN("22343343532");
        knjiga2.setNaziv("Krvava Bajka");
        knjiga2.print();
}}
