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

@NamedQueries(@NamedQuery(name="Citas.getAll",query="SELECT e FROM Citas e"))
/**
 * La clase Citas contiene los elementos y metodos necesarios para hacer la conexion
 * con la tabla Citas en la base de datos.
 * Esta clase implementa Serializable para estructurar
 * las anotaciones JPA
 */
public class Citas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private int id;
    
    @Column
    private int idPaciente;
    
    @Column
    private int tipoExamen;
    
    @Column
    private String fecha;
    
    /**
     * Constructor: 
     * Construye un nuevo Citas con atributos por defecto
     */
    public Citas(){
        this.id = 0;
        this.idPaciente = 0;
        this.tipoExamen = 0;
        this.fecha = "SIN";
    }
    
    /**
     * Constructor(Sobrecarga):
     * Construye un nuevo Citas en el cual los
     * atributos de dicha clase se inicializan con 
     * los valores que se le envian como parametro.
     * @param id
     * @param tipoExamen
     * @param fecha 
     */
    public Citas(int id, int tipoExamen, String fecha) {
        this.id = id;
        this.tipoExamen = tipoExamen;
        this.fecha = fecha;
    }
    /**
     * Metodo getId tiene la funcion de devolver
     * el atributo id correspondiente a la cita 
     * @return Atributo id
     */
    public int getId() {
        return id;
    }
    /**
     * Metodo setId asigna un valor a la variable id,
     * dicho valor se envia como parametro.
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo getIdPaciente tiene la funcion de
     * devolver el atributo idPaciente correspondiente
     * a la cita.
     * @return Atributo idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * Metodo setIdPaciente asigna un valor a la variable 
     * idPaciente, dicho valor se envia como parametro.
     * @param idPaciente  
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * Metodo getTipoExamen tiene la funcion de
     * devolver el atributo tipoExamen correspondiente
     * a la cita.
     * @return Atributo tipoExamen
     */
    public int getTipoExamen() {
        return tipoExamen;
    }

    /**
     * Metodo setTipoExamen asigna un valor a la variable 
     * tipoExamen, dicho valor se envia como parametro.
     * @param tipoExamen   
     */
    public void setTipoExamen(int tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    /**
     * Metodo getFecha tiene la funcion de
     * devolver el atributo fecha correspondiente
     * a la cita.
     * @return Atributo fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Metodo setFecha asigna un valor a la variable 
     * fecha, dicho valor se envia como parametro.
     * @param fecha   
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
