
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
public class EntreeEAO implements IEntreeEAO {
@PersistenceContext(unitName = "JPA-WebBasicsPU")
    private EntityManager em;

    @Override
    public void create(Entree entree) {
        em.persist(entree);
    }

    @Override
    public void deleteEntree(Entree entree) {
        em.remove(em.merge(entree));
    }

    @Override
    public List<Entree> findEntrees() {
         return findEntrees(true, -1, -1);
    }
    
     private List<Entree> findEntrees(boolean all, int maxResults, int firstResult) {
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Entree.class));
        Query q = em.createQuery(cq);
        if (!all) {
            q.setMaxResults(maxResults);
            q.setFirstResult(firstResult);
        }
        return q.getResultList();
    }
}
