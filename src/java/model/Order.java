package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author Jenni Burgmeier
 */
@Entity
@NamedQuery(name = "findOrders", query = "SELECT o FROM Order o ORDER BY o.id DESC")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Drink drink;
    private Entree entree;
    private Side side;
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

    public Order(Entree entree, Drink drink, Side side) {
        this.entree = entree;
        this.side = side;
        this.drink = drink;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public Entree getEntree() {
        return entree;
    }

    public void setEntree(Entree entree) {
        this.entree = entree;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public final void calculateOrder() {
        totalOrder = entree.getPrice() + side.getPrice() + drink.getPrice();
        tax = totalOrder * taxPerc;
    }

    public double getTotalOrder() {
        return totalOrder;
    }

    public double getTax() {
        return tax;
    }

    public double getSuggestedTip() {
        suggestedTip = totalOrder * tipPerc;
        return suggestedTip;
    }
}
