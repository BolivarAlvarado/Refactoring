package Abstract_Factory_Y_Builder.Vuelo;

public class Aeronave {
    private String proveedor;
    private TipoAsiento tipoAsiento;
    private boolean servicioComida;

    // Setters 
    void setProveedor(String proveedor) { this.proveedor = proveedor; }
    void setTipoAsiento(TipoAsiento tipoAsiento) { this.tipoAsiento = tipoAsiento; }
    void setServicioComida(boolean servicioComida) { this.servicioComida = servicioComida; }

    public void mostrarConfiguracion() {
        System.out.println("Aeronave de: " + proveedor +
                           ", Asientos: " + tipoAsiento +
                           ", Servicio Comida: " + (servicioComida ? "Sí" : "No"));
    }
}




