package behavioral.state;

public class Context {

    private PhoneModeState phoneModeState;

    public void setState(PhoneModeState phoneModeState) {
        this.phoneModeState = phoneModeState;
    }

    public void notifyUser() {
        System.out.println(phoneModeState.toString());
    }
}
