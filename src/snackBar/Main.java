package snackBar;
import java.io.*;
import java.text.DecimalFormat;

public class Main {
    private static void workingWithData(){
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine vmFood = new VendingMachine("food");
        VendingMachine vmDrink = new VendingMachine("drink");
        VendingMachine vmOffice = new VendingMachine("office");

        Snack chips = new Snack("Chips", 36, 1.75, vmFood.getId(), vmFood.getName());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, vmFood.getId(), vmFood.getName());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, vmFood.getId(), vmFood.getName());
        Snack soda = new Snack("Soda", 24, 2.50, vmDrink.getId(), vmDrink.getName());
        Snack water = new Snack("Water", 20, 2.75, vmDrink.getId(), vmDrink.getName());

        double formattedCash = c1.getCashOnHand();
        String pattern = "$###,###.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        c1.newTotalSnacks(soda.totalCost(3));
        soda.buySnacks(3);
        // double c2COH = c2.getCashOnHand();
        System.out.println(decimalFormat.format(c1.getCashOnHand()));
        System.out.println(soda.getQuantity());

        c1.newTotalSnacks(pretzel.totalCost(1));
        pretzel.buySnacks(1);

        System.out.println(decimalFormat.format(c1.getCashOnHand()));
        System.out.println(pretzel.getQuantity());

        c2.newTotalSnacks(soda.totalCost(2));
        soda.buySnacks(2);

        System.out.println(decimalFormat.format(c2.getCashOnHand()));
        System.out.println(soda.getQuantity());

        c1.addCashOnHand(10.00);
        System.out.println(decimalFormat.format(c1.getCashOnHand()));

        c1.newTotalSnacks(chocolateBar.totalCost(1));
        chocolateBar.buySnacks(1);
        System.out.println(decimalFormat.format(c1.getCashOnHand()));
        System.out.println(chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());

        c2.newTotalSnacks(pretzel.totalCost(3));
        pretzel.buySnacks(3);
        System.out.println(decimalFormat.format(c2.getCashOnHand()));
        System.out.println(pretzel.getQuantity());

        System.out.println(water);

        System.out.println(decimalFormat.format(formattedCash));
    }
    public static void main(String[] args){
        workingWithData();
    }
}
