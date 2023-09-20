package d09_18_2023.Zadatak1;

public class QualityOptimizerContol extends Control {
    //    Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
//    ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
//    gettere, settere i konstruktore
//    implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
//    Kvalitet se racuna na osnovu formule:
//    brzina interneta * 10.1, gde se uzima prvi veci kvalitet
//    npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
//    npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
//    npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    private int internetSpeed; //mb/s

    public int getInternetSpeed() {
        return internetSpeed;
    }

    public QualityOptimizerContol(VideoPlayer videoPlayer, int internetSpeed) {
        super(videoPlayer);
        this.internetSpeed = internetSpeed;
    }

    public void setInternetSpeed(int internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        //brzina interneta * 10.1, gde se uzima prvi veci kvalitet
        //Kvalitet videa (144, 240, 360, 480, 720, 1080)
        double internetQuality = this.internetSpeed*10.1;

        if (internetQuality>10.1 && internetQuality<= 200) {this.videoPlayer.setVideoQuality("144");}
        else if (internetQuality>200 && internetQuality<=360) {this.videoPlayer.setVideoQuality("240");}
        else if (internetQuality>360 && internetQuality<= 480) {this.videoPlayer.setVideoQuality("360");}
        else if (internetQuality>480 && internetQuality<= 720) {this.videoPlayer.setVideoQuality("480");}
        else if (internetQuality>720 && internetQuality<= 1080) {this.videoPlayer.setVideoQuality("720");}
        else if (internetQuality>1080) {this.videoPlayer.setVideoQuality("1080");}

    }

    }






