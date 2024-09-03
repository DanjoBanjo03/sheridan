package yourturn0;

import java.util.Random;

public class MusicService {

    //Don't worry about this code.  We will learn about arrays soon!
    private Song[] songs = {
            new Song("Aiko Aiko", "Grateful Dead", 503),
            new Song("Dazed and Confused", "Zeppelin", 334),
            new Song("Roadhouse Blues", "The Doors", 234),
            new Song("Here comes the sun", "Beatles", 122),
            new Song("Baba Oriely", "The Who", 345),
    };

    public Song getNextSong()
    {
        return songs[new Random().nextInt(6)]; //If the random number is 0-4 inclusive, this method will return a Song.  However, if the random number is a 5, an ArrayIndexOutOfBounds exception will be thrown.
    }
}
