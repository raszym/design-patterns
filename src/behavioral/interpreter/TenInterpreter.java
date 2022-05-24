package behavioral.interpreter;

public class TenInterpreter extends Interpreter{
    @Override
    protected String one() {
        return "X";
    }

    @Override
    protected String four() {
        return "XL";
    }

    @Override
    protected String five() {
        return "L";
    }

    @Override
    protected String nine() {
        return "XC";
    }

    @Override
    protected int factor() {
        return 10;
    }
}
