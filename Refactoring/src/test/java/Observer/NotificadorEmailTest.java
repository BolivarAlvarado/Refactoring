/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Observer;

import Facade.Reserva;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Facade.Usuario;

/**
 *
 * @author Bolivar
 */
public class NotificadorEmailTest {
    
    public NotificadorEmailTest() {
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
     * Test of actualizar method, of class NotificadorEmail.
     */
    @Test
    public void testActualizar() {
        System.out.println("actualizar");
        Reserva reserva = null;
        String mensaje = "";
        NotificadorEmail instance = null;
        instance.actualizar(reserva, mensaje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test // NOT01
    void notificadorEmail_enviaMensaje() {
        Usuario usuario = new Usuario("U3", "Carlos", "carlos@test.com");
        NotificadorEmail email = new NotificadorEmail(usuario, "carlos@test.com");
        assertTrue(email.enviar("Reserva confirmada"));
    }
    
}
