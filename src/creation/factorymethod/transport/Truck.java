package creation.factorymethod.transport;

public class Truck implements CargoTransport {
    @Override
    public void process() {
        System.out.println("Czas dostawy 3 dni");
    }
}
