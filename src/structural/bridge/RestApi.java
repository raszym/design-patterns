package structural.bridge;

public class RestApi implements Api {
    @Override
    public void send(String message) {
        System.out.println(message + " zostala przeslana za pomoca REST API");
    }
}
