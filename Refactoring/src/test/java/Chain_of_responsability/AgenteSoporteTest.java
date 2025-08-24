package Chain_of_responsability;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AgenteSoporteTest {
    
    private AgenteSoporte agente;

    @BeforeEach
    public void setUp() {
        agente = new AgenteSoporte("Agente 1");
    }

    @Test // AS01
    void puedeResolver_incidenciaSimple_devuelveTrue() {
        Incidencia inc = new Incidencia("INCIDENCIA1", "simple");
        assertTrue(agente.puedeResolver(inc));
    }

    @Test // AS02
    void puedeResolver_incidenciaAerolinea_devuelveFalse() {
        Incidencia inc = new Incidencia("INCIDENCIA2", "aerolinea");
        assertFalse(agente.puedeResolver(inc));
    }

    @Test // AS03
    void constructor_asignaNombreCorrectamente() {
        assertNotNull(agente);
        // Si tuvieras un getter de nombre, aquí podrías validarlo:
        // assertEquals("Agente 1", agente.getNombre());
    }
}

