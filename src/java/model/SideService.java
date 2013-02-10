package model;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Jenni Burgmeier
 */
public class SideService {

    @Inject
    private ISideEAO eao;

    public List<Side> findAllSides() {
        return eao.findSides();
    }

    public ISideEAO getEao() {
        return eao;
    }

    public void setEao(ISideEAO eao) {
        this.eao = eao;
    }
}
