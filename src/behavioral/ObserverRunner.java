package behavioral;

import behavioral.observer.Fanpage;
import behavioral.observer.Subscriber;
import behavioral.observer.TwitterAccount;
import behavioral.observer.YoutubeChannel;

public class ObserverRunner {

    public void run() {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        new Subscriber(youtubeChannel);
        new Fanpage(youtubeChannel);
        new TwitterAccount(youtubeChannel);

        youtubeChannel.setState("Kurs javy");
    }
}
