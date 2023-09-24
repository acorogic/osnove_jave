package p09_18_2023.Zadatak2;

public class StudentMaster extends Student {

    public StudentMaster(String imePrezime, int brIndexa, int godinaStudija) {
        super(imePrezime, brIndexa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        int cenaSkolarine= 10000;
        return cenaSkolarine;

    }

    @Override
    public boolean studijeBudzet() {
        boolean budzet;
        if (getGodinaStudija()<2) { return budzet=true;}
        return false;


    }}

