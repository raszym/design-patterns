package behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

public class ProgrammerHelper extends Helper {

    private final List<String> errors = List.of(
            "Exception", "Error", "OutOFMemory");

    @Override
    public void handle(String request) {
        if(Arrays.stream(request.split(" ")).anyMatch(errors::contains)) {
            System.out.println("Odsyłam zapytanie do pragramisty");
        } else {
            System.out.println("Żądanie nie może być obsłużone. Prosimy o kontakt z infolinią");
        }
    }
}
