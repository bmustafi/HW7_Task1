package main;

public class CostCalculator implements CostVisitor {
    @Override
    public double visitGlass(Glass g) {
        if (g.getTickness() == 1) {
            return 2 * g.getLenght();
        } else if (g.getTickness() == 2) {
            return 1.2 * g.getLenght();
        } else if (g.getTickness() == 3) {
            return 0.7 * g.getLenght();
        } else {
            return 0;
        }
    }

    @Override
    public double visitFurniture(Furniture f) {
        return 0.25 * f.getWeight();
    }

    @Override
    public double visitElectronic(Electronic e) {
        if (e.getFragile() == true) {
            return 0.5 * e.getWeight();
        } else {
            return (5D/15) * e.getWeight();
        }
    }

    public double calculateCost(HouseholdItem h) {
        return h.accept(this);
    }
}
