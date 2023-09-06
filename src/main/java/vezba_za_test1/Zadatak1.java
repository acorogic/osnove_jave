package vezba_za_test1;

public class Zadatak1 {
    public static void main(String[] args) {

//
//        Prvi Java Test
//        1. Zadatak (Grananja)
//        Napisati program koji simulira notifikaciju za novu verziju aplikacije. Korisnik unosi
//        verziju aplikacije koju ima instaliranu na svom racunaru a zatim najnoviju verziju,
//        nakon cega se ispisuje notifikacija.
//● Verzija aplikacije se sastoji od major i minor broja. Aplikacije imaju verziju
//        uglavnom u formatu major.minor i primer bi bio Facebook 2.1 gde je
//        major=2 i minor=1
//● Aplikacija je novije verzije ukoliko je:
//○ major broj veci ili
//○ ukoliko je major isti, tada nova verzija ima veci minor
//        Napomena: Smatrati da korisnik za najnoviju verziju unosi vecu ili istu verziju od
//        instalirane, nikako manju.
//                Primer izvrsenja 1:
//        Unesite major verziju instalirane aplikacije: 4
//        Unesite minor verziju instalirane aplikacije: 5
//        (Obasnjenje) Na racunaru je instalirana verzija 4.5
//        Unesite major verziju najnovije aplikacije: 4
//        Unesite minor verziju najnovije aplikacije: 7
//        (Obasnjenje) Najnovija verzija je 4.7.
//                Notifikacija: Nova verzija aplikacije je dostupna za instalaciju.
//                Primer izvrsenja 2:
//        Unesite major verziju instalirane aplikacije: 4
//        Unesite minor verziju instalirane aplikacije: 5
//        (Obasnjenje) Na racunaru je instalirana verzija 4.5
//        Unesite major verziju najnovije aplikacije: 4
//        Unesite minor verziju najnovije aplikacije: 5
//        (Obasnjenje) Najnovija verzija je 4.5.
//                Notifikacija: Vec imate najnoviju verziju na svom racunaru.
//                Primer izvrsenja 3:
//        Unesite major verziju instalirane aplikacije: 3
//        Unesite minor verziju instalirane aplikacije: 9
//        (Obasnjenje) Na racunaru je instalirana verzija 3.9
//        Unesite major verziju najnovije aplikacije: 4
//        Unesite minor verziju najnovije aplikacije: 2
//        (Obasnjenje) Najnovija verzija je 4.2
        int major1 = 2;
        int minor1=3;

         int major2= 2;
        int minor2=3;

        System.out.println("Na racunaru je instalirana " + major1+ "." + minor1 + "verzija" );
                if ((major2>major1) || (major1==major2) && (minor2>minor1)) {
                    System.out.println("najnovija verzija je: " + major2+ "." + minor2 + " "+ "Nova verzija aplikacije je dostupna za instalaciju");}

                    else {
                        System.out.println("Vec imate najnoviju verziju na svom racunaru.");
                }
    }
}
