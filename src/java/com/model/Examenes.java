package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table

@NamedQueries(@NamedQuery(name = "Examenes.getAll", query = "SELECT e FROM Examenes e"))

/**
 * La clase Examenes contiene los elementos y metodos necesarios para hacer la conexion
 * con la tabla Examenes en la base de datos.
 * Esta clase implementa Serializable para estructurar
 * las anotaciones JPA
 */
public class Examenes implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int idExamen;
    
    @Column
    private String nombreExamen;

    /**
     * Constructor: 
     * Construye un nuevo Examenes con atributos por defecto
     */
    public Examenes(){
        this.idExamen = 0;
        this.nombreExamen = "SIN";
    }
    
    /**
     * Constructor(Sobrecarga):
     * Construye un nuevo Examenes en el cual los
     * atributos de dicha clase se inicializan con 
     * los valores que se le envian como parametro.
     * @param idExamen
     * @param nombreExamen 
     */
    public Examenes(int idExamen, String nombreExamen) {
        this.idExamen = idExamen;
        this.nombreExamen = nombreExamen;
    }

    /**
     * Metodo getIdExamen tiene la funcion de devolver
     * el atributo idExamen correspondiente al examen. 
     * @return Atributo idExamen
     */
    public int getIdExamen() {
        return idExamen;
    }

    /**
     * Metodo setIdExamen asigna un valor a la variable idExamen,
     * dicho valor se envia como parametro.
     * @param idExamen  
     */
    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    /**
     * Metodo getNombreExamen tiene la funcion de devolver
     * el atributo nombreExamen correspondiente al examen. 
     * @return Atributo nombreExamen
     */
    public String getNombreExamen() {
        return nombreExamen;
    }

    /**
     * Metodo setNombreExamen asigna un valor a la variable nombreExamen,
     * dicho valor se envia como parametro.
     * @param nombreExamen   
     */
    public void setNombreExamen(String nombreExamen) {
        this.nombreExamen = nombreExamen;
    }

    
}
