package structural;

import structural.facade.OrderFacade;
import structural.flyweight.SpaceShip;
import structural.flyweight.SpaceShipFactory;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class FlyweightRunner {

    public void run() {
        SpaceShipFactory spaceShipFactory = new SpaceShipFactory();
        IntStream.range(0, 10).forEach(i -> {
            SpaceShip spaceShip = spaceShipFactory.getSpaceShip("Cruiser");
            spaceShip.setPositionX(i);
            spaceShip.setPositionY(i);
            spaceShip.display();
        });

        IntStream.range(0, 10).forEach(i -> {
            SpaceShip spaceShip = spaceShipFactory.getSpaceShip("Fighter");
            spaceShip.setPositionX(ThreadLocalRandom.current().nextInt(i, 50));
            spaceShip.setPositionY(ThreadLocalRandom.current().nextInt(i, 50));
            spaceShip.display();
        });
        System.out.println("Zostalo stworzonych " + spaceShipFactory.getCacheSize() + " statkow kosminczych");
    }
}
