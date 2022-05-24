package behavioral.state;

public class LoudMode implements PhoneModeState {
    @Override
    public void notificationMode(Context context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Dzwonek";
    }
}
