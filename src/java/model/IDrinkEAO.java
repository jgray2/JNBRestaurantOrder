
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface IDrinkEAO {
    
    void create (Drink drink);
    
    public void deleteDrink(Drink drink);
    
    public void addDrink (Drink drink);
    
    List<Order> findDrinks();
    
    public void saveDrink (Drink drink);
    
}
