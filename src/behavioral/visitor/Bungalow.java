package behavioral.visitor;

import java.util.List;

public class Bungalow implements BuildingType {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getFloor() {
        return 1;
    }
}
