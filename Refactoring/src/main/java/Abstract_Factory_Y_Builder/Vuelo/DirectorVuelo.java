package Abstract_Factory_Y_Builder.Vuelo;

public class DirectorVuelo {
    public Aeronave construirVuelo(AeronaveBuilder builder, String proveedor, boolean servicioComida) {
        builder.setProveedor(proveedor)
               .setServicioComida(servicioComida);
        return builder.build();
    }
}