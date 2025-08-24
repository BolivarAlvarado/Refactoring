package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoFactory {
    public static Vehiculo crearVehiculo(TipoVehiculo tipo) {
        return new VehiculoBuilder(tipo).build();
    }
}
