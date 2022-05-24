package creation;

import creation.factorymethod.transport.CargoTransport;
import creation.factorymethod.transport.CargoTransportFactory;

public class FactoryMethodRunner {
    public void run() {
        CargoTransport cargoTransport = CargoTransportFactory.getCargoTransport(CargoTransportFactory.CargoTransportType.PLANE);
        cargoTransport.process();
    }
}
