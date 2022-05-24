package creation.abstractfactory.transport;

public class CargoPlane implements Transport{
    @Override
    public void process() {
        System.out.println("Czas transportu 2 godziny");
    }
}
