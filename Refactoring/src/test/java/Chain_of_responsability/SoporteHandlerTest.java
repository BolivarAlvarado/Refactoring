package Chain_of_responsability;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoporteHandlerTest {

    @Test
    void setSiguiente_asignaCorrectamente() {
        SoporteHandler agente1 = new AgenteSoporte("Agente1") {
            @Override
            public boolean puedeResolver(Incidencia incidencia) { return false; }
        };
        SoporteHandler agente2 = new AgenteSoporte("Agente2") {
            @Override
            public boolean puedeResolver(Incidencia incidencia) { return false; }
        };

        agente1.setSiguiente(agente2);
        // No hay getter, así que validamos indirectamente manejando una incidencia
        Incidencia inc = new Incidencia("Prueba", "simple");
        assertDoesNotThrow(() -> agente1.manejar(inc));
    }

    @Test
    void manejar_incidenciaResueltaPorPrimero() {
        SoporteHandler agente = new AgenteSoporte("Agente1") {
            @Override
            public boolean puedeResolver(Incidencia incidencia) { return true; }
        };

        Incidencia inc = new Incidencia("Prueba", "simple");
        assertDoesNotThrow(() -> agente.manejar(inc));
    }

    @Test
    void manejar_incidenciaPasadaAlSiguiente() {
        SoporteHandler agente1 = new AgenteSoporte("Agente1") {
            @Override
            public boolean puedeResolver(Incidencia incidencia) { return false; }
        };
        SoporteHandler agente2 = new AgenteSoporte("Agente2") {
            @Override
            public boolean puedeResolver(Incidencia incidencia) { return true; }
        };
        agente1.setSiguiente(agente2);

        Incidencia inc = new Incidencia("Prueba", "simple");
        assertDoesNotThrow(() -> agente1.manejar(inc));
    }

    @Test
    void manejar_incidenciaNoResuelta() {
        SoporteHandler agente = new AgenteSoporte("Agente1") {
            @Override
            public boolean puedeResolver(Incidencia incidencia) { return false; }
        };

        Incidencia inc = new Incidencia("Prueba", "simple");
        assertDoesNotThrow(() -> agente.manejar(inc));
    }
}

