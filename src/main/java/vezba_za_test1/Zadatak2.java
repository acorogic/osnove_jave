package vezba_za_test1;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak2 {
    public static void main(String[] args) {
//        2. Zadatak (For petlja)
//        Napisati program koji simulira sumiranje vrednosti po koloni u eksel tabeli. Program
//        ima niz brojeva duzine 25, koji izgleda kao tabela 5x5, niz je sa fiksnim vrednostima
//        tj. ne unosi ih korisnik. Program stampa tabelu na ekranu a zatim od korisnika trazi
//        da unese kolonu po kojoj bi zeleo da sumira vrednosti i na kraju programa ispisuje
//        sumu za trazenu kolonu.
//        Primer izvrsenja:
//        3,1,8,0,1,
//                1,5,7,9,6,
//                3,1,6,5,1,
//                4,5,8,1,7,
//                1,3,2,8,0,
//                Unesite kolonu za sumiranje: 2
//        Suma je 31 (Objasnjenje: jer se sumira 8+7+6+8+2, pogledaj sliku

        ArrayList <Integer> ekselTabela= new ArrayList<>();
        Collections.addAll(ekselTabela,5,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25);
        for (int i = 0; i < ekselTabela.size(); i++) {
            System.out.print(ekselTabela.get(i)+ " ");

            if ((i+1)%5==0){
                System.out.println(" ");

        }}
        int brojKolone= 2;
        int korekcijaBrojakolone= brojKolone-1;
int sumaBrojeva =0;
        for (int i = korekcijaBrojakolone; i <ekselTabela.size() ; i=i+5) {
            int brojeviZaStampu= ekselTabela.get(i);
            sumaBrojeva= sumaBrojeva+ brojeviZaStampu;
            System.out.println(brojeviZaStampu);


        }

        System.out.println("Suma brojeva je: "+sumaBrojeva);
    }
}
