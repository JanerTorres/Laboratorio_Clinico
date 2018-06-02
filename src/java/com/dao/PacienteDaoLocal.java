/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.Paciente;
import java.util.List;
import javax.ejb.Local;

/**
 * La interface PacienteDaoLocal crea metodos 
 * para que la clase PacienteDao los sobreescriba.
 * @author USER
 */
@Local
public interface PacienteDaoLocal {
    
    /**
     * Metodo addPaciente, su funcion se especifica cuando 
     * se sobreescriba el metodo en la clase PacienteDao.
     * 
     * @param paciente 
     */
    void addPaciente(Paciente paciente);

    /**
     * Metodo getAllPacientes, su funcion se especifica cuando 
     * se sobreescriba el metodo en la clase PacienteDao.
     * 
     * @return Lista de pacientes
     */
    List<Paciente> getAllPacientes();
    
}
