package p09_14_2023;

public class Zadatak2 {
    public static void main(String[] args) {


        Reakcija reakcija1 = new Reakcija("srce", "jovan jovanovic");
        Reakcija reakcija2 = new Reakcija("lajk", "mika peric");

        Reakcija reakcija3 = new Reakcija("smajli", "pera mikic");

        FacebookPost post1 = new FacebookPost("zika zikic", "helloo");

post1.reaguj(reakcija1);
post1.reaguj(reakcija2);
post1.stampaBrojReakcija();


    }}