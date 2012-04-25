
package pl.biniu.controller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.biniu.model.User;


@Stateless
public class UserFacade extends AbstractFacade<User> {
    @PersistenceContext(unitName = "KartaKontroliPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserFacade() {
        super(User.class);
    }
    
}
