
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
public class SideEAO implements ISideEAO {

    @PersistenceContext(unitName = "JPA-WebBasicsPU")
    private EntityManager em;
    
    @Override
    public void create(Side side) {
        em.persist(side);
    }

    @Override
    public void deleteSide(Side side) {
        em.remove(em.merge(side));
    }

    @Override
    public List<Side> findSides() {
         return findSides(true, -1, -1);
    }
    
     private List<Side> findSides(boolean all, int maxResults, int firstResult) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Side.class));
        Query q = em.createQuery(cq);
        if (!all) {
            q.setMaxResults(maxResults);
            q.setFirstResult(firstResult);
        }
        return q.getResultList();
    }
}
