package p08_15_2023;

public class Zadatak8 {
    public static void main(String[] args) {

//        Napisati program koji racuna povrsinu kvadrata stranice a, i povrsinu kruga poluprecnika r. PI = 3.14. Povrsina kruga je r (na kvadrat) * pi
//        Primer izvrsenja:
//        a: 5
//        Povrsina kvadrata je 25
//        r: 3
//        Povrsina kruga je 28.26

        int a =5;
        int povrsinaKvadrata = a*a;
        System.out.println("*******Povrsina Kvadrata je   " + povrsinaKvadrata);

        int r= 3;
        double pi = 3.14;
        double povrsinaKruga= r*r*pi;
        System.out.println("*******Povrsina kruga je   " + povrsinaKruga);


    }
}
