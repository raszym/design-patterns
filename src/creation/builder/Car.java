package creation.builder;

import java.util.List;
import java.util.stream.Collectors;

public class Car {
    private List<String> wheels;
    private String engine;
    private String gear;
    private List<String> chairs;
    private String color;

    public Car(List<String> wheels, String engine, String gear, List<String> chairs, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.gear = gear;
        this.chairs = chairs;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels.stream().collect(Collectors.joining(", ")) +
                ", engine='" + engine + '\'' +
                ", gear='" + gear + '\'' +
                ", chairs='" + chairs.stream().collect(Collectors.joining(", ")) + '\'' +
                ", color='" + color + '\'' +
                '}';
    }


}
