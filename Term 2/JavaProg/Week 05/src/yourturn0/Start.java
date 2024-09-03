package yourturn0;

public class Start {
    public static void main(String[] args)
    {

        //Take a look at MusicService - MusicService was written by another programmer and sometimes throws and error instead of returning a song.

        MusicService service = new MusicService();

        //Your job is to protect this loop so that, if an Exception is thrown, you can shut the program down gracefully by printint out that "Music Service it down for routine maintenance"

        for (int i = 0; i < 50; i++)
        {
            String nextSongName = service.getNextSong().getTitle();
            System.out.println(nextSongName);
        }
    }
}
