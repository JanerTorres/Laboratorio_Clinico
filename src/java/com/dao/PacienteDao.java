
package com.dao;

import com.model.Paciente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * La clase PacienteDao es la encargada de usar la
 * persistencia para manejar la informacion que gracias a los POJO's
 * se obtiene de la base de datos.
 * 
 * @author USER
 */
@Stateless
public class PacienteDao implements PacienteDaoLocal {
    
    @PersistenceContext
    private EntityManager em;
    
    /**
     * Metodo addPaciente se usa para añadir una nueva instancia de Paciente
     * a la base de datos
     * @param paciente 
     */
    @Override
    public void addPaciente(Paciente paciente) {
        em.persist(paciente);
    }

    /**
     * Metodo getAllPacientes se usa para obtener todas las 
     * instancias de Paciente que se encuentran en la tabla Pacientes.
     * @return 
     */
    @Override
    public List<Paciente> getAllPacientes() {
        return em.createNamedQuery("Paciente.getAll").getResultList();
    }
    
    

    
}
