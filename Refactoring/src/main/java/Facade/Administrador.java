package Facade;

import java.util.HashMap;
import java.util.Map;

public class Administrador {
    String nombre;
    private Map<String, Politica> politicas = new HashMap<>();
    
    public Administrador(String nombre){
        this.nombre = nombre;
    }

    public void agregarPolitica(String clave, Politica p) {
        politicas.put(clave, p);
    }

    public boolean validarCancelacion(String clave, Reserva reserva) {
        Politica p = politicas.get(clave);
        if (p == null) return false;
        return p.aplicar(reserva);
    }

    // Devuelve todas las políticas
    public Map<String, Politica> getPoliticas() {
        return politicas;
    }

    // Devuelve una política específica
    public Politica getPolitica(String clave) {
        return politicas.get(clave);
    }
}