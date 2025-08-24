package Abstract_Factory_Y_Builder.Vehiculo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoSuvBuilderTest {

    private VehiculoSuvBuilder builder;

    @BeforeEach
    public void setUp() {
        builder = new VehiculoSuvBuilder();
    }

    @Test // VSB01
    void constructor_creaObjetoVehiculoSuvExitosamente() {
        assertNotNull(builder);
    }

    @Test // VSB02
    void build_retornaObjetoVehiculoSuv() {
        Vehiculo vehiculo = builder.build();
        assertNotNull(vehiculo);
        assertTrue(vehiculo instanceof VehiculoSuv);
    }

    @Test // VSB03
    void setProveedor_asignaProveedorCorrecto() {
        builder.setProveedor("Toyota");
        Vehiculo vehiculo = builder.build();
        assertEquals("Toyota", vehiculo.getProveedor());
    }

    @Test // VSB04
    void setColor_asignaColorCorrecto() {
        builder.setColor("Negro");
        Vehiculo vehiculo = builder.build();
        assertEquals("Negro", vehiculo.getColor());
    }

    @Test // VSB05
    void setTipo_asignaTipoCorrecto() {
        builder.setTipo("SUV");
        Vehiculo vehiculo = builder.build();
        assertEquals("SUV", vehiculo.getTipo());
    }

    @Test // VSB06
    void setModelo_asignaModeloCorrecto() {
        builder.setModelo("RAV4");
        Vehiculo vehiculo = builder.build();
        assertEquals("RAV4", vehiculo.getModelo());
    }

    @Test // VSB07
    void setEstado_asignaEstadoCorrecto() {
        builder.setEstado(EstadoVehiculo.DISPONIBLE);
        Vehiculo vehiculo = builder.build();
        assertEquals(EstadoVehiculo.DISPONIBLE, vehiculo.getEstado());
    }

    @Test // VSB08
    void build_retornaSiempreLaMismaInstancia() {
        Vehiculo vehiculo1 = builder.build();
        Vehiculo vehiculo2 = builder.build();
        assertSame(vehiculo1, vehiculo2); // el builder guarda la misma instancia
    }
}

