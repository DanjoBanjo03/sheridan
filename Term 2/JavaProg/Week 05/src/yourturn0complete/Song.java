package yourturn0complete;

public class Song {
    private String title;
    private String artist;
    private int numSeconds;

    public Song(String title, String artist, int numSeconds) {
        this.title = title;
        this.artist = artist;
        this.numSeconds = numSeconds;
    }

    public String getTitle()
    {
        return title;
    }

    public String getArtist()
    {
        return artist;
    }

    public int getNumSeconds()
    {
        return numSeconds;
    }

}
