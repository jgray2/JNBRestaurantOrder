
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface IDrinkEAO {
    
    void create (Drink drink);
    
    public void deleteDrink(Drink drink);
    
    List<Drink> findDrinks();
    
}
