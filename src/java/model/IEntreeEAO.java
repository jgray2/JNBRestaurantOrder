
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface IEntreeEAO {
    void create (Entree entree);
    
    public void deleteEntree(Entree entree);
    
    public void addEntree (Entree entree);
    
    List<Order> findEntrees();
    
    public void saveEntree (Entree entree);
}
