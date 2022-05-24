package creation.abstractfactory.transport;

public class PassengerShip implements Transport{
    @Override
    public void process() {
        System.out.println("Czas transportu 5 godzin");
    }
}
