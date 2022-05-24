package creation;

import creation.builder.*;

public class BuilderRunner {

    public void run() {
        Car car = new CarBuilder()
                .withWheel("Lewe tyl")
                .withWheel("Lewe przod")
                .withWheel("Prawe tyl")
                .withWheel("Prawe przod")
                .withGear("automatyczna")
                .build();
        System.out.println(car.toString());
    }
}
