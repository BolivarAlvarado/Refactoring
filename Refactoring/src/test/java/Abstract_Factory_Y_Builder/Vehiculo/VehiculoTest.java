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
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of mostrarInfo method, of class Vehiculo.
     */
    @Test
    public void testMostrarInfo() {
        System.out.println("mostrarInfo");
        Vehiculo instance = new VehiculoImpl();
        instance.mostrarInfo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVehiculo method, of class Vehiculo.
     */
    @Test
    public void testSetIdVehiculo() {
        System.out.println("setIdVehiculo");
        String idVehiculo = "";
        Vehiculo instance = new VehiculoImpl();
        instance.setIdVehiculo(idVehiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Vehiculo.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        TipoVehiculo tipo = TipoVehiculo.LUJO;
        Vehiculo instance = new VehiculoImpl();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProveedor method, of class Vehiculo.
     */
    @Test
    public void testSetProveedor() {
        System.out.println("setProveedor");
        String proveedor = "";
        Vehiculo instance = new VehiculoImpl();
        instance.setProveedor(proveedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Vehiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        String modelo = "";
        Vehiculo instance = new VehiculoImpl();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Vehiculo.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Vehiculo instance = new VehiculoImpl();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Vehiculo.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        EstadoVehiculo estado = null;
        Vehiculo instance = new VehiculoImpl();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VehiculoImpl extends Vehiculo {

        public void mostrarInfo() {
        }
    }
    
}
