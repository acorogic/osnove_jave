package d09_18_2023.Zadatak1;

public abstract class Control {
//    Kreirati apstraktnu klasu Control koja ima:
//    abstraktnu metodu izvrsi akciju, koja kao parametar prima objekat VideoPlayer
protected VideoPlayer videoPlayer;

    public Control(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    public abstract void izvrsiAkciju (VideoPlayer videoPlayer);
}
