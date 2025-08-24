package Abstract_Factory_Y_Builder.Vehiculo;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class DirectorVehiculoTest {

    private VehiculoBuilder builder;
    private DirectorVehiculo director;

    @BeforeEach
    public void setUp() {
        builder = new VehiculoBuilder(TipoVehiculo.LUJO); // puedes usar otro builder si lo tienes
        director = new DirectorVehiculo(builder);
    }

    @Test // DV01
    void construirAutoBasico_construyeObjetoCorrectamente() {
        // Act
        Vehiculo vehiculo = director.construirAutoBasico();

        // Assert
        assertNotNull(vehiculo);
        assertEquals("Auto", vehiculo.getTipo());
        assertEquals("Ford", vehiculo.getProveedor());
        assertEquals("Focus", vehiculo.getModelo());
        assertEquals("Blanco", vehiculo.getColor());
        assertEquals(EstadoVehiculo.DISPONIBLE, vehiculo.getEstado());
    }

    @Test // DV02
    void construirAutoBasico_devuelveNuevoVehiculoCadaVez() {
        // Act
        Vehiculo vehiculo1 = director.construirAutoBasico();
        Vehiculo vehiculo2 = director.construirAutoBasico();

        // Assert
        assertNotSame(vehiculo1, vehiculo2); // debe ser un objeto distinto
    }

    @Test // DV03
    void construirAutoBasico_construyeConBuilderDiferente() {
        // Arrange
        builder = new VehiculoBuilder(TipoVehiculo.ECONOMICO); // si tienes otro builder
        director = new DirectorVehiculo(builder);

        // Act
        Vehiculo vehiculo = director.construirAutoBasico();

        // Assert
        assertNotNull(vehiculo);
        assertEquals("Auto", vehiculo.getTipo());
    }
}
