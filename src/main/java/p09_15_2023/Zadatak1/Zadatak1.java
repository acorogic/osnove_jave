package p09_15_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {



    Osoba osoba1= new Osoba("mika mikic", 223213214);
    osoba1.stampa();
    Student student1= new Student("pera peric", 12345, 333, 4444);
    student1.stampa();

    Profesor profa1= new Profesor("petar petrovic", 383393293, "matematika",  50000);
    profa1.povecajPlatu(10);
    profa1.povecajPlatu(10);
    profa1.stampajProfu();
profa1.povecajPlatu(100);
profa1.stampajProfu();
}}
