package behavioral;

import behavioral.command.Agent;
import behavioral.command.CloseWindow;
import behavioral.command.OpenWindow;
import behavioral.command.Window;

public class CommandRunner {

    public void run() {
        Agent agent = new Agent();

        Window window1 = new Window("1");
        Window window2 = new Window("2");

        agent.addActivity(new OpenWindow(window1));
        agent.addActivity(new OpenWindow(window2));

        agent.startActivities();

        agent.addActivity(new CloseWindow(window1));
        agent.addActivity(new CloseWindow(window2));

        agent.startActivities();
    }
}
