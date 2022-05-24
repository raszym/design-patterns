package behavioral.interpreter;

public abstract class Interpreter {

    public void calculate(Context context) {
        if (context.getRomanNumber().length() == 0) {
            return;
        }

        if (context.getRomanNumber().startsWith(nine())) {
            context.setArabicNumber(context.getArabicNumber() + (9 * factor()));
            context.setRomanNumber(context.getRomanNumber().substring(2));
        } else if (context.getRomanNumber().startsWith(four())) {
            context.setArabicNumber(context.getArabicNumber() + (4 * factor()));
            context.setRomanNumber(context.getRomanNumber().substring(2));
        } else if (context.getRomanNumber().startsWith(five())) {
            context.setArabicNumber(context.getArabicNumber() + (5 * factor()));
            context.setRomanNumber(context.getRomanNumber().substring(1));
        }

        while (context.getRomanNumber().startsWith(one())) {
            context.setArabicNumber(context.getArabicNumber() + (1 * factor()));
            context.setRomanNumber(context.getRomanNumber().substring(1));
        }
    }

    protected abstract String one();

    protected abstract String four();

    protected abstract String five();

    protected abstract String nine();

    protected abstract int factor();
}
