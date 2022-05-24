package behavioral.strategy;

public class CsvConverter implements StrategyConverter {
    @Override
    public String convert(String file) {
        return file.split("\\.")[0] + ".csv";
    }
}
