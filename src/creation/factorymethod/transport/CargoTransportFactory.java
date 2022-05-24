package creation.factorymethod.transport;

public class CargoTransportFactory {
    public enum CargoTransportType {
        PLANE,
        SHIP,
        TRUCK
    }

    public static CargoTransport getCargoTransport(CargoTransportType cargoTransportType) {
        switch (cargoTransportType) {
            case PLANE:
                return new Plane();
            case SHIP:
                return new Ship();
            case TRUCK:
                return new Truck();
            default:
                throw new IllegalArgumentException("Cargo transport type: " + cargoTransportType + "not supported");
        }
    }
}
