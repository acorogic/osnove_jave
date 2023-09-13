package d09_12_2023;

public class ZeleniKarton {
//    Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//    ime i prezime studenta
//    broj indeksa
//    naziv predmeta
//    ime i prezime profesora
//    ocenu - od 5 do 10
//    gettere i settere
//            konstruktore
//    metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//    kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//    Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite

    private String student;
    private int brIndexa;
    private String predmet;
    private String profesor;

    private int ocena; //od 5-10

  ZeleniKarton(String student, int brIndexa, String predmet, String profesor, int ocena) {
      this.student=student;
      this.brIndexa= brIndexa;
      this.predmet= predmet;
      this.profesor=profesor;
      this.ocena=ocena;
    }

    public int getOcena() {
        return ocena;
    }

    public boolean statusIspita (){
            boolean polozen;
    { if (this.ocena==5) { return polozen = false;}
        else {return polozen=true;}

    }
}

public void stampaj (){
    System.out.println(this.predmet + "-"+ this.ocena);
    System.out.println("student "+ this.student+ "," + this.brIndexa);
    System.out.println("profesor " + this.profesor);
}


}
