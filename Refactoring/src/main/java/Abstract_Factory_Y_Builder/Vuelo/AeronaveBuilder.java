package Abstract_Factory_Y_Builder.Vuelo;

public class AeronaveBuilder {
    private final Aeronave aeronave;

    public AeronaveBuilder(TipoAsiento tipo) {
        aeronave = new Aeronave();
        aeronave.setTipoAsiento(tipo); //asigna el tipo de asiento
    }

    public AeronaveBuilder setProveedor(String proveedor) {
        aeronave.setProveedor(proveedor);
        return this;
    }

    public AeronaveBuilder setServicioComida(boolean servicioComida) {
        aeronave.setServicioComida(servicioComida);
        return this;
    }

    public Aeronave build() {
        return aeronave;
    }
}


