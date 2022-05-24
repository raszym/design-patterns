package structural.bridge;

public class JsonFormat extends Format {

    public JsonFormat(String text, Api api) {
        this.text = "{\"message\": \"" + text + "\"}";
        this.api = api;
    }

    @Override
    public void sendMessage() {
        api.send(text);
    }
}
