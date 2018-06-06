/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Examenes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * La clase ExamenesDao es la encargada de usar la
 * persisencia para manejar la informacion que gracias a los POJO's
 * se obtiene de la base de datos.
 * 
 * @author USER
 */
@Stateless
public class ExamenesDao implements ExamenesDaoLocal {
    
    @PersistenceContext
    private EntityManager em;
    

    /**
     * Metodo getAllExamenes se usa para obtener todas las instancias de
     * Examenes que se encuentran en la tabla Examenes.
     * 
     * @return 
     */
    @Override
    public List<Examenes> getAllExamenes() {
        return em.createNamedQuery("Examenes.getAll").getResultList();
    }

    
}
