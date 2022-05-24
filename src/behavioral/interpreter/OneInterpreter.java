package behavioral.interpreter;

public class OneInterpreter extends Interpreter{
    @Override
    protected String one() {
        return "I";
    }

    @Override
    protected String four() {
        return "IV";
    }

    @Override
    protected String five() {
        return "V";
    }

    @Override
    protected String nine() {
        return "IX";
    }

    @Override
    protected int factor() {
        return 1;
    }
}
