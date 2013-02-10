
package model;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Jenni Burgmeier
 */
public class DrinkService {
     @Inject
    private IDrinkEAO eao;

    public List<Drink> findAllDrinks() {
        return eao.findDrinks();
    }

    public IDrinkEAO getEao() {
        return eao;
    }

    public void setEao(IDrinkEAO eao) {
        this.eao = eao;
    }
}
