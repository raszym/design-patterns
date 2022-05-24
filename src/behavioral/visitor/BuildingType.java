package behavioral.visitor;

public interface BuildingType {

    void accept(Visitor visitor);

    int getFloor();
}
