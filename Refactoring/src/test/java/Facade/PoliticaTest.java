/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Facade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Bolivar
 */
public class PoliticaTest {
    
    public PoliticaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aplicar method, of class Politica.
     */
    @Test
    public void testAplicar() {
        System.out.println("aplicar");
        Reserva reserva = null;
        Politica instance = new PoliticaImpl();
        boolean expResult = false;
        boolean result = instance.aplicar(reserva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Politica.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Politica instance = new PoliticaImpl();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PoliticaImpl implements Politica {

        public boolean aplicar(Reserva reserva) {
            return false;
        }

        public String getDescripcion() {
            return "";
        }
    }
    
}
