package behavioral.command;

public class OpenWindow implements Activity {

    private Window window;

    public OpenWindow(Window window) {
        this.window = window;
    }

    @Override
    public void execute() {
        window.open();
    }
}
