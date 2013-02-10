
package model;

import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author Jenni Burgmeier
 */
public class EntreeService {
     @Inject
    private IEntreeEAO eao;

    public List<Entree> findAllEntrees() {
        return eao.findEntrees();
    }

    public IEntreeEAO getEao() {
        return eao;
    }

    public void setEao(IEntreeEAO eao) {
        this.eao = eao;
    }
}
