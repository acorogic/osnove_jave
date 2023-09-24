package p09_18_2023.Zadatak3;

public class  JednakostranicniTrougao extends Figura {

    private int stranicaA;

    public JednakostranicniTrougao(int stranicaA) {
        this.stranicaA = stranicaA;
    }

    @Override
    public double povrsina() {
          double povrsina= (stranicaA*stranicaA)* 1.73/4;
    return povrsina;}

    @Override
    public double obim() {
        double obim= stranicaA*3;
        return obim;

    }
}
