package Abstract_Factory_Y_Builder.Vehiculo;
//Replace Subclass with Fields
public class VehiculoFactory {
    public static Vehiculo crearVehiculo(TipoVehiculo tipo) {
        return new VehiculoBuilder(tipo).build();
    }
}
