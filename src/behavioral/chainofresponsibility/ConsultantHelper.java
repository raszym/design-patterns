package behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

public class ConsultantHelper extends Helper {

    private final List<String> errors = List.of(
            "BusinessException", "uprawnień", "wygasło", "oprogramowanie");

    @Override
    public void handle(String request) {
        if(Arrays.stream(request.split(" ")).anyMatch(errors::contains)) {
            System.out.println("Odsyłam zapytanie do konsultanta");
        } else {
            nextHelper.handle(request);
        }
    }
}
