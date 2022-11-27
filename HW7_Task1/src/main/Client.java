package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client{

    public static void main(String[] args) {

        //Initialise some household
        List<HouseholdItem> householdItems = new ArrayList<>();


        Electronic microwaveOven= new Electronic("Microwave Oven",37, 48, 27, 13, false);
        Electronic tv= new Electronic("TV",122, 73, 15, 18, true);

        Glass wineGlass= new Glass("Wine glasses",33,28,23,1);
        Glass coffeeTable= new Glass("Glass Coffee Table ",80,80,45,3);


        Furniture bed= new Furniture("Bed", "Metal", 205, 91, 94, 26);
        Furniture cupboard= new Furniture("Bookshelf", "Wood", 60, 31, 190, 25);


        List<HouseholdItem> namesList = Arrays.asList(microwaveOven,tv,wineGlass,coffeeTable,bed,cupboard );
        householdItems.addAll(namesList);

        // calculate costs of householdItems
        CostCalculator cc = new CostCalculator();
        System.out.println("Total Cost for " + tv.getName() + " is: " + cc.calculateCost(tv) + " Euros");
        System.out.println("Total Cost for " + microwaveOven.getName() + " is: " + cc.calculateCost(microwaveOven) + " Euros");
        System.out.println("Total Cost for " + wineGlass.getName() + " is: " + cc.calculateCost(wineGlass) * 0.01 + " Euros"); // cost is multiplied by 0.01, because length is given in centimeters (not meters)
        System.out.println("Total Cost for " + coffeeTable.getName() + " is: " + cc.calculateCost(coffeeTable) * 0.01 + " Euros"); // cost is multiplied by 0.01, because length is given in centimeters (not meters)
        System.out.println("Total Cost for " + bed.getName() + " is: " + cc.calculateCost(bed) + " Euros");
        System.out.println("Total Cost for " + cupboard.getName() + " is: " + cc.calculateCost(cupboard) + " Euros");

        System.out.println("-------------------------------------------");
        
        // calculate packing instructions of householdItems
        PackingInstructor pi = new PackingInstructor();
        System.out.println(microwaveOven.getName() + ":" + '\n' + pi.calcPackingInstructions(microwaveOven));
        System.out.println(tv.getName() + ":" + '\n' + pi.calcPackingInstructions(tv));
        System.out.println(wineGlass.getName() + ":" + '\n' + pi.calcPackingInstructions(wineGlass));
        System.out.println(coffeeTable.getName() + ":" + '\n' + pi.calcPackingInstructions(coffeeTable));
        System.out.println(bed.getName() + ":" + '\n' + pi.calcPackingInstructions(bed));
        System.out.println(cupboard.getName() + ":" + '\n' + pi.calcPackingInstructions(cupboard));
    }
}