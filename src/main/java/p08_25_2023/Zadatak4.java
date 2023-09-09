package p08_25_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. Napisati funkciju koja stampa zbir, razliku,
//                proizvod i kolicnik za dva prosledjena broja.
//        Brojevi su ulazni parametri funkcije. U gravnom programu pozvati
//        nekoliko puta funkciju sa razlicitim prosledjenim vrednostima.

        racunskeOperacije(10, 5); //mozemo da d napisemo u zagradi broj1*2, broj 2*2

    }
    public static void racunskeOperacije(int broj1, int broj2) {
        System.out.println("zbor je " + broj1+broj2);
        System.out.println("razlika brojeva  " + (broj1 - broj2));
        System.out.println("prozivod je " + broj1* broj2) ;
        System.out.println("kolicnik je " + broj1/broj2);
    }

}
