
package model;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Jenni Burgmeier
 */
public class OrderService {
    @Inject
    private IOrderEAO eaoO;
    private IEntreeEAO eaoE;
    private ISideEAO eaoS;
    private IDrinkEAO eaoD;
    private Order order;
    private Entree entree;
    private Side side;
    private Drink drink;
    
    public OrderService() {
        initItemsDb();
        eaoO.create(new Order());
    }
    
    private void initItemsDb() {
        eaoO = new OrderEAO();
        eaoE = new EntreeEAO();
        eaoS = new SideEAO();
        eaoD = new DrinkEAO();
        
    }

    public List<Order> findOrders() {
        return eaoO.findOrders();
    }

    public IOrderEAO getEao() {
        return eaoO;
    }

    public void setEao(IOrderEAO eaoO) {
        this.eaoO = eaoO;
    }

    public IOrderEAO getEaoO() {
        return eaoO;
    }

    public void setEaoO(IOrderEAO eaoO) {
        this.eaoO = eaoO;
    }

    public IEntreeEAO getEaoE() {
        return eaoE;
    }

    public void setEaoE(IEntreeEAO eaoE) {
        this.eaoE = eaoE;
    }

    public ISideEAO getEaoS() {
        return eaoS;
    }

    public void setEaoS(ISideEAO eaoS) {
        this.eaoS = eaoS;
    }

    public IDrinkEAO getEaoD() {
        return eaoD;
    }

    public void setEaoD(IDrinkEAO eaoD) {
        this.eaoD = eaoD;
    }
    
    
}
