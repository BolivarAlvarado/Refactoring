package Decorator;

public class ServicioAdicionalDecorator implements ReservaInterface {
    private ReservaInterface reservaDecorada;
    private String descripcionServicio;
    private double precioServicio;

    public ServicioAdicionalDecorator(ReservaInterface reserva, String descripcion, double precio) {
        this.reservaDecorada = reserva;
        this.descripcionServicio = descripcion;
        this.precioServicio = precio;
    }

    @Override
    public double getPrecioTotal() {
        return reservaDecorada.getPrecioTotal() + precioServicio;
    }

    @Override
    public String getDescripcion() {
        return reservaDecorada.getDescripcion() + " + " + descripcionServicio;
    }

    @Override
    public void confirmarReserva() {
        reservaDecorada.confirmarReserva();
    }

    @Override
    public void cancelarReserva() {
        reservaDecorada.cancelarReserva();
    }
}

