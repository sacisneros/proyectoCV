/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.seguridad.model;


import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import practica.model.entities.Practicasoa;

/**
 *
 * @author Saul
 */
@Stateless
public class ManagerPractica {

    @PersistenceContext(unitName = "proyectoPU")
    private EntityManager em;

    //metodos de búsqueda:
    public List<Practicasoa> findAllPersonas() {
        Query q = em.createNamedQuery("Practicasoa.findAll", Practicasoa.class);
        return q.getResultList();
    }

    public Practicasoa findPersonaPorCedula(String cedula) {
        Query q = em.createNamedQuery("Practicasoa.findByCedula", Practicasoa.class);
        q.setParameter("cedula", cedula);
        return (Practicasoa) q.getSingleResult();
    }
    
    public void crearPersona(String cedula, String nombres, Integer anionac, String correo, String lenguaje) {
        Practicasoa p = new Practicasoa(cedula, nombres, anionac, correo, lenguaje);
        em.persist(p);
    }
}
