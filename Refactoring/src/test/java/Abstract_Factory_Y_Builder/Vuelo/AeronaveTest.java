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
     * Test of setTipoAsiento method, of class Aeronave.
     */
    @Test
    public void testSetTipoAsiento() {
        System.out.println("setTipoAsiento");
        TipoAsiento tipoAsiento = TipoAsiento.EJECUTIVO;
        AeronaveInicial aeronave = new AeronaveInicial(TipoAsiento.ECONOMICO, true, "Avianca");
        Aeronave instance = new Aeronave(aeronave);
        aeronave.setTipoAsiento(tipoAsiento);
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
        AeronaveInicial aeronave = new AeronaveInicial(TipoAsiento.ECONOMICO, true, "Avianca");
        Aeronave instance = new Aeronave(aeronave);
        aeronave.setServicioComida(servicioComida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarConfiguracion method, of class Aeronave.
     */
    @Test
    public void testMostrarConfiguracion() {
        System.out.println("mostrarConfiguracion");
        Aeronave instance = new Aeronave(new AeronaveInicial(TipoAsiento.ECONOMICO, true, "Avianca"));
        instance.mostrarConfiguracion();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
