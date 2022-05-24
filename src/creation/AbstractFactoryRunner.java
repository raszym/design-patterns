package creation;

import creation.abstractfactory.*;
import creation.abstractfactory.transport.*;

public class AbstractFactoryRunner {

    public void run() {
        AbstractFactory cargoFactory = FactoryProvider.getFactory(FactoryMode.CARGO);
        Transport shipTransport = cargoFactory.getTransport(TransportType.SHIP);
        shipTransport.process();
    }
}
