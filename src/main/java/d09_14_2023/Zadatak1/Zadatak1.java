package d09_14_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {


        Ispit matematika= new Ispit("mata", 5, "zika peric");
Ispit srpski= new Ispit("srpski jezik", 10, "desanka maksimovic");
        Student brucos = new Student(333, "jovan jovanovic", "osnovone");
        matematika.printIspit();
        brucos.dodajIspit(matematika);
        brucos.dodajIspit(srpski);

        brucos.srednjaOcena();
        brucos.stampajSrednjuOcenu();

    }
}
