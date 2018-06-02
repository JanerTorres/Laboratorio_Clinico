package com.model;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity

@Table

@NamedQueries(@NamedQuery(name = "Resultados.getAll", query = "SELECT a FROM Resultados a"))

/**
 * La clase Resultados contiene los elementos y metodos necesarios para hacer la conexion
 * con la tabla Resultados en la base de datos.
 * Esta clase implementa Serializable para estructurar
 * las anotaciones JPA
 */
public class Resultados implements Serializable{
    
    @Id
    @Column
    private int id;
    
    @Column
    private int idPaciente;
    
    @Column
    private int idExamen;
    
    @Column
    private String resultados;
    
    /**
     * Constructor: 
     * Construye un nuevo Resultados con atributos por defecto
     */
    public Resultados(){
        this.id = 0;
        this.idPaciente = 0;
        this.idExamen = 0;
        this.resultados = "SIN";
    }
    
    /**
     * Constructor(Sobrecarga):
     * Construye un nuevo Resultados en el cual los
     * atributos de dicha clase se inicializan con 
     * los valores que se le envian como parametro.
     * @param id 
     * @param resultados  
     */
    public Resultados(int id, String resultados) {
        this.id = id;
        this.resultados = resultados;
    }

    /**
     * Metodo getId tiene la funcion de devolver
     * el atributo id correspondiente al resultado. 
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
     * Metodo getIdExamen tiene la funcion de devolver
     * el atributo idExamen correspondiente al examen. 
     * @return Atributo idExamen
     */
    public int getIdPaciente() {
        return idPaciente;
    }
    
    /**
     * Metodo setIdPaciente asigna un valor a la variable idPaciente,
     * dicho valor se envia como parametro.
     * @param idPaciente   
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    /**
     * Metodo getIdExamen tiene la funcion de devolver
     * el atributo idExamen correspondiente al resultado. 
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
     * Metodo getResultados tiene la funcion de devolver
     * el atributo resultados correspondiente al resultado. 
     * @return Atributo resultado
     */
    public String getResultados() {
        return resultados;
    }

    /**
     * Metodo setResultados asigna un valor a la variable resultados,
     * dicho valor se envia como parametro.
     * @param resultados   
     */
    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
    
}
