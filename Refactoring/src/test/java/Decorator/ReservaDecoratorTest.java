/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Decorator;

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
public class ReservaDecoratorTest {
    
    public ReservaDecoratorTest() {
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
     * Test of getPrecioTotal method, of class ReservaDecorator.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        ReservaDecorator instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class ReservaDecorator.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        ReservaDecorator instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarReserva method, of class ReservaDecorator.
     */
    @Test
    public void testConfirmarReserva() {
        System.out.println("confirmarReserva");
        ReservaDecorator instance = null;
        instance.confirmarReserva();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelarReserva method, of class ReservaDecorator.
     */
    @Test
    public void testCancelarReserva() {
        System.out.println("cancelarReserva");
        ReservaDecorator instance = null;
        instance.cancelarReserva();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ReservaDecoratorImpl extends ReservaDecorator {

        public ReservaDecoratorImpl() {
            super(null);
        }
    }
    
}
