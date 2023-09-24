package p09_19_2023.Zadatak2;

public abstract class Atleticar {
    private String name;
    protected double result;


    public Atleticar(String name, double result) {
        this.name = name;
        this.result = result;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean betterResult (Atleticar atleticar);




    public void print(){
        System.out.println(this.name+ "," + this.result);
    }

}
