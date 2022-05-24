package behavioral.observer;

public class Subscriber extends Observer {

    public Subscriber(YoutubeChannel youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.addObserver(this);
    }


    @Override
    public void update() {
        System.out.println("Subscriber otrzymal wiadomosc o nowym filmie: "
                + youtubeChannel.getState());
    }
}
