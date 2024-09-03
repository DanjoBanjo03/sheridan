package yourturn0complete;

import java.util.Random;

public class MusicService {

    private Song[] songs = {
            new Song("Aiko Aiko", "Grateful Dead", 503),
            new Song("Dazed and Confused", "Zeppelin", 334),
            new Song("Roadhouse Blues", "The Doors", 234),
            new Song("Here comes the sun", "Beatles", 122),
            new Song("Baba Oriely", "The Who", 345),
    };

    public Song getNextSong()
    {
        return songs[new Random().nextInt(6)]; //Notice that this could give us an array out of bounds exception
    }
}
