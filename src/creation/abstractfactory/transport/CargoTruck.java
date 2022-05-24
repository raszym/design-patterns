package creation.abstractfactory.transport;

public class CargoTruck implements Transport{
    @Override
    public void process() {
        System.out.println("Czas transportu 8 godzin");
    }
}
