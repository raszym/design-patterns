package behavioral.command;

public class CloseWindow implements Activity {

    private Window window;

    public CloseWindow(Window window) {
        this.window = window;
    }

    @Override
    public void execute() {
        window.close();
    }
}
