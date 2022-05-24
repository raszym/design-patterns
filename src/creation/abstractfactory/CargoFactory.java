package creation.abstractfactory;

import creation.abstractfactory.transport.CargoPlane;
import creation.abstractfactory.transport.CargoShip;
import creation.abstractfactory.transport.Transport;
import creation.abstractfactory.transport.TransportType;

public class CargoFactory extends AbstractFactory {

    @Override
    public Transport getTransport(TransportType transportType) {
        switch (transportType) {
            case PLANE:
                return new CargoPlane();
            case SHIP:
                return new CargoShip();
            case BUS_TRUCK:
                return new CargoShip();
            default:
                throw new IllegalArgumentException("Cargo transport type: " + transportType + "not supported");
        }
    }
}
