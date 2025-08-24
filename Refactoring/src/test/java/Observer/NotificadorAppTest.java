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
public class NotificadorAppTest {
    
    public NotificadorAppTest() {
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
     * Test of actualizar method, of class NotificadorApp.
     */
    
    @Test // NOT02
    void notificadorApp_enviaMensaje() {
        Usuario usuario = new Usuario("U4", "Marta", "marta@test.com");
        NotificadorApp app = new NotificadorApp("U4");
        assertTrue(app.enviar("Check-in disponible"));
    }
    
}
