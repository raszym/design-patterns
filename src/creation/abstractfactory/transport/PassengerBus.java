package creation.abstractfactory.transport;

public class PassengerBus implements Transport{
    @Override
    public void process() {
        System.out.println("Czas transportu 7 godzin");
    }
}
