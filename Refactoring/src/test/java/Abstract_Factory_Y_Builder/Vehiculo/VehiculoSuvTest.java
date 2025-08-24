package Abstract_Factory_Y_Builder.Vehiculo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoSuvTest {

    private VehiculoSuv suv;

    @BeforeEach
    public void setUp() {
        suv = new VehiculoSuv();
        suv.setIdVehiculo("SUV001");
        suv.setProveedor("Toyota");
        suv.setModelo("RAV4");
        suv.setColor("Negro");
        suv.setEstado(EstadoVehiculo.DISPONIBLE);
    }

    @Test // VS01
    void mostrarInfo_noLanzaErrores() {
        assertDoesNotThrow(suv::mostrarInfo);
    }

    @Test // VS02
    void constructor_asignaTipoSUV() {
        VehiculoSuv nuevoSuv = new VehiculoSuv();
        assertEquals("SUV", nuevoSuv.getTipo());
    }

    @Test // VS03
    void getters_retornaValoresAsignados() {
        assertEquals("SUV001", suv.getIdVehiculo());
        assertEquals("Toyota", suv.getProveedor());
        assertEquals("RAV4", suv.getModelo());
        assertEquals("Negro", suv.getColor());
        assertEquals(EstadoVehiculo.DISPONIBLE, suv.getEstado());
    }
}
