package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    List<Observer> observers = new ArrayList<>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }
}
