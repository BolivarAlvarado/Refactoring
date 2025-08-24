package Abstract_Factory_Y_Builder.Vuelo;

public class DirectorVuelo {
    public Aeronave construirVuelo(AeronaveBuilder builder) {
        return builder.build();
    }
}
