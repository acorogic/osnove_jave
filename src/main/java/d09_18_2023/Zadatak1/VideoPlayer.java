package d09_18_2023.Zadatak1;

public class VideoPlayer {
//    Kreirati klasu VideoPlayer koja ima:
//    duzinu videa
//    trenutno vreme videa
//    jacinu zvuka
//    Kvalitet videa (144, 240, 360, 480, 720, 1080)
//    gettere, settere i konstruktore
//    metodu stampaj koja stampa podatke u formatu:
//    trenutno vreme videa
//    jacina zvuka
//    kavlitet videa

    private int videoLenght;
    private int videoCurrentTime;
    private int volume;

    public VideoPlayer() {
    }



    private  String videoQuality;

    public int getVideoLenght() {
        return videoLenght;
    }

    public VideoPlayer(int videoCurrentTime, int volume, String videoQuality) {
        this.videoCurrentTime = videoCurrentTime;
        this.volume = volume;
        this.videoQuality = videoQuality;
    }

    public void setVideoLenght(int videoLenght) {
        this.videoLenght = videoLenght;
    }

    public int getVideoCurrentTime() {
        return videoCurrentTime;
    }

    public void setVideoCurrentTime(int videoCurrentTime) {
        this.videoCurrentTime = videoCurrentTime;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getVideoQuality() {
        return videoQuality;
    }

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    public void stampaj(){
        System.out.println("trenutno vreme videa je: "+ this.videoCurrentTime + " jacina zvuka je: "+ this.volume+ " kvalitet videa je: " +this.videoQuality);
    }
}
