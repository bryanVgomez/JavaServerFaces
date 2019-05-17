/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityTodo;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Connectis
 */
@Stateless
public class BebestiblesFacade extends AbstractFacade<Bebestibles> {

    @PersistenceContext(unitName = "FINALAHORASIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BebestiblesFacade() {
        super(Bebestibles.class);
    }
    
}
