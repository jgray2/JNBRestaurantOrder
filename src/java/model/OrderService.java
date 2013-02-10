
package model;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Jenni Burgmeier
 */
public class OrderService {
    @Inject
    private IOrderEAO eao;

    public List<Order> findOrders() {
        return eao.findOrders();
    }

    public IOrderEAO getEao() {
        return eao;
    }

    public void setEao(IOrderEAO eao) {
        this.eao = eao;
    }
}
