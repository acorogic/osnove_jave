package p09_18_2023.Zadatak2;

public class StudentOsnovnih extends Student {
    public StudentOsnovnih(String imePrezime, int brIndexa, int godinaStudija) {
        super(imePrezime, brIndexa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        int cenaSkolarine= 90000;
        return cenaSkolarine;
    }

    @Override
    public boolean studijeBudzet() {

boolean budzet;
         if (this.getGodinaStudija()<5) { return  budzet= true;}
         return false;}}





