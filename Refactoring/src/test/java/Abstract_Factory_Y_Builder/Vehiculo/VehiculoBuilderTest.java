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
public class VehiculoBuilderTest {
    
    public VehiculoBuilderTest() {
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
     * Test of setProveedor method, of class VehiculoBuilder.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        String proveedor = "";
        VehiculoBuilder instance = new VehiculoBuilderImpl();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setProveedor(proveedor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class VehiculoBuilder.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        VehiculoBuilder instance = new VehiculoBuilderImpl();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setColor(color);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class VehiculoBuilder.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        VehiculoBuilder instance = new VehiculoBuilderImpl();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setTipo(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class VehiculoBuilder.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        VehiculoBuilder instance = new VehiculoBuilderImpl();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setModelo(modelo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class VehiculoBuilder.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        EstadoVehiculo estado = null;
        VehiculoBuilder instance = new VehiculoBuilderImpl();
        VehiculoBuilder expResult = null;
        VehiculoBuilder result = instance.setEstado(estado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of build method, of class VehiculoBuilder.
     */
    @Test
    public void testBuild() {
        System.out.println("build");
        VehiculoBuilder instance = new VehiculoBuilderImpl();
        Vehiculo expResult = null;
        Vehiculo result = instance.build();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VehiculoBuilderImpl implements VehiculoBuilder {

        public VehiculoBuilder setProveedor(String proveedor) {
            return null;
        }

        public VehiculoBuilder setColor(String color) {
            return null;
        }

        public VehiculoBuilder setTipo(String tipo) {
            return null;
        }

        public VehiculoBuilder setModelo(String modelo) {
            return null;
        }

        public VehiculoBuilder setEstado(EstadoVehiculo estado) {
            return null;
        }

        public Vehiculo build() {
            return null;
        }
    }
    
}
