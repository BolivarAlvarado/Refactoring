/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Facade;

import Observer.ObservadorReserva;
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
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of getPrecioTotal method, of class Reserva.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        Reserva instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class Reserva.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        Reserva instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of confirmarReserva method, of class Reserva.
     */
    @Test
    public void testConfirmarReserva() {
        System.out.println("confirmarReserva");
        Reserva instance = null;
        instance.confirmarReserva();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelarReserva method, of class Reserva.
     */
    @Test
    public void testCancelarReserva() {
        System.out.println("cancelarReserva");
        Reserva instance = null;
        instance.cancelarReserva();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarObservador method, of class Reserva.
     */
    @Test
    public void testAgregarObservador() {
        System.out.println("agregarObservador");
        ObservadorReserva o = null;
        Reserva instance = null;
        instance.agregarObservador(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarObservador method, of class Reserva.
     */
    @Test
    public void testEliminarObservador() {
        System.out.println("eliminarObservador");
        ObservadorReserva o = null;
        Reserva instance = null;
        instance.eliminarObservador(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdReserva method, of class Reserva.
     */
    @Test
    public void testGetIdReserva() {
        System.out.println("getIdReserva");
        Reserva instance = null;
        String expResult = "";
        String result = instance.getIdReserva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class Reserva.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        Reserva instance = null;
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecioBase method, of class Reserva.
     */
    @Test
    public void testGetPrecioBase() {
        System.out.println("getPrecioBase");
        Reserva instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioBase();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
