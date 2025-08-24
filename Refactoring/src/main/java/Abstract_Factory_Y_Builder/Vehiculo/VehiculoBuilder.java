package Abstract_Factory_Y_Builder.Vehiculo;

public class VehiculoBuilder {
    private final Vehiculo vehiculo;

    public VehiculoBuilder(TipoVehiculo tipo) { // Ej: "SUV", "LUJO", "ECONOMICO"
        vehiculo = new Vehiculo();
        vehiculo.setTipo(tipo);
    }

    public VehiculoBuilder setIdVehiculo(String idVehiculo) {
        vehiculo.setIdVehiculo(idVehiculo);
        return this;
    }

    public VehiculoBuilder setProveedor(String proveedor) {
        vehiculo.setProveedor(proveedor);
        return this;
    }

    public VehiculoBuilder setModelo(String modelo) {
        vehiculo.setModelo(modelo);
        return this;
    }

    public VehiculoBuilder setColor(String color) {
        vehiculo.setColor(color);
        return this;
    }

    public VehiculoBuilder setEstado(EstadoVehiculo estado) {
        vehiculo.setEstado(estado);
        return this;
    }

    public VehiculoBuilder setPrecio(double precio) {
        vehiculo.setPrecio(precio);
        return this;
    }
    
    public VehiculoBuilder setTipo(TipoVehiculo tipo){
        vehiculo.setTipo(tipo);
        return this;
    }

    public Vehiculo build() {
        return vehiculo;
    }
}

