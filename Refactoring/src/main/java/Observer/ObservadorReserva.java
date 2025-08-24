package Observer;
import Facade.Reserva;

public interface ObservadorReserva {
    void actualizar(Reserva reserva, String mensaje);
    boolean enviar(String mensaje);
}

