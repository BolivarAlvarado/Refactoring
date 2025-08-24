/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Abstract_Factory_Y_Builder.Vuelo;

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
public class VueloBuilderTest {
    
    public VueloBuilderTest() {
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
     * Test of setProveedor method, of class VueloBuilder.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        String proveedor = "";
        VueloBuilder instance = new VueloBuilderImpl();
        instance.setProveedor(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarAsientos method, of class VueloBuilder.
     */
    @Test
    public void testConfigurarAsientos() {
        System.out.println("configurarAsientos");
        VueloBuilder instance = new VueloBuilderImpl();
        instance.configurarAsientos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarComida method, of class VueloBuilder.
     */
    @Test
    public void testConfigurarComida() {
        System.out.println("configurarComida");
        VueloBuilder instance = new VueloBuilderImpl();
        instance.configurarComida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class VueloBuilder.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        VueloBuilder instance = new VueloBuilderImpl();
        Aeronave expResult = null;
        Aeronave result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDisponibilidad method, of class VueloBuilder.
     */
    @Test
    public void testVerificarDisponibilidad() {
        System.out.println("verificarDisponibilidad");
        VueloBuilder instance = new VueloBuilderImpl();
        boolean expResult = false;
        boolean result = instance.verificarDisponibilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VueloBuilderImpl implements VueloBuilder {

        public void setProveedor(String proveedor) {
        }

        public void configurarAsientos() {
        }

        public void configurarComida() {
        }

        public Aeronave getResultado() {
            return null;
        }

        public boolean verificarDisponibilidad() {
            return false;
        }
    }
    
}
