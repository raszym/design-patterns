package behavioral;

import behavioral.visitor.Building;
import behavioral.visitor.FloorVisitor;

public class VisitorRunner {

    public void run() {
        Building building = new Building();
        building.accept(new FloorVisitor());
    }
}
