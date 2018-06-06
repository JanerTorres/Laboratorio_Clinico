/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hogar
 */
public class PacienteTest {
    
    public PacienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getId method, of class Paciente.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Paciente instance = new Paciente();
        instance.setId(3);
        int expResult = 3;
        assertEquals(expResult, instance.getId());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testGetNombre(){
        System.out.println("getNombre");
        Paciente prueba = new Paciente();
        prueba.setNombre("Carlitos");
        String expResult = "Carlitos";
        assertEquals(expResult, prueba.getNombre());
        
    }
    
    @Test
    public void testGetApellidos(){
        System.out.println("getApellidos");
        Paciente prueba1 = new Paciente();
        prueba1.setApellidos("Villa");
        String expResult = "Villá";
        assertEquals(expResult, prueba1.getApellidos());
    }
    
    @Test
    public void testGetEdad(){
        System.out.println("getEdad");
        Paciente prueba1 = new Paciente();
        prueba1.setEdad(20);
        int expResult = 20;
        assertEquals(expResult, prueba1.getEdad());
    }
    @Test
    public void testGetEps(){
        System.out.println("getEps");
        Paciente prueba1 = new Paciente();
        prueba1.setEps("Sura");
        String expResult = "Sura";
        assertEquals(expResult, prueba1.getEps());
       
    }
    @Test
    public void testGetDireccion(){
        System.out.println("getDireeccion");
        Paciente prueba1 = new Paciente();
        prueba1.setDireccion("Cll 30 c");
        String expResult = "Cll 30 c";
        assertEquals(expResult, prueba1.getDireccion());
    }
    
    @Test
    public void testGetTelefono(){
        System.out.println("getTelefono");
         Paciente prueba1 = new Paciente();
         prueba1.setTelefono(4613528);
         int expResult = 4613528;
         assertEquals(expResult, prueba1.getDireccion());
    }
    
    }
    
   

    

