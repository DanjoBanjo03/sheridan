package yourturn0complete;

public class Start {
    public static void main(String[] args)
    {

        //Take a look at MusicService - MusicService was written by another programmer and sometimes throws and error instead of returning a song.

        MusicService service = new MusicService();

        //Your job is to protect this loop so that, if an Exception is thrown, you can shut the program down gracefully by printint out that "Music Service it down for routine maintenance"

        for (int i = 0; i < 10; i++)
        {
            try
            {
                String nextSongName = service.getNextSong().getTitle();
                System.out.println(nextSongName);

            }
            catch (Exception e)
            {
                System.out.println("Sorry, Music Service is down for routine maintenance");
                break;
            }
        }
    }
}
