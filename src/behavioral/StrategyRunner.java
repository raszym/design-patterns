package behavioral;

import behavioral.strategy.Context;
import behavioral.strategy.PdfConverter;
import behavioral.strategy.StrategyConverter;

public class StrategyRunner {

    public void run() {
        Context context = new Context(new PdfConverter());
        String newFile = context.convert("example.txt");

        System.out.println("Plik po konwersji " + newFile);
    }
}
