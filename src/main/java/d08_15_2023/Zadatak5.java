package d08_15_2023;

public class Zadatak5 {
    public static void main(String[] args) {
//        Napisati program koji racuna i ispisuje povrsinu i obim trougla.
//        KOREN BROJA 3 neka bude konstanta 1.73.
//            Za stranicu trougla postavite proizvoljnu vrednost.
//                Primer izvrsenja programa:
//        a: 10
//        Povrsina je 43.25
//        Obim je 30

        //neophodne formule:
        // površina  jednakostranicnog trougla p= ((a*a)*1.73)/4
        //obim   jednakostranicnog trougla: o=3a
        System.out.println("*****Povrsina i obim  jednakostranicnog trogula******");

        int a= 20;
        double povrsina= ((a*a)*1.73)/4;
        int obim= 3*a;

        System.out.println("Povrsina jednakostranicnog trougla je:  " + povrsina);
        System.out.println("Obim jednakostranicnog trougla je:   "+ obim);




    }
}
