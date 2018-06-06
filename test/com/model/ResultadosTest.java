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
public class ResultadosTest {
    
    public ResultadosTest() {
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
     * Test of getId method, of class Resultados.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Resultados instance = new Resultados();
        int expResult = 3;
        instance.setId(3);
        int result = instance.getId();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
        
    }

    /**
     * Test of getIdPaciente method, of class Resultados.
     */
    @Test
    public void testGetIdPaciente() {
        System.out.println("getIdPaciente");
        Resultados instance = new Resultados();
        int expResult = 1;        
        instance.setIdPaciente(1);
        int result = instance.getIdPaciente();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
        
    }

    /**
     * Test of getIdExamen method, of class Resultados.
     */
    @Test
    public void testGetIdExamen() {
        System.out.println("getIdExamen");
        Resultados instance = new Resultados();
        int expResult = 132;
        instance.setIdExamen(132);
        int result = instance.getIdExamen();
        assertEquals(expResult, result);    
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }



    /**
     * Test of getResultados method, of class Resultados.
     */
    @Test
    public void testGetResultados() {
        System.out.println("getResultados");
        Resultados instance = new Resultados();
        String expResult = "VIH";
        instance.setResultados("VIH");
        String result = instance.getResultados();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }

}
