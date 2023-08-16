package d08_15_2023;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati program koji stampa verziju softvera. Verzija softvera se
//        sastoji od major, minor i patch brojeva. Koristan link za verzionisanje softvera.
//                Odstampati na ekranu verziju softvera u formatu:
//[MAJOR].[MINOR].[PATCH]
//
//        Objasnjenje: Npr u projektu koristite google-map paket sa
//        verzijom 2.0.1 to znaci da je major 2, minor 0 i patch 1.
//     koriscen primer verzije Chroma :Version 115.0.5790.171
        int major = 115;
        int minor= 5790;
        int patch =171;

        System.out.println("You are  using " +  major+ "." + minor+ "."+ patch + "  version of Chrome");


    }
}
