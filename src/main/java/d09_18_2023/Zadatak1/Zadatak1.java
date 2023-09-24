package d09_18_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {
        VideoPlayer smijesniVideo= new VideoPlayer();
        smijesniVideo.setVolume(50);
        smijesniVideo.setVideoLenght(100);
        smijesniVideo.setVideoCurrentTime(60);
        smijesniVideo.setVideoQuality("144");
        smijesniVideo.stampaj();

        Control time= new TimeControl(smijesniVideo, true);

        time.izvrsiAkciju(smijesniVideo);


        Control audio = new AudioContol(smijesniVideo, true);
        audio.izvrsiAkciju(smijesniVideo);

        smijesniVideo.stampaj();

        Control quality = new QualityOptimizerContol(smijesniVideo, 1000);
        quality.izvrsiAkciju(smijesniVideo);

        smijesniVideo.stampaj();


    }
}
