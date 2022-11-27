package main;

public class PackingInstructor implements PackingVisitor {
    public String visitGlass(Glass g) {
        return ">should be wrapped with Bubble wraps and packed in a box with dimension: " + (g.getHeight()+1) + "x" + (g.getLenght()+1) + "x" + (g.getWidth()+1);
    }
    public String visitFurniture(Furniture f) {
        return ">should be covered with waterproof covers with area of: " + f.getLenght() + "x" + f.getWidth();
    }
    public String visitElectronic(Electronic e) {
        return ">should be covered with Polyethylene foam film and packed in a box with dimension: " + (e.getHeight()+1) + "x" + (e.getLenght()+1) + "x" + (e.getWidth()+1);
    }

    public String calcPackingInstructions(HouseholdItem h) {
        return h.accept(this);
    }
}
