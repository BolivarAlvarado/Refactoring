package Observer;

import Facade.Reserva;
import Facade.Usuario;

public class NotificadorEmail implements ObservadorReserva {
    private Usuario usuario;
    private String email;

    public NotificadorEmail(Usuario usuario, String email) {
        this.usuario = usuario;
        this.email = email;
    }

    @Override
    public void actualizar(Reserva reserva, String mensaje) {
        System.out.println("Enviando email a " + email + ": " + mensaje +
                " (reserva " + reserva.getIdReserva() + ")");
    }
    
    @Override
    public boolean enviar(String mensaje) {
        if (usuario.getEmail() == null || usuario.getEmail().isBlank()) return false;
        System.out.println("Enviando email a " + usuario.getEmail() + ": " + mensaje);
        return true;
    }
}

