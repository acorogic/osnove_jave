package p09_18_2023.Zadatak3;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) {


//        Pravougaonik pravougaonik1= new Pravougaonik(4, 5);
//        pravougaonik1.stampa();
//
//        JednakostranicniTrougao trougao1= new JednakostranicniTrougao(5);
//
//        trougao1.stampa();

FigureGenerator generator= new FigureGenerator();
Figura t1= generator.generateFigure("trougao"); //!!!!!!!!
        Figura p2= generator.generateFigure("pravpugaonik");


FigureGenerator trougao= new FigureGenerator();
trougao.generateFigure("jednakostranicni trougao");

        ArrayList<Figura> figuras = new ArrayList<>();
        //JednakostranicniTrougao t1= new JednakostranicniTrougao(10);
        Figura t2= new JednakostranicniTrougao(4);

        figuras.add(new JednakostranicniTrougao(5));
        figuras.add(t1);
        figuras.add(new Pravougaonik(3, 5));

double  povrsine=0;
double obimi = 0;
        for (int i = 0; i < figuras.size(); i++) {
povrsine= povrsine+ figuras.get(i).povrsina();
obimi= obimi+ figuras.get(i).obim();
        }




    }
}
