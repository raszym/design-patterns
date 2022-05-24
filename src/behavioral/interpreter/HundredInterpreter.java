package behavioral.interpreter;

public class HundredInterpreter extends Interpreter{
    @Override
    protected String one() {
        return "C";
    }

    @Override
    protected String four() {
        return "CD";
    }

    @Override
    protected String five() {
        return "D";
    }

    @Override
    protected String nine() {
        return "CM";
    }

    @Override
    protected int factor() {
        return 100;
    }
}
