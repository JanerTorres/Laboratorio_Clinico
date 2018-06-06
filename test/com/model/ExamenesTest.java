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
public class ExamenesTest {

    public ExamenesTest() {
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
     * Test of getIdExamen method, of class Examenes.
     */
    @Test
    public void testGetIdExamen() {
        System.out.println("getIdExamen");
        Examenes instance = new Examenes();
        int expResult = 245;
        instance.setIdExamen(245);
        int result = instance.getIdExamen();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }


    /**
     * Test of getNombreExamen method, of class Examenes.
     */
    @Test
    public void testGetNombreExamen() {
        System.out.println("getNombreExamen");
        Examenes instance = new Examenes();
        String expResult = "Hipermagnesemia";
        instance.setNombreExamen("Hipermagnesemia");
        String result = instance.getNombreExamen();
        assertEquals(expResult, result);
        System.out.println("Resultado esperado " + expResult + "//" + "Resultado " + result);
    }

    /**
     * Test of setNombreExamen method, of class Examenes.
     */
    @Test
    public void testSetNombreExamen() {
        System.out.println("setNombreExamen");
        String nombreExamen = "Sodio";
        Examenes instance = new Examenes();
        instance.setNombreExamen(nombreExamen);
    
    }

}
