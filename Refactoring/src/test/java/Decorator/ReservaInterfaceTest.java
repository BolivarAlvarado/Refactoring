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
public class ReservaInterfaceTest {
    
    public ReservaInterfaceTest() {
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
     * Test of getPrecioTotal method, of class ReservaInterface.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        ReservaInterface instance = new ReservaInterfaceImpl();
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class ReservaInterface.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        ReservaInterface instance = new ReservaInterfaceImpl();
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarReserva method, of class ReservaInterface.
     */
    @Test
    public void testConfirmarReserva() {
        System.out.println("confirmarReserva");
        ReservaInterface instance = new ReservaInterfaceImpl();
        instance.confirmarReserva();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelarReserva method, of class ReservaInterface.
     */
    @Test
    public void testCancelarReserva() {
        System.out.println("cancelarReserva");
        ReservaInterface instance = new ReservaInterfaceImpl();
        instance.cancelarReserva();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ReservaInterfaceImpl implements ReservaInterface {

        public double getPrecioTotal() {
            return 0.0;
        }

        public String getDescripcion() {
            return "";
        }

        public void confirmarReserva() {
        }

        public void cancelarReserva() {
        }
    }
    
}
