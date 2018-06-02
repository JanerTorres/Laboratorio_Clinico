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
@NamedQueries(@NamedQuery(name = "Paciente.getAll", query = "SELECT e FROM Paciente e"))

/**
 * La clase Paciente contiene los elementos y metodos necesarios para hacer la conexion
 * con la tabla Paciente en la base de datos.
 * Esta clase implementa Serializable para estructurar
 * las anotaciones JPA
 */
public class Paciente implements Serializable{
    //Paciente tabla maestra, el paciente no tendrá la opción de modificar los datos.
    
    @Id
    @Column
    private int id;
    
    @Column
    private String nombre;
    
    @Column
    private String apellidos;
    
    @Column
    private int edad;
    
    @Column
    private String eps;
    
    @Column
    private String direccion;
    
    @Column
    private int telefono;
    
    /**
     * Constructor: 
     * Construye un nuevo Paciente con atributos por defecto
     */
    public Paciente(){
        this.id = 0;
        this.nombre = "SIN";
        this.apellidos = "SIN";
        this.edad = 0;
        this.eps = "SIN";
        this.direccion = "SIN";
        this.telefono = 0;
        
    }

    /**
     * Constructor(Sobrecarga):
     * Construye un nuevo Paciente en el cual los
     * atributos de dicha clase se inicializan con 
     * los valores que se le envian como parametro.
     * @param id
     * @param nombre
     * @param apellidos
     * @param edad
     * @param eps
     * @param direccion
     * @param telefono 
     */
    public Paciente(int id, String nombre, String apellidos, int edad, String eps, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.eps = eps;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * Metodo getId tiene la funcion de devolver
     * el atributo id correspondiente al paciente. 
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
     * Metodo getNombre tiene la funcion de devolver
     * el atributo nombre correspondiente al paciente. 
     * @return Atributo nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setNombre asigna un valor a la variable nombre,
     * dicho valor se envia como parametro.
     * @param nombre  
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo getApellidos tiene la funcion de devolver
     * el atributo apellidos correspondiente al paciente. 
     * @return Atributo apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Metodo setApellidos asigna un valor a la variable apellidos,
     * dicho valor se envia como parametro.
     * @param apellidos  
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Metodo getEdad tiene la funcion de devolver
     * el atributo edad correspondiente al paciente. 
     * @return Atributo edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo setEdad asigna un valor a la variable edad,
     * dicho valor se envia como parametro.
     * @param edad  
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo getEps tiene la funcion de devolver
     * el atributo id correspondiente al paciente. 
     * @return Atributo eps
     */
    public String getEps() {
        return eps;
    }

    /**
     * Metodo setEps asigna un valor a la variable eps,
     * dicho valor se envia como parametro.
     * @param eps  
     */
    public void setEps(String eps) {
        this.eps = eps;
    }

    /**
     * Metodo getDireccion tiene la funcion de devolver
     * el atributo direccion correspondiente al paciente. 
     * @return Atributo direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo setDireccion asigna un valor a la variable direccion,
     * dicho valor se envia como parametro.
     * @param direccion  
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo getTelefono tiene la funcion de devolver
     * el atributo telefono correspondiente al paciente. 
     * @return Atributo telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Metodo setTelefono asigna un valor a la variable telefono,
     * dicho valor se envia como parametro.
     * @param telefono  
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    

   
    
}
