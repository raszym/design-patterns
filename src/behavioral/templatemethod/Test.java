package behavioral.templatemethod;

public abstract class Test {

    public abstract void initializeData();

    public abstract void checkTest();

    public abstract void cleanData();

    public final void run() {
        initializeData();
        checkTest();
        cleanData();
    }
}
