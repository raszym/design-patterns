package behavioral.visitor;

public class FloorVisitor implements Visitor {
    @Override
    public void visit(Building building) {
        System.out.println("Liczba pieter w budynku " + building.getFloor());
    }

    @Override
    public void visit(Bungalow bungalow) {
        System.out.println("Liczba pieter w bungalow " + bungalow.getFloor());
    }

    @Override
    public void visit(OfficeBuilding officeBuilding) {
        System.out.println("Liczba pieter w biurze" + officeBuilding.getFloor());
    }

    @Override
    public void visit(SkyScraper skyScraper) {
        System.out.println("Liczba pieter w drapaczu chmur " + skyScraper.getFloor());
    }
}
