package behavioral;

import behavioral.interpreter.*;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class InterpreterRunner {

    public void run() {
        String roman = "MMXX";

        Context context = new Context(roman);

        List<Interpreter> interpreterList = new ArrayList<>();

        interpreterList.add(new ThousandInterpreter());
        interpreterList.add(new HundredInterpreter());
        interpreterList.add(new TenInterpreter());
        interpreterList.add(new OneInterpreter());

        interpreterList.forEach(interpreter -> interpreter.calculate(context));

        System.out.println("Liczba rzymska " + roman + " to " + context.getArabicNumber());
    }
}
