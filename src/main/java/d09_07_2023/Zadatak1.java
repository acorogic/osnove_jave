package d09_07_2023;

public class Zadatak1 {
    public static void main(String[] args) {
//        Zadatak 1: Kreiranje klase "Student"
//        Napišite klasu "Student" koja ima sledeće atribute: ime (String),
//                brojIndeksa (int) i fakultet (String). Kreirajte 2-3 objekta ove
//        klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

        Student student1 = new Student();
        student1.ime = "Mika Mikic";
        student1.faklutet = "Fakultet sporta";
        student1.brojIndeksa = 1234;

        Student student2 = new Student();
        student2.ime = "Lepa Lukic";
        student2.faklutet = "Fakultet muzike";
        student2.brojIndeksa = 1234;

        Student student3 = new Student();
        student3.ime = "Raka Rakic";
        student3.faklutet = "Fakultet politickih nauka";
        student3.brojIndeksa = 1234;

        System.out.println(student1.ime + " sa brojem indeksa " + student1.brojIndeksa + " studira " + student1.faklutet);
        System.out.println(student2.ime + " sa brojem indeksa " + student2.brojIndeksa + " studira " + student2.faklutet);
        System.out.println(student3.ime + " sa brojem indeksa " + student3.brojIndeksa + " studira " + student3.faklutet);

    }
}
