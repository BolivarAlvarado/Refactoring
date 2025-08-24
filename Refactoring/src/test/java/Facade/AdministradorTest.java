package Facade;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class AdministradorTest {

    private Administrador admin;

    @BeforeEach
    public void setUp(){
        admin = new Administrador("Juan");
    }

    @Test
    void Adm01_agregarPolitica_nuevaClave() {
        // Arrange
        Politica politica = new PoliticaCancelacion(7, 0.1);

        // Act
        admin.agregarPolitica("202311", politica);

        // Assert
        assertTrue(admin.getPoliticas().containsKey("202311"));
        assertEquals(politica, admin.getPoliticas().get("202311"));
    }

    @Test
    void Adm02_agregarPolitica_actualizarClaveExistente() {
        // Arrange
        Politica politica1 = new PoliticaCancelacion(7, 0.1);
        Politica politica2 = new PoliticaCancelacion(3, 0.5);
        admin.agregarPolitica("202311", politica1);

        // Act
        admin.agregarPolitica("202311", politica2);

        // Assert
        assertEquals(politica2, admin.getPoliticas().get("202311"));
    }

    @Test
    void Adm03_validarCancelacion_politicaExiste() {
        // Arrange
        Politica politica = new PoliticaCancelacion(7, 0.1);
        Reserva reserva = new Reserva(); // dummy por ahora
        admin.agregarPolitica("202311", politica);

        // Act
        boolean resultado = admin.validarCancelacion("202311", reserva);

        // Assert
        assertTrue(resultado); // porque aplicar() devuelve true en PoliticaCancelacion
    }

    @Test
    void Adm04_validarCancelacion_politicaNoExiste() {
        // Arrange
        Reserva reserva = new Reserva();

        // Act
        boolean resultado = admin.validarCancelacion("999", reserva);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void Adm05_getPolitica_existente() {
        // Arrange
        Politica politica = new PoliticaCancelacion(10, 0.2);
        admin.agregarPolitica("202500", politica);

        // Act
        Politica result = admin.getPolitica("202500");

        // Assert
        assertEquals(politica, result);
    }

    @Test
    void Adm06_getPolitica_noExistente() {
        // Act
        Politica result = admin.getPolitica("999");

        // Assert
        assertNull(result);
    }
    
    //nuevo test
    @Test // ADM01
    void administrador_agregaPolitica() {
        Administrador admin = new Administrador("Juan");
        PoliticaCancelacion politica = new PoliticaCancelacion(10, 20);
        admin.agregarPolitica("p",politica);
        assertTrue(admin.getPoliticas().containsKey("p"));
    }
}
