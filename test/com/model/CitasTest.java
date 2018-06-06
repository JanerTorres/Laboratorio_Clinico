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
public class CitasTest {
    
    public CitasTest() {
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
     * Test of getId method, of class Citas.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Citas instance = new Citas();
        int expResult = 2;
        instance.setId(2);
        int result = instance.getId();
        assertEquals(expResult, result);
         System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }

   

    /**
     * Test of getIdPaciente method, of class Citas.
     */
    @Test
    public void testGetIdPaciente() {
        System.out.println("getIdPaciente");
        Citas instance = new Citas();
        int expResult = 2342;
        instance.setIdPaciente(2342);
        int result = instance.getIdPaciente();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }

  

    /**
     * Test of getTipoExamen method, of class Citas.
     */
    @Test
    public void testGetTipoExamen() {
        System.out.println("getTipoExamen");
        Citas instance = new Citas();
        int expResult = 2;
        instance.setTipoExamen(2);
        int result = instance.getTipoExamen();
        assertEquals(expResult, result);
         System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }

    /**
     * Test of getFecha method, of class Citas.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Citas instance = new Citas();
        String expResult = "Marzo 3";
        instance.setFecha("Marzo 2");
        String result = instance.getFecha();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }

    /**
     * Test of setFecha method, of class Citas.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Citas instance = new Citas();
        instance.setFecha(fecha);
        
    }
    
}
