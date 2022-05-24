package behavioral.strategy;

public class Context {

    private final StrategyConverter strategyConverter;

    public Context(StrategyConverter strategyConverter) {
        this.strategyConverter = strategyConverter;
    }

    public String convert(String file) {
        return strategyConverter.convert(file);
    }
}
