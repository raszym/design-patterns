package structural.bridge;

public class RpcApi implements Api {
    @Override
    public void send(String message) {
        System.out.println(message + " zostala przeslana za pomoca RPC API");
    }
}
