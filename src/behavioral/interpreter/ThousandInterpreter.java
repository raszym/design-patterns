package behavioral.interpreter;

public class ThousandInterpreter extends Interpreter{
    @Override
    protected String one() {
        return "M";
    }

    @Override
    protected String four() {
        return " ";
    }

    @Override
    protected String five() {
        return " ";
    }

    @Override
    protected String nine() {
        return " ";
    }

    @Override
    protected int factor() {
        return 1000;
    }
}
