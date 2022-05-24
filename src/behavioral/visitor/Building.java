package behavioral.visitor;

import java.util.List;

public class Building implements BuildingType {

    private List<BuildingType> buildings;

    public Building() {
        buildings = List.of(new Bungalow(), new OfficeBuilding(), new SkyScraper());
    }

    @Override
    public void accept(Visitor visitor) {
        buildings.forEach(building -> building.accept(visitor));
        visitor.visit(this);
    }

    @Override
    public int getFloor() {
        return 50;
    }
}
