package behavioral.command;

public class Window {
    String id;

    public Window(String id) {
        this.id = id;
    }

    public void open() {
        System.out.println("Okno " + id + " zostało otwarte");
    }

    public void close() {
        System.out.println("Okno " + id + " zostało zamknięte");
    }
}
