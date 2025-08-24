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
import Facade.Reserva;
import Facade.Usuario;

/**
 *
 * @author Bolivar
 */
public class CoberturaExtendidaDecoratorTest {
    
    public CoberturaExtendidaDecoratorTest() {
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
     * Test of getPrecioTotal method, of class CoberturaExtendidaDecorator.
     */
    @Test
    public void testGetPrecioTotal() {
        System.out.println("getPrecioTotal");
        CoberturaExtendidaDecorator instance = null;
        double expResult = 0.0;
        double result = instance.getPrecioTotal();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescripcion method, of class CoberturaExtendidaDecorator.
     */
    @Test
    public void testGetDescripcion() {
        System.out.println("getDescripcion");
        CoberturaExtendidaDecorator instance = null;
        String expResult = "";
        String result = instance.getDescripcion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    //nuevo test
    @Test // DEC02
    void coberturaExtendidaDecorator_aumentaPrecioYDescripcion() {
        Reserva reserva = new Reserva("R2", new Usuario("U2", "Luis", "luis@test.com"), 
                                      200, "Reserva estándar", null, null);
        ReservaInterface decorada = new CoberturaExtendidaDecorator(reserva, 100);

        assertEquals(300, decorada.getPrecioTotal());
        assertTrue(decorada.getDescripcion().contains("Cobertura extendida"));
    }
    
}
