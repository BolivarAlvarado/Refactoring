/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Abstract_Factory_Y_Builder.Vuelo;

import java.time.LocalDateTime;
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
public class VueloTest {
    
    public VueloTest() {
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
     * Test of mostrarDetalles method, of class Vuelo.
     */
    @Test
    public void testMostrarDetalles() {
        System.out.println("mostrarDetalles");
        Vuelo instance = new VueloImpl();
        instance.mostrarDetalles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Vuelo.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        EstadoVuelo estado = null;
        Vuelo instance = new VueloImpl();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdVuelo method, of class Vuelo.
     */
    @Test
    public void testSetIdVuelo() {
        System.out.println("setIdVuelo");
        String idVuelo = "";
        Vuelo instance = new VueloImpl();
        instance.setIdVuelo(idVuelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrigen method, of class Vuelo.
     */
    @Test
    public void testSetOrigen() {
        System.out.println("setOrigen");
        String origen = "";
        Vuelo instance = new VueloImpl();
        instance.setOrigen(origen);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDestino method, of class Vuelo.
     */
    @Test
    public void testSetDestino() {
        System.out.println("setDestino");
        String destino = "";
        Vuelo instance = new VueloImpl();
        instance.setDestino(destino);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaSalida method, of class Vuelo.
     */
    @Test
    public void testSetFechaSalida() {
        System.out.println("setFechaSalida");
        LocalDateTime fechaSalida = null;
        Vuelo instance = new VueloImpl();
        instance.setFechaSalida(fechaSalida);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaLlegada method, of class Vuelo.
     */
    @Test
    public void testSetFechaLlegada() {
        System.out.println("setFechaLlegada");
        LocalDateTime fechaLlegada = null;
        Vuelo instance = new VueloImpl();
        instance.setFechaLlegada(fechaLlegada);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecioBase method, of class Vuelo.
     */
    @Test
    public void testSetPrecioBase() {
        System.out.println("setPrecioBase");
        double precioBase = 0.0;
        Vuelo instance = new VueloImpl();
        instance.setPrecioBase(precioBase);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAsientosDisponibles method, of class Vuelo.
     */
    @Test
    public void testSetAsientosDisponibles() {
        System.out.println("setAsientosDisponibles");
        int asientosDisponibles = 0;
        Vuelo instance = new VueloImpl();
        instance.setAsientosDisponibles(asientosDisponibles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCapacidad method, of class Vuelo.
     */
    @Test
    public void testSetCapacidad() {
        System.out.println("setCapacidad");
        int capacidad = 0;
        Vuelo instance = new VueloImpl();
        instance.setCapacidad(capacidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VueloImpl extends Vuelo {

        public void mostrarDetalles() {
        }
    }
    
}
