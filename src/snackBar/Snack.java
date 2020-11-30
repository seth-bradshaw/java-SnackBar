package snackBar;

public class Snack {
    //variables
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    //constructor
    public Snack(String name, int quantity, double cost, int vendingMachineId){
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    //getters and setters
    public int getInt(){
        return id;
    }

    public int getVendingId(){
        return vendingMachineId;
    }

    public void setVendingId(int vendingId){
        this.vendingMachineId = vendingId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public double getCost(){
        return cost;
    }

    public void setCost(double cost){
        this.cost = cost;
    }

    public void addQuantity(int newItems){
        this.quantity += newItems;
    }

    public void buySnacks(int purchasedItems){
        this.quantity -= purchasedItems;
    }

    public double totalCost(int quantity){
        return cost * quantity;
    }
}
