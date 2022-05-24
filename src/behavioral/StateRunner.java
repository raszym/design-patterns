package behavioral;

import behavioral.state.Context;
import behavioral.state.LoudMode;
import behavioral.state.SilentMode;

public class StateRunner {

    public void run() {
        Context context = new Context();

        SilentMode silentMode = new SilentMode();
        silentMode.notificationMode(context);
        context.notifyUser();

        LoudMode loudMode = new LoudMode();
        loudMode.notificationMode(context);

        context.notifyUser();
    }
}
