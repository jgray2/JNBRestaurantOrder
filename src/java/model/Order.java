package model;

/**
 *
 * @author Jenni Burgmeier
 */
public class Order {

    private String entree;
    private String side;
    private String drink;
    private double entreeCost;
    private double sideCost;
    private double drinkCost;
    private double totalOrder;
    private final double price1 = 19.95;
    private final double price2 = 12.95;
    private final double price3 = 24.95;
    private final double price4 = 18.95;
    private final double saladPrice = 4.95;
    private final double soupPrice = 3.95;
    private final double sodaPrice = 1.95;
    private final double beerPrice = 3.50;
    private final double waterPrice = 0;
    private double tax;
    private double taxPerc = 0.051;
    private double suggestedTip;
    private double tipPerc = 0.15;

    public Order() {
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public final double getEntreeCost() {
        if (entree.equals("Steak")) {
            entreeCost = price1;
        } else if (entree.equals("Chicken")) {
            entreeCost = price2;
        } else if (entree.equals("Lobster")) {
            entreeCost = price3;
        } else {
            entreeCost = price4;
        }
        return entreeCost;
    }

    public final double getSideCost() {
        if (side.equals("Salad")) {
            sideCost = saladPrice;
        } else {
            sideCost = soupPrice;
        }
        return sideCost;
    }

    public final double getDrinkCost() {
        if (drink.equals("Soda")){
            drinkCost = sodaPrice;
        } else if (drink.equals("Beer")) {
            drinkCost = beerPrice;
        } else {
            drinkCost = waterPrice;
        }
        return drinkCost;
    }
    
    public final void calculateOrder () {
        totalOrder = getEntreeCost() + getSideCost() + getDrinkCost();
        tax = totalOrder * taxPerc;
       
    }

    public final double getTotalOrder() {
        return totalOrder;
    }

    public final double getTax() {
        return tax;
    }

    public final double getSuggestedTip() {
        suggestedTip = totalOrder * tipPerc;
        return suggestedTip;
    }
    
    
}
