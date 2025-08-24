package Facade;

import java.util.ArrayList;
import java.util.List;

public class PoliticasManager {
    private List<Politica> politicas = new ArrayList<>();

    public void agregarPolitica(Politica p) { politicas.add(p); }

    public boolean validarPoliticas(Reserva r) {
        for (Politica p : politicas) {
            if (!p.aplicar(r)) return false;
        }
        return true;
    }
}
