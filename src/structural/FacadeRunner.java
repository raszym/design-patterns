package structural;

import structural.facade.OrderFacade;

public class FacadeRunner {

    public void run() {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.buy();
    }
}
