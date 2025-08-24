package Chain_of_responsability;

public class Incidencia {
    private String descripcion;
    private String tipo;

    public Incidencia(String descripcion, String tipo) {
        if (tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("El tipo no puede estar vacío");
        }
        if (!tipo.equalsIgnoreCase("simple") && !tipo.equalsIgnoreCase("aerolinea")) {
            throw new IllegalArgumentException("Tipo de incidencia inválido: " + tipo);
        }
        this.descripcion = descripcion;
        this.tipo = tipo.toLowerCase();
    }

    public String getDescripcion() { 
        return descripcion; 
    }

    public String getTipo() { 
        return tipo; 
    }
}

