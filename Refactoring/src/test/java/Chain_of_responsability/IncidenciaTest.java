package Chain_of_responsability;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IncidenciaTest {
    
    public IncidenciaTest() {
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

    @Test
    void getDescripcion_retornaDescripcionCorrecta() {
        Incidencia inc = new Incidencia("Se ha caído la página", "simple");
        assertEquals("Se ha caído la página", inc.getDescripcion());
    }

    @Test
    void getTipo_retornaTipoCorrecto() {
        Incidencia inc = new Incidencia("Se ha caído la página", "simple");
        assertEquals("simple", inc.getTipo());
    }

    @Test // Inc1
    void constructor_valido_creaIncidencia() {
        Incidencia inc = new Incidencia("Se ha caído la página", "simple");
        assertEquals("simple", inc.getTipo());
    }

    @Test // Inc2
    void constructor_tipoVacio_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> new Incidencia("Se ha caído la página", ""));
    }

    @Test // Inc3
    void constructor_tipoInvalido_lanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> new Incidencia("Se ha caído la página", "Complejo"));
    }
}

