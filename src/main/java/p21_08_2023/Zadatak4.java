package p21_08_2023;

public class Zadatak4 {
    public static void main(String[] args) {

//        Napisati program koji pronalazi 7 stepen broja 2. Koristeci FOR petlju
//        Izvrsenje:
//        2 na stepen 7 je 128
//
//        Podsetnik: 2 na 7 moze da se predstavi kao  2 * 2 * 2 * 2 * 2 * 2 * 2

        int prod= 1; //(neutrlna osnova za mnoznje)
        int onsova= 2;
        int stepen= 7;

        for (int i = 1; i <= 7; i++) {
            prod= prod* onsova; }

        System.out.println(stepen +"mi" +" stepen" + " broja " + onsova + " je "+ prod);



        }
    }

