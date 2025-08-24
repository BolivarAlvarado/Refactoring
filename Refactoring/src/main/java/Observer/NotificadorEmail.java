package Observer;

import Facade.Reserva;

public class NotificadorEmail implements ObservadorReserva {
    private String email;

    public NotificadorEmail(String email) {
        this.email = email;
    }

    @Override
    public void actualizar(Reserva reserva, String mensaje) {
        System.out.println("Enviando email a " + email + ": " + mensaje +
                " (reserva " + reserva.getIdReserva() + ")");
    }
}

