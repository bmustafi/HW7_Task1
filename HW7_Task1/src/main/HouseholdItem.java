package main;

public interface HouseholdItem {
    double accept(CostVisitor v);
    String accept(PackingVisitor v);
}
