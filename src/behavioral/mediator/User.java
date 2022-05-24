package behavioral.mediator;

public class User {
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addUser(this);
    }

    public void recieve(String message) {
        System.out.println("Uzytkownik " + name + " otzymal wiadomosc: " + message);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
}
