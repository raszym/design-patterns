package creation.builder;

import java.util.ArrayList;
import java.util.List;

public final class CarBuilder {
    private List<String> wheels = new ArrayList<>();
    private String engine;
    private String gear;
    private List<String> chairs = new ArrayList<>();
    private String color;

    public static CarBuilder aCar() {
        return new CarBuilder();
    }

    public CarBuilder withWheel(String wheel) {
        this.wheels.add(wheel);
        return this;
    }

    public CarBuilder withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder withGear(String gear) {
        this.gear = gear;
        return this;
    }

    public CarBuilder withChair(String chair) {
        this.chairs.add(chair);
        return this;
    }

    public CarBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(wheels, engine, gear, chairs, color);
    }
}
