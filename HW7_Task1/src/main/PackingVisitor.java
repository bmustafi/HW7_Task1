package main;

public interface PackingVisitor {
    String visitGlass(Glass g);
    String visitFurniture(Furniture f);
    String visitElectronic(Electronic e);
}
