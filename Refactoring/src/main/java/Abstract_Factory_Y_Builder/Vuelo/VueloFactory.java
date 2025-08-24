package Abstract_Factory_Y_Builder.Vuelo;
//Replace Subclass with Fields
public class VueloFactory {
    public static Vuelo crearVuelo(TipoAsiento tipo, String proveedor, boolean servicioComida, String horario) {
        Aeronave aeronave = new AeronaveBuilder(tipo, servicioComida, proveedor)
                                .build();

        // Construye el vuelo con la aeronave
        return new Vuelo(horario, aeronave);
    }
}
