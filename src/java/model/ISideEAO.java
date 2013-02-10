
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface ISideEAO {
    void create (Side side);
    
    public void deleteSide(Side side);
    
    public void addSide (Side side);
    
    List<Order> findSides();
    
    public void saveSide (Side side);
}
