package behavioral.momento;

public class Notepad {

    private TextWindow textWindow;

    private Momento momento;

    public Notepad(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void writeText(String text) {
        textWindow.addText(text);
    }

    public void save() {
        momento = textWindow.save();
    }

    public void undo() {
        textWindow.rollback(momento);
    }

    public void displayText() {
        System.out.println(textWindow.getText());
    }
}
