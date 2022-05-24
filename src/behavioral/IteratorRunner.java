package behavioral;

import behavioral.iterator.MusicPlayer;
import behavioral.iterator.Player;

import java.util.Iterator;

public class IteratorRunner {

    public void run() {
        Player musicPlayer = new MusicPlayer();
        for(Iterator iterator = musicPlayer.getIterator(); iterator.hasNext();) {
            String sample = (String) iterator.next();
            System.out.println(sample);
        }
    }
}
