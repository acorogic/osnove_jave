package p08_25_2023;

public class povratniTipMetode {
    public static void main(String[] args) {

      printUser("aco", "rogic");
      String getovanje = vracanjeStringa();

    }
    public static void  printUser (String ime, String prezime){

    }//void ne vraca nista kao povratnu vrednost

    public static String vracanjeStringa() {
        return  "pera"; //povratna vrednost mora biti u istom tipu koji je deklarisan u metodi
        ///return uvek vraca jednu vrednost
    }
}
