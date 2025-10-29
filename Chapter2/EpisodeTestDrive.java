
class Episode {

    int seriesNumber;
    int episodeNumber;

    void skipIntro() {
        System.out.println("Skipping intro...");
    }

    void skipToNext() {
        System.out.println("Loading next episode...");
    }

    void play() {
        System.out.println("Playing Episode");
        System.out.println(seriesNumber);
        System.out.println(episodeNumber);
    }
}
    
public class EpisodeTestDrive {

    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.episodeNumber = 5;

        episode.skipIntro();
        episode.skipToNext();
        episode.play();

    }
}
