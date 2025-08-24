package Abstract_Factory_Y_Builder.Vuelo;
//Replace Subclass with Fields
public class AeronaveBuilder {
    private AeronaveInicial configuracion;

    public AeronaveBuilder(TipoAsiento tipoAsiento, boolean servicioComida, String proveedor) {
        configuracion = new AeronaveInicial(tipoAsiento, servicioComida, proveedor);
    }

    public AeronaveBuilder setTipoEquipaje(String tipoEquipaje) {
        configuracion.setTipoEquipaje(tipoEquipaje);
        return this;
    }

    public Aeronave build() {
        return new Aeronave(configuracion);
    }
}



