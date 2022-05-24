package behavioral.observer;

public class TwitterAccount extends Observer {

    public TwitterAccount(YoutubeChannel youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.addObserver(this);
    }


    @Override
    public void update() {
        System.out.println("TwitterAccount otrzymal wiadomosc o nowym filmie: "
                + youtubeChannel.getState());
    }
}
