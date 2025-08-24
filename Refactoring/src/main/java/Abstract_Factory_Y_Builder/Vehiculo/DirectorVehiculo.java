package Abstract_Factory_Y_Builder.Vehiculo;

public class DirectorVehiculo {
    private VehiculoBuilder builder;

    public DirectorVehiculo(VehiculoBuilder builder) {
        this.builder = builder;
    }

    public Vehiculo construirAutoBasico() {
        return builder.setTipo(TipoVehiculo.ECONOMICO) // TipoVehiculo en lugar de String
                      .setProveedor("Ford")
                      .setModelo("Focus")
                      .setColor("Blanco")
                      .setEstado(EstadoVehiculo.DISPONIBLE)
                      .build();
    }

    public Vehiculo construirSUVBasico() {
        return builder.setTipo(TipoVehiculo.SUV)
                      .setProveedor("Toyota")
                      .setModelo("RAV4")
                      .setColor("Negro")
                      .setEstado(EstadoVehiculo.DISPONIBLE)
                      .build();
    }

    public Vehiculo construirLujoBasico() {
        return builder.setTipo(TipoVehiculo.LUJO)
                      .setProveedor("BMW")
                      .setModelo("Serie 7")
                      .setColor("Blanco")
                      .setEstado(EstadoVehiculo.DISPONIBLE)
                      .build();
    }
}

