/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Abstract_Factory_Y_Builder.Vehiculo;

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
public class VehiculoEconomicoBuilderTest {
    
    public VehiculoEconomicoBuilderTest() {
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
     * Test of setProveedor method, of class VehiculoEconomicoBuilder.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        String proveedor = "";
        VehiculoEconomicoBuilder instance = new VehiculoEconomicoBuilder();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setProveedor(proveedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class VehiculoEconomicoBuilder.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        VehiculoEconomicoBuilder instance = new VehiculoEconomicoBuilder();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setColor(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class VehiculoEconomicoBuilder.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        VehiculoEconomicoBuilder instance = new VehiculoEconomicoBuilder();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setTipo(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class VehiculoEconomicoBuilder.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        VehiculoEconomicoBuilder instance = new VehiculoEconomicoBuilder();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setModelo(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class VehiculoEconomicoBuilder.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        EstadoVehiculo estado = null;
        VehiculoEconomicoBuilder instance = new VehiculoEconomicoBuilder();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setEstado(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class VehiculoEconomicoBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        VehiculoEconomicoBuilder instance = new VehiculoEconomicoBuilder();
        Vehiculo expResult = null;
        Vehiculo result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
