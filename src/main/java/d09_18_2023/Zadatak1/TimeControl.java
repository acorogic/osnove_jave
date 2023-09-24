package d09_18_2023.Zadatak1;

public class TimeControl extends Control {

    //    Kreirati klasu TimeControl koja nasledjuje klasu Control i
//    konstruktore
//    ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
//    implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s
//    unapred ili unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.

    private boolean moveForvardBackward;

    public TimeControl(VideoPlayer videoPlayer, boolean moveForvardBackward) {
        super(videoPlayer);
        this.moveForvardBackward = moveForvardBackward;
    }

    public boolean isMoveForvardBackward() {
        return moveForvardBackward;
    }

    public void setMoveForvardBackward(boolean moveForvardBackward) {
        this.moveForvardBackward = moveForvardBackward;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {


        if (this.moveForvardBackward = true) {
            if
            (this.videoPlayer.getVideoLenght() - 15 <= this.videoPlayer.getVideoCurrentTime()) {
                this.videoPlayer.setVideoCurrentTime(this.videoPlayer.getVideoCurrentTime() + 15);
            } else {
                this.videoPlayer.setVideoCurrentTime(this.videoPlayer.getVideoCurrentTime());
            }
        } else {
            if (this.videoPlayer.getVideoLenght() + 15 <= this.videoPlayer.getVideoCurrentTime()
            ) {
                this.videoPlayer.setVideoCurrentTime(this.videoPlayer.getVideoCurrentTime() - 15);
            } else {
                this.videoPlayer.setVideoCurrentTime(this.videoPlayer.getVideoCurrentTime());
            }
        }
    }


}




