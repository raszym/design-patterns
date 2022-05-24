package creation.factorymethod.transport;

public class Plane implements CargoTransport {
    @Override
    public void process() {
        System.out.println("Czas dostawy 1 dzien");
    }
}
