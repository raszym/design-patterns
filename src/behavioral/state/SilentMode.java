package behavioral.state;

public class SilentMode implements PhoneModeState {
    @Override
    public void notificationMode(Context context) {
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Brak reakcji";
    }
}
