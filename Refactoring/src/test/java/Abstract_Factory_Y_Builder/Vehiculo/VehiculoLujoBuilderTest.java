package Abstract_Factory_Y_Builder.Vehiculo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class VehiculoLujoBuilderTest {

    private VehiculoLujoBuilder builder;

    @BeforeEach
    public void setUp() {
        builder = new VehiculoLujoBuilder();
    }

    @Test // VLB01
    void constructor_creaObjetoVehiculoLujoExitosamente() {
        assertNotNull(builder);
    }

    @Test // VLB02
    void build_retornaObjetoVehiculoLujo() {
        Vehiculo vehiculo = builder.build();
        assertNotNull(vehiculo);
        assertTrue(vehiculo instanceof VehiculoLujo);
    }

    @Test // VLB03
    void setProveedor_asignaProveedorCorrecto() {
        builder.setProveedor("BMW");
        Vehiculo vehiculo = builder.build();
        assertEquals("BMW", vehiculo.getProveedor());
    }

    @Test // VLB04
    void setColor_asignaColorCorrecto() {
        builder.setColor("Rojo");
        Vehiculo vehiculo = builder.build();
        assertEquals("Rojo", vehiculo.getColor());
    }

    @Test // VLB05
    void setTipo_asignaTipoCorrecto() {
        builder.setTipo("SUV");
        Vehiculo vehiculo = builder.build();
        assertEquals("SUV", vehiculo.getTipo());
    }

    @Test // VLB06
    void setModelo_asignaModeloCorrecto() {
        builder.setModelo("X5");
        Vehiculo vehiculo = builder.build();
        assertEquals("X5", vehiculo.getModelo());
    }

    @Test // VLB07
    void setEstado_asignaEstadoCorrecto() {
        builder.setEstado(EstadoVehiculo.DISPONIBLE);
        Vehiculo vehiculo = builder.build();
        assertEquals(EstadoVehiculo.DISPONIBLE, vehiculo.getEstado());
    }

    @Test // VLB08
    void build_retornaSiempreMismoObjetoVehiculoLujo() {
        Vehiculo vehiculo1 = builder.build();
        Vehiculo vehiculo2 = builder.build();
        assertSame(vehiculo1, vehiculo2); // el builder siempre devuelve la misma instancia
    }
}

