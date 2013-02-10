
package model;

import javax.persistence.Persistence;

/**
 *
 * @author Jenni Burgmeier
 */
public class Main {
    public static void main(String[] args) {
        Entree entree = new Entree();
        entree.setEntreeName("Steak");
        entree.setPrice(19.95);
        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JNBRestaurantOrderPU");
        
        
    }
}
