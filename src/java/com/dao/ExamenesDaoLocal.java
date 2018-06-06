/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Examenes;
import java.util.List;
import javax.ejb.Local;

/**
 * La interface ExamenesDaoLocal crea metodos para que la clase ExamenesDao los
 * sobreescriba.
 *
 * @author USER
 */
@Local
public interface ExamenesDaoLocal {

    /**
     * Metodo getAllExamenes, su funcion se especifica cuando 
     * se sobreescriba el metodo en la clase ExamenesDao.
     * 
     * @return 
     */
    List<Examenes> getAllExamenes();

}
