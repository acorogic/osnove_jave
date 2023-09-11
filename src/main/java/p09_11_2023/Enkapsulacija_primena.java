package p09_11_2023;

public class Enkapsulacija_primena {
    public static void main(String[] args) {


        User noviUser= new User();
        noviUser.ime= "mika";
       String x=  noviUser.GetEmail();
noviUser.SetEmail("aco@123");

noviUser.stampaEmail();

User m= new User();
    }
}
