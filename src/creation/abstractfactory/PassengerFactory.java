package creation.abstractfactory;

import creation.abstractfactory.transport.*;

public class PassengerFactory extends AbstractFactory {

    @Override
    public Transport getTransport(TransportType transportType) {
        switch (transportType) {
            case PLANE:
                return new PassengerPlane();
            case SHIP:
                return new PassengerShip();
            case BUS_TRUCK:
                return new PassengerShip();
            default:
                throw new IllegalArgumentException("Cargo transport type: " + transportType + "not supported");
        }
    }
}
