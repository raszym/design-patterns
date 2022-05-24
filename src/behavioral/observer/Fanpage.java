package behavioral.observer;

public class Fanpage extends Observer {

    public Fanpage(YoutubeChannel youtubeChannel) {
        this.youtubeChannel = youtubeChannel;
        youtubeChannel.addObserver(this);
    }


    @Override
    public void update() {
        System.out.println("Fanpage otrzymal wiadomosc o nowym filmie: " + youtubeChannel.getState());
    }
}
