package behavioral;

import behavioral.templatemethod.Test;
import behavioral.templatemethod.UserTest;

public class TemplateMethodRunner {

    public void run() {
        Test test = new UserTest();
        test.run();
    }
}
