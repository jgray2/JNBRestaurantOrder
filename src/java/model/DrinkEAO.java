
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author Jenni Burgmeier
 */
public class DrinkEAO implements IDrinkEAO {
    
    @PersistenceContext(unitName = "JPA-WebBasicsPU")
    private EntityManager em;

    @Override
    public void create(Drink drink) {
        em.persist(drink);
    }

    @Override
    public void deleteDrink(Drink drink) {
        em.remove(em.merge(drink));
    }

    @Override
    public List<Drink> findDrinks() {
        return findDrinks(true, -1, -1);
    }
    
     private List<Drink> findDrinks(boolean all, int maxResults, int firstResult) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Drink.class));
        Query q = em.createQuery(cq);
        if (!all) {
            q.setMaxResults(maxResults);
            q.setFirstResult(firstResult);
        }
        return q.getResultList();
    }
    
}
