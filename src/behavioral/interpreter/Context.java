package behavioral.interpreter;

public class Context {
    private String romanNumber;
    private int arabicNumber;

    public Context(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public String getRomanNumber() {
        return romanNumber;
    }

    public void setRomanNumber(String romanNumber) {
        this.romanNumber = romanNumber;
    }

    public int getArabicNumber() {
        return arabicNumber;
    }

    public void setArabicNumber(int arabicNumber) {
        this.arabicNumber = arabicNumber;
    }
}
