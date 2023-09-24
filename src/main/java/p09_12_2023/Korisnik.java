package p09_12_2023;

public class Korisnik {
    private String imePrezime;
    private String tipLicence;

    Korisnik(String imePrezime) {
        this.imePrezime=imePrezime;
        this.tipLicence= "basic";
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public String getImePrezime() {
        return imePrezime;
    }


    public void setTipLicence(String tipLicence) {
        this.tipLicence = tipLicence;
    }
    public String getTipLicence() {
        return tipLicence;
    }

    public void subscribe(int uplata) {
        if (uplata==100) {this.tipLicence = "pro";
        }
        else if (uplata==150) {this.tipLicence="premium";}
}

public void resetSubscription () {
        this.tipLicence="basic";
}

public int maxCallDuration (){
        int callDurattion;

        if (tipLicence.equals("basic")){  callDurattion=40;
} else if (tipLicence.equals("pro")) { callDurattion=240;

        }
        else {callDurattion=1440;
}
        return callDurattion; }

    public void print (){
        System.out.println(this.imePrezime);
    }

}


