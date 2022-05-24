package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Agent {

    private List<Activity> activities = new ArrayList<>();

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public void startActivities() {
        activities.forEach(activity -> activity.execute());
        activities.clear();
    }
}
