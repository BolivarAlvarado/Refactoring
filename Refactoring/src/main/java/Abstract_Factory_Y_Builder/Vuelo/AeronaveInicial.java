package Abstract_Factory_Y_Builder.Vuelo;

public class AeronaveInicial {
    //Campos privados para acceder mediantes los getters
    private TipoAsiento tipoAsiento;
    private boolean servicioComida;
    private String proveedor;
    private String tipoEquipaje; // nuevo atributo agregado de ejemplo

    public AeronaveInicial(TipoAsiento tipoAsiento, boolean servicioComida, String proveedor) {
        this.tipoAsiento = tipoAsiento;
        this.servicioComida = servicioComida;
        this.proveedor = proveedor;
    }

    // Getters y setters
    public TipoAsiento getTipoAsiento() { return tipoAsiento; }
    public void setTipoAsiento(TipoAsiento tipoAsiento) { this.tipoAsiento = tipoAsiento; }

    public boolean isServicioComida() { return servicioComida; }
    public void setServicioComida(boolean servicioComida) { this.servicioComida = servicioComida; }

    public String getProveedor() { return proveedor; }
    public void setProveedor(String proveedor) { this.proveedor = proveedor; }

    public String getTipoEquipaje() { return tipoEquipaje; }
    public void setTipoEquipaje(String tipoEquipaje) { this.tipoEquipaje = tipoEquipaje; }
}
