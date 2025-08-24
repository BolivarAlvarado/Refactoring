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
public class BuilderPrimeraClaseTest {
    
    public BuilderPrimeraClaseTest() {
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
     * Test of setProveedor method, of class BuilderPrimeraClase.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        String proveedor = "";
        BuilderPrimeraClase instance = new BuilderPrimeraClase();
        instance.setProveedor(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarAsientos method, of class BuilderPrimeraClase.
     */
    @Test
    public void testConfigurarAsientos() {
        System.out.println("configurarAsientos");
        BuilderPrimeraClase instance = new BuilderPrimeraClase();
        instance.configurarAsientos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarComida method, of class BuilderPrimeraClase.
     */
    @Test
    public void testConfigurarComida() {
        System.out.println("configurarComida");
        BuilderPrimeraClase instance = new BuilderPrimeraClase();
        instance.configurarComida();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class BuilderPrimeraClase.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        BuilderPrimeraClase instance = new BuilderPrimeraClase();
        Aeronave expResult = null;
        Aeronave result = instance.getResultado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarDisponibilidad method, of class BuilderPrimeraClase.
     */
    @Test
    public void testVerificarDisponibilidad() {
        System.out.println("verificarDisponibilidad");
        BuilderPrimeraClase instance = new BuilderPrimeraClase();
        boolean expResult = false;
        boolean result = instance.verificarDisponibilidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
