package Chain_of_responsability;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ServicioClienteAereolineaTest {
    
    public ServicioClienteAereolineaTest() {
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
    void puedeResolver_incidenciaAerolinea_devuelveTrue() {
        ServicioClienteAereolinea servicio = new ServicioClienteAereolinea();
        Incidencia inc = new Incidencia("Problema con vuelo", "aerolinea");
        assertTrue(servicio.puedeResolver(inc));
    }

    @Test
    void puedeResolver_incidenciaSimple_devuelveFalse() {
        ServicioClienteAereolinea servicio = new ServicioClienteAereolinea();
        Incidencia inc = new Incidencia("Problema con la página web", "simple");
        assertFalse(servicio.puedeResolver(inc));
    }

    @Test
    void puedeResolver_incidenciaNula_devuelveFalse() {
        ServicioClienteAereolinea servicio = new ServicioClienteAereolinea();
        assertFalse(servicio.puedeResolver(null));
    }
}
