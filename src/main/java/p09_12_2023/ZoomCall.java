package p09_12_2023;

public class ZoomCall {
    private String callLink;

    private String password;

    private  Korisnik hostUser;
    private String guestUser;

    ZoomCall (String callLink, String password) {
        this.callLink=callLink;
        this.password=password;
    }

    public String getCallLink() {
        return callLink;
    }

    public String getPassword() {
        return password;
    }

    public Korisnik getHostUser() {
        return  hostUser;
    }

    public String getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(String guestUser) {
        this.guestUser = guestUser;
    }

    public void setHostUser(Korisnik hostUser) {
        this.hostUser = hostUser;
    }


    public void printCallDetails (){
        System.out.println("zoom call:"+ this.callLink);
        System.out.println("password:"+ this.password);
        System.out.println("host:"+ this.hostUser);
        System.out.println("guest" + this.guestUser);
        System.out.println("maks trajanje poziva"+ hostUser.maxCallDuration() + "minuta");
    }
}
