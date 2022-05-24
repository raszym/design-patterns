package creation.abstractfactory;

import creation.abstractfactory.transport.Transport;
import creation.abstractfactory.transport.TransportType;

public abstract class AbstractFactory {

    public abstract Transport getTransport(TransportType transportType);
}
