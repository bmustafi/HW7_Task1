package main;

public interface CostVisitor {
    double visitGlass(Glass g);
    double visitFurniture(Furniture f);
    double visitElectronic(Electronic e);
}
