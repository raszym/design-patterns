package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {

    List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void send(String message, User sender) {
        users.forEach(user -> {
            if(user != sender) {
                user.recieve(message);
            }
        });
    }
}
