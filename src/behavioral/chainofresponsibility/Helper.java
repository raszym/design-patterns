package behavioral.chainofresponsibility;

public abstract class Helper {

    protected Helper nextHelper;

    public void setNextHelper(Helper nextHelper) {
        this.nextHelper = nextHelper;
    }

    public abstract void handle(String request);
}
