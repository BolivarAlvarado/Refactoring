package Facade;

import Observer.ObservadorReserva;
import java.util.ArrayList;
import java.util.List;

public class ObservadoresManager {
    private List<ObservadorReserva> observadores = new ArrayList<>();

    public void agregarObservador(ObservadorReserva o) { observadores.add(o); }
    public void eliminarObservador(ObservadorReserva o) { observadores.remove(o); }

    public void notifyObservadores(Reserva r, String mensaje) {
        for (ObservadorReserva o : observadores) {
            o.actualizar(r, mensaje);
        }
    }
}

