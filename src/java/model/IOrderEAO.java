
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface IOrderEAO {
    
    void create (Order order);
    
    public void deleteOrder(Order order);
    
    public void addItems (Order order);
    
    List<Order> findItemsForOrder();
    
    public void saveOrder(Order order);
    
}
