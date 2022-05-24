package creation.abstractfactory.transport;

public class CargoShip implements Transport{
    @Override
    public void process() {
        System.out.println("Czas transportu 5 godzin");
    }
}
