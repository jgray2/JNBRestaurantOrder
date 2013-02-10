
package model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jenni Burgmeier
 */
public class OrderEAO implements IOrderEAO {
    
    @PersistenceContext(unitName = "JPA-WebBasicsPU")
    private EntityManager em;

    @Override
    public void create(Order order) {
        em.persist(order);
    }

    @Override
    public void deleteOrder(Order order) {
        em.remove(em.merge(order));
    }

    @Override
    public void addItems(Order order) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Order> findOrders() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
