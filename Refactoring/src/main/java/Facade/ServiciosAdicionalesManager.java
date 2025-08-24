package Facade;

import java.util.ArrayList;
import java.util.List;
import Decorator.*;

public class ServiciosAdicionalesManager {
    private List<ReservaDecorator> serviciosAdicionales = new ArrayList<>();

    public void agregarServicio(ReservaDecorator servicio) {
        serviciosAdicionales.add(servicio);
    }

    public void eliminarServicio(ReservaDecorator servicio) {
        serviciosAdicionales.remove(servicio);
    }

    public double getPrecioTotalServicios() {
        double total = 0;
        for (ReservaDecorator s : serviciosAdicionales) total += s.getPrecioTotal();
        return total;
    }

    public String getDescripcionServicios() {
        String desc = "";
        for (ReservaDecorator s : serviciosAdicionales) desc += s.getDescripcion() + " ";
        return desc.trim();
    }

    public void confirmarServicios() {
        for (ReservaDecorator s : serviciosAdicionales) s.confirmarReserva();
    }

    public void cancelarServicios() {
        for (ReservaDecorator s : serviciosAdicionales) s.cancelarReserva();
    }
}
