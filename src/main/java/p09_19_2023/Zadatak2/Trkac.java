package p09_19_2023.Zadatak2;

public class Trkac extends Atleticar{


    public Trkac(String name, double result) {
        super(name, result);
    }

    @Override
    public boolean betterResult(Atleticar a) {

            if (a.result< this.result) {
                return true;}
            else {return false;}
    }}

