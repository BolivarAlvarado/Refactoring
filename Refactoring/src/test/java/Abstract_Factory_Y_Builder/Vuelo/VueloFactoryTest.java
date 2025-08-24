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
public class VueloFactoryTest {
    
    public VueloFactoryTest() {
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
     * Test of crearVuelo method, of class VueloFactory.
     */
    @Test
    public void testCrearVuelo() {
        System.out.println("crearVuelo");
        String horario = "";
        VueloFactory instance = new VueloFactoryImpl();
        Vuelo expResult = null;
        Vuelo result = instance.crearVuelo(horario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class VueloFactoryImpl implements VueloFactory {

        public Vuelo crearVuelo(String horario) {
            return null;
        }
    }
    
}
