package p08_25_2023;

public class metodeKreiranjePromenljivih {
    public static void main(String[] args) {
        String user= "aleksandar";
        stampa("aco", "rogic", true);

        //ovako se dostavljaju promeljive iz maina u metodu kroz unosenje u zagrade paramtra metode


    }
    public static void stampa( String firstNAme, String lastName, boolean aktivan) { //svaka metoda ima svoje promenljive
        //parametri metode kreacija promeljivih
        if (aktivan == true) //ili ako je aktivan samo, skraceni oblik
        {
            System.out.print("0 ");
        }
        else
        {
            System.out.print("x ");
        }
        System.out.println(firstNAme+ " " + lastName);
    }
}
