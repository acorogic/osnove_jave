package p09_19_2023.Zadatak2;

public class Skakac extends Atleticar{
    public Skakac(String name, double result) {
        super(name, result);
    }

    @Override
    public boolean betterResult(Atleticar atleticar) {



        if (this.result> atleticar.result) {
            return true;}
        else {return false;}
    }
}
