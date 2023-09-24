package p09_19_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {


        Disciplina skokUdalj = new Disciplina("bacanje kamena s ramena", "skakacka");
        Skakac skakac1 = new Skakac("skocimis skocic", 52);
        Skakac skakac2 = new Skakac("kengur skocic", 55);

        Skakac skakac3 = new Skakac("poskok skocic", 3);
        skokUdalj.addAtleticar(skakac1);
        skokUdalj.addAtleticar(skakac2);
        skokUdalj.addAtleticar(skakac3);

        skakac1.print();


        if (skakac1.betterResult(skakac2)) {
            System.out.println("bolje rezulate ima : " + skakac1.getName());}
        else {System.out.println("bolje rezulatate ima:" + skakac2.getName());}



            skokUdalj.disqualifyAtleticar("poskok skocic");

        System.out.println(skokUdalj.bestAteleticar().getName());
        }
    }
