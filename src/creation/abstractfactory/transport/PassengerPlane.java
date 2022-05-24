package creation.abstractfactory.transport;

public class PassengerPlane implements Transport{
    @Override
    public void process() {
        System.out.println("Czas transportu 1 godzina");
    }
}
