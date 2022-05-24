package behavioral.strategy;

public class PbConverter implements StrategyConverter {
    @Override
    public String convert(String file) {
        return file.split("\\.")[0] + ".pb";
    }
}
