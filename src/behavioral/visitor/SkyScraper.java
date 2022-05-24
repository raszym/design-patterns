package behavioral.visitor;

public class SkyScraper implements BuildingType {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int getFloor() {
        return 37;
    }
}
