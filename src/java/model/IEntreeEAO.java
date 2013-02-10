
package model;

import java.util.List;

/**
 *
 * @author Jenni Burgmeier
 */
public interface IEntreeEAO {
    void create (Entree entree);
    
    public void deleteEntree(Entree entree);
    
    List<Entree> findEntrees();
   
}
