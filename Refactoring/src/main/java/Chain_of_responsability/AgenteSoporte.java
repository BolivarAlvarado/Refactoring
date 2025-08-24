package Chain_of_responsability;

public class AgenteSoporte extends SoporteHandler {
    private String nombre;

    public AgenteSoporte(String nombre) {
        super("simple");
        this.nombre = nombre;
    }
}