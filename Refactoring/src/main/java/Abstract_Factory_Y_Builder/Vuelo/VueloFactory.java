package Abstract_Factory_Y_Builder.Vuelo;

public class VueloFactory {
    public static Vuelo crearVuelo(TipoAsiento tipo, String proveedor, boolean servicioComida, String horario) {
        AeronaveBuilder builder = new AeronaveBuilder(tipo);
        DirectorVuelo director = new DirectorVuelo();
        Aeronave aeronave = director.construirVuelo(builder, proveedor, servicioComida);
        return new Vuelo(horario, aeronave);
    }
}
