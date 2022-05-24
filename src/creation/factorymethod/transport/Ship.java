package creation.factorymethod.transport;

public class Ship implements CargoTransport {
    @Override
    public void process() {
        System.out.println("Czas dostawy 1 tydzien");
    }
}
