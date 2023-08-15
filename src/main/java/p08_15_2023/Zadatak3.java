package p08_15_2023;

public class Zadatak3 {
    public static void main(String[] args) {
//
//        Napisati program koji na ekranu stampa podatke u formatu:
//[IME I PREZIME]
//[BROJ TELEFONA], [ULICA I BROJ], [GRAD]
//[EMAIL]

        String imeIprezime = "Aleksandar Rogic";
        int brojTelefona = 064123456;
        String ulicaIbroj = "Knjaza Milosa br 99";
        String grad = "Pozega";
        String email= "acorogic@gmail.com";
        System.out.println(imeIprezime);
        System.out.println(brojTelefona+ "," + ulicaIbroj+","+ grad);
        System.out.println(email);

    }
}
