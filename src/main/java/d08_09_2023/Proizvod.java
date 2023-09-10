package d08_09_2023;

public class Proizvod {
    String nazivProzivoda;
    double cenaProzivoda;
    double tezinaProzivodaG;

    public void stampaj() {
        System.out.println("{{"+ this.nazivProzivoda + "}}"+ "{{"+ this.cenaProzivoda + "}}" + "{{"+ this.tezinaProzivodaG + "}}");

    }

    public void povecajCenu(double povecanje) {
        this.cenaProzivoda= this.cenaProzivoda+ povecanje;
    }

    public double vratiCenuSaPopustom (int popust) {
        double cenaSaPopustom= this.cenaProzivoda- (this.cenaProzivoda*popust/100);
    return cenaSaPopustom;}

    public int racunajPostarinu(){
        int postarina;

        if (this.tezinaProzivodaG<=100) {postarina= 200;}
        else if (this.tezinaProzivodaG>100 && this.tezinaProzivodaG<=500) { postarina=400;

        }

        else {postarina=1000;}
        return postarina;
    }}

