package Abstract_Factory_Y_Builder.Vuelo;

public class Aeronave {
    public String proveedor;
    public String tipoAsiento;
    public boolean servicioComida;

    public void setProveedor(String proveedor) { this.proveedor = proveedor; }
    public void setTipoAsiento(String tipoAsiento) { this.tipoAsiento = tipoAsiento; }
    public void setServicioComida(boolean servicioComida) { this.servicioComida = servicioComida; }

    public void mostrarConfiguracion() {
        System.out.println("Aeronave de: " + proveedor +
                           ", Asientos: " + tipoAsiento +
                           ", Servicio Comida: " + (servicioComida ? "Sí" : "No"));
    }
}
