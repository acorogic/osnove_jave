package p09_12_2023;

public class Zadatak2 {
    public static void main(String[] args) {
        Korisnik user= new Korisnik("Mika Mikic" );
        System.out.println(user.getTipLicence());
int duzinaPoziva =user.maxCallDuration();
        System.out.println(duzinaPoziva);

        ZoomCall call1= new ZoomCall("www.ssss.wertwom","test1234");
call1.setGuestUser("pera peric");
call1.setHostUser(user);
user.subscribe(100);
user.resetSubscription();
        call1.printCallDetails();
    }
}
