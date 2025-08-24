package Abstract_Factory_Y_Builder.Vuelo;

public class Aeronave {
    // SE ENCAPSULAN LOS CAMPOS QUE ANTES ESTABAN PUBLICOS EN ESTA CLASE
    private AeronaveInicial configuracion;

    public Aeronave(AeronaveInicial configuracion) {
        this.configuracion = configuracion;
    }

    public void mostrarConfiguracion() {
        System.out.println("Aeronave de: " + configuracion.getProveedor() +
                           ", Asientos: " + configuracion.getTipoAsiento() +
                           ", Servicio Comida: " + (configuracion.isServicioComida() ? "Sí" : "No") +
                           ", Tipo Equipaje: " + configuracion.getTipoEquipaje());
    }

    public AeronaveInicial getConfiguracion() { return configuracion; }
}




