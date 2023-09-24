package p09_18_2023.Zadatak3;



public class FigureGenerator {

    public FigureGenerator() {
    }

    public Figura generateFigure (String tipFigure) {
        if (tipFigure.equals("trougao")) {
            return new JednakostranicniTrougao(5);
        } else if (tipFigure.equals("pravougaonik")) {
            return new Pravougaonik(5, 10);
        }

return null;
    }}
