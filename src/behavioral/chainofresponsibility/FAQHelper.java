package behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

public class FAQHelper extends Helper {

    private final List<String> errors = List.of(
            "przeglądarka", "Internet", "hasło", "login", "połączenie");

    @Override
    public void handle(String request) {
        if(Arrays.stream(request.split(" ")).anyMatch(errors::contains)) {
            System.out.println("Odsyłam do FAQ");
        } else {
            nextHelper.handle(request);
        }
    }
}
