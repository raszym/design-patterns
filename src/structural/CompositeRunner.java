package structural;

import structural.bridge.Api;
import structural.bridge.Format;
import structural.bridge.JsonFormat;
import structural.bridge.RestApi;
import structural.composite.Person;

import java.util.stream.Collectors;

public class CompositeRunner {

    public void run() {
        Person father = new Person("Taderio", 55);
        Person child1 = new Person("Maria", 22);
        Person child2 = new Person("Roman", 33);

        father.add(child1);
        father.add(child2);

        System.out.println("Ojciec ma na imie " + father.getName()
                + " a jego dzieci " + father
                .getChildren()
                .stream()
                .map(child -> child.getName())
                .collect(Collectors.joining(", ")));
    }
}
