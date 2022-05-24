package behavioral.strategy;

public class PdfConverter implements StrategyConverter {
    @Override
    public String convert(String file) {
        return file.split("\\.")[0] + ".pdf";
    }
}
