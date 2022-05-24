package behavioral.state;

public class VibrationMode implements PhoneModeState {
    @Override
    public void notificationMode(Context context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Wibracje";
    }
}
