package creation.abstractfactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryMode factoryMode) {
        switch (factoryMode) {
            case CARGO:
                return new CargoFactory();
            case PASSENGER:
                return new PassengerFactory();
            default:
                throw new IllegalArgumentException("Blad");
        }

    }
}
