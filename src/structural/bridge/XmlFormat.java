package structural.bridge;

public class XmlFormat extends Format {

    public XmlFormat(String text, Api api) {
        this.text = "<message>" + text + "</message>";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        api.send(text);
    }
}
