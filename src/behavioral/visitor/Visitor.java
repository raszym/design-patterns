package behavioral.visitor;

public interface Visitor {

    void visit(Building building);
    void visit(Bungalow bungalow);

    void visit(OfficeBuilding officeBuilding);

    void visit(SkyScraper skyScraper);
}
