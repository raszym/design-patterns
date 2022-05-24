package behavioral.momento;

public class TextWindow {

    private StringBuilder text;

    public TextWindow() {
        this.text = new StringBuilder();
    }

    public StringBuilder getText() {
        return text;
    }

    public void addText(String text) {
        this.text.append(text);
    }

    public Momento save() {
        return new Momento(text.toString());
    }

    public void rollback(Momento momento) {
        text = new StringBuilder(momento.getText());
    }
}
