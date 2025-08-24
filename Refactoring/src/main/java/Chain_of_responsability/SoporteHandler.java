package Chain_of_responsability;

public abstract class SoporteHandler {
    protected SoporteHandler siguiente;
    protected String tipoIncidencia;

    public SoporteHandler(String tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public void setSiguiente(SoporteHandler s) { this.siguiente = s; }

    public boolean puedeResolver(Incidencia incidencia) {
        return tipoIncidencia.equalsIgnoreCase(incidencia.getTipo());
    }

    public void manejar(Incidencia incidencia) {
        if (puedeResolver(incidencia)) {
            System.out.println(this.getClass().getSimpleName() + " resolvió la incidencia: " + incidencia.getDescripcion());
        } else if (siguiente != null) {
            System.out.println(this.getClass().getSimpleName() + " no puede resolver, pasando a siguiente.");
            siguiente.manejar(incidencia);
        } else {
            System.out.println("Incidencia no resuelta: " + incidencia.getDescripcion());
        }
    }
}
