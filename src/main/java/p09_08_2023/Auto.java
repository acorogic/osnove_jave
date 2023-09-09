package p09_08_2023;

//2.  Zadatak
//        Kreirati klasu Auto koja ima:
//        ime i prezime vozaca
//        marku automobila
//        broj vrata
//        potrosnju na 100km (npr: 3.6 litra)
//        trenutnu brzinu kojom se auto krece
//        metodu za stampu koja stampa podatke u formatu:
//        [Vozac]
//        [Marka] - [br vrata]-ro vrata
//        Sa potrosnjom od [potrosnja] l na 100km
//        [Trenutna brzina auta] km/h je trenutna brzina.
//
//        Primer:
//        Milan Jovanovic
//        BMW - 5-ro vrata
//        Sa potrosnjom od 10 l na 100km
//        200 km/h je trenutna brzina


public class Auto { String vozac;
    String markaAuta;
    int brojVrata;
    int potrosnja;
    int brzina;

    int godinaProizvodnje;
    int mesecRegistracije;
    int kubikaza;



public void print () {
    System.out.println(this.vozac);
    System.out.println(this.markaAuta);
    System.out.println(this.brojVrata);
    System.out.println(this.potrosnja);
    System.out.println(this.brzina);

}
    public boolean jePrekoracio (int ogranicenje) {
        if (this.brzina>ogranicenje) { return true;}

        else {return false;}

}
public boolean oldtimer () {
    if (this.godinaProizvodnje<=1950) { return true;}
    else {return false;}

}
public boolean istekRegistracije(int trenutniMesec) {

    if (trenutniMesec>=this.mesecRegistracije) {return true;}
    else return false;
}


    public double cenaRegistracije () {
    if (this.kubikaza<= 2000) {double registracija= this.kubikaza*100;
    return registracija;}


    else { double ekstraRegistracija= (this.kubikaza*100)+ (this.kubikaza*100)*0.3;
    return ekstraRegistracija;}



//    metodu koja vraca da li je auto oldtimer, svaki auto proizveden pre 1950 je oldtimer.
//    metodu koja vraca da li je istekla registracije. Metoda kao parametar prima trenutni mesec i
//    na osnovu toga vraca true ili false.
//    metodu koja racuna i vraca cenu registracije za auto. Za automobile do 2000 kubika cena
//    registracije kubikaza * 100din, za automobile preko 2000 kubika dodatno se uracunava 30% na cenu.

}}