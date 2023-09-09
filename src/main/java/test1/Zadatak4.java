package test1;

public class Zadatak4 {
    public static void main(String[] args) {
//        Napišite metode koje omogućavaju pakovanje teksta u HTML elemente.
//                Prva metoda, kao parametre, prima tekst i tip, a vraća HTML element (String) s
//        prosleđenim tekstom. Metoda podržava sledeće tipove:
//
//        - "bold": Metoda pakuje tekst u <b>prosleđeni tekst</b>.
//        - "italic": Metoda pakuje tekst u <em>prosleđeni tekst</em>.
//        - "paragraph": Metoda pakuje tekst u <p>prosleđeni tekst</p>.
//
//        Ako se prosledi tip koji nije podržan, vraća se neupakovan tekst, tj.
//                vraća se takav kakav je bio prosleđen metodi.
//
//                Druga metoda služi za kreiranje HTML anchor taga.
//                Metoda kao parametre prima link i tekst koji treba da bude linkovan.
//                Metoda vraća tekst u formatu <a href=prosleđeniLink>Prosleđeni tekst</a>.
//
//        U glavnom programu, koristeći kreirane metode, napišite program koji prikazuje sledeći tekst:
//<a href=google.com>Welcome to Google</a>
//<b>Ovaj deo je bold</b>, a <em>ovo je italic</em>
//<p>Naravno samo je falio paragraf</p>
        System.out.println(tektUhtml("Ovaj deo je bold", "bold"));

        System.out.println(tektUhtml("ovo je italic","italic"));

        System.out.println(tektUhtml("Naravno samo je falio paragraf", "paragraph"));

        System.out.println(anchorTag("google.com", "Welcome to Google"));

    }
    public static String tektUhtml (String tekst, String elementTip) {
        String wrapedText= tekst;
        if (elementTip.equals("bold")) {  wrapedText= "<b>" + tekst + "<b>";}
        else if (elementTip.equals("italic")) { wrapedText="<em>" + tekst +"<em>";}
        else if (elementTip.equals("paragraph")) {wrapedText= "<p>" + tekst+ "<p>";}

        return wrapedText;

        }

        public static String anchorTag (String link, String teksLinka) {
        String linkPrikaz = "<a href=" + link + "</" + teksLinka+ "</a>";
        return linkPrikaz;

    }


    }
