package Facade;

import Observer.*;
import Decorator.*;
import Abstract_Factory_Y_Builder.Vehiculo.*;
import Abstract_Factory_Y_Builder.Vuelo.*;


public class Reserva implements ReservaInterface {
    private String idReserva;
    private Usuario usuario;
    private double precioBase;
    private String descripcion;

    private Vuelo vuelo;
    private Vehiculo vehiculo;

    // Clases para manejar las distintas funcionalides de la clase fachada
    private ObservadoresManager observadoresManager = new ObservadoresManager();
    private PoliticasManager politicasManager = new PoliticasManager();
    private ServiciosAdicionalesManager serviciosManager = new ServiciosAdicionalesManager();

    public Reserva() {}

    Reserva(String idReserva, Usuario usuario, double precioBase, String descripcion,
                   Vuelo vuelo, Vehiculo vehiculo) {
        this.idReserva = idReserva;
        this.usuario = usuario;
        this.precioBase = precioBase;
        this.descripcion = descripcion;
        this.vuelo = vuelo;
        this.vehiculo = vehiculo;
    }

    @Override
    public double getPrecioTotal() {
        double total = precioBase;
        if (vuelo != null) total += vuelo.getPrecioBase();
        if (vehiculo != null) total += vehiculo.getPrecio();
        total += serviciosManager.getPrecioTotalServicios();
        return total;
    }

    @Override
    public String getDescripcion() {
        String desc = descripcion;
        if (vuelo != null) desc += " | Vuelo: " + vuelo.getIdVuelo();
        if (vehiculo != null) desc += " | Vehiculo: " + vehiculo.getTipo();
        desc += " | " + serviciosManager.getDescripcionServicios();
        return desc;
    }

    @Override
    public void confirmarReserva() {
        if (vuelo != null) vuelo.confirmar();
        if (vehiculo != null) vehiculo.confirmar();
        serviciosManager.confirmarServicios();
        observadoresManager.notifyObservadores(this, "Reserva confirmada");
    }

    @Override
    public void cancelarReserva() {
        if (vuelo != null) vuelo.cancelar();
        if (vehiculo != null) vehiculo.cancelar();
        serviciosManager.cancelarServicios();
        observadoresManager.notifyObservadores(this, "Reserva cancelada");
    }

    // Delegación a managers
    public void agregarServicio(ReservaDecorator servicio) { serviciosManager.agregarServicio(servicio); }
    public void eliminarServicio(ReservaDecorator servicio) { serviciosManager.eliminarServicio(servicio); }

    public void agregarObservador(ObservadorReserva o) { observadoresManager.agregarObservador(o); }
    public void eliminarObservador(ObservadorReserva o) { observadoresManager.eliminarObservador(o); }

    public void agregarPolitica(Politica p) { politicasManager.agregarPolitica(p); }
    public boolean validarPoliticas() { return politicasManager.validarPoliticas(this); }

    // Getters
    public String getIdReserva() { return idReserva; }
    public Usuario getUsuario() { return usuario; }
    public double getPrecioBase() { return precioBase; }
    public Vuelo getVuelo() { return vuelo; }
    public Vehiculo getVehiculo() { return vehiculo; }
}
