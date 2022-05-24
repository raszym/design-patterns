package behavioral;

import behavioral.mediator.Mediator;
import behavioral.mediator.User;

public class MediatorRunner {

    public void run() {
        Mediator mediator = new Mediator();

        User user1 = new User("John", mediator);
        User user2 = new User("Mark", mediator);
        User user3 = new User("Bob", mediator);

        user1.send("Hello everyone");

    }
}
