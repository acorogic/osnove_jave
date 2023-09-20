package d09_18_2023.Zadatak1;

public class AudioContol extends Control {


//    Kreirati klasu AudioControl koja nasledjuje klasu Control i
//    gettere, settere i konstruktore
//    ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
//    implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100


    private boolean volumeUpDown;

    public AudioContol(VideoPlayer videoPlayer, boolean volumeUpDown) {
        super(videoPlayer);
        this.volumeUpDown = volumeUpDown;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (volumeUpDown = true) {
            if (this.videoPlayer.getVolume() < 100 && this.videoPlayer.getVolume() >= 0) {
                this.videoPlayer.setVolume(this.videoPlayer.getVolume() + 1);
            } else {
                this.videoPlayer.setVolume(100);
            }
        } else {
            if (this.videoPlayer.getVolume() < 100 && this.videoPlayer.getVolume() >= 0) {
                this.videoPlayer.setVolume(this.videoPlayer.getVolume() - 1);
            } else {
                this.videoPlayer.setVolume(0);
            }


        }
    }
}
