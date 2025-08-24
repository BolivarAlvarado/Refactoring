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
public class AeronaveTest {
    
    public AeronaveTest() {
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
     * Test of setProveedor method, of class Aeronave.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        String proveedor = "";
        Aeronave instance = new Aeronave();
        instance.setProveedor(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoAsiento method, of class Aeronave.
     */
    @Test
    public void testSetTipoAsiento() {
        System.out.println("setTipoAsiento");
        String tipoAsiento = "";
        Aeronave instance = new Aeronave();
        instance.setTipoAsiento(tipoAsiento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setServicioComida method, of class Aeronave.
     */
    @Test
    public void testSetServicioComida() {
        System.out.println("setServicioComida");
        boolean servicioComida = false;
        Aeronave instance = new Aeronave();
        instance.setServicioComida(servicioComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarConfiguracion method, of class Aeronave.
     */
    @Test
    public void testMostrarConfiguracion() {
        System.out.println("mostrarConfiguracion");
        Aeronave instance = new Aeronave();
        instance.mostrarConfiguracion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
