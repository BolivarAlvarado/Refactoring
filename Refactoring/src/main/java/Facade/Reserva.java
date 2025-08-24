package Facade;

import Observer.*;
import Decorator.*;
import java.util.ArrayList;
import java.util.List;
import Abstract_Factory_Y_Builder.Vehiculo.*;
import Abstract_Factory_Y_Builder.Vuelo.*;

import java.util.*;

public class Reserva implements ReservaInterface {
    private String idReserva;
    private Usuario usuario;
    private double precioBase;
    private String descripcion;

    // Subcomponentes del sistema
    private Vuelo vuelo;
    private Vehiculo vehiculo;
    private List<ReservaDecorator> serviciosAdicionales = new ArrayList<>();

    // Observadores
    private List<ObservadorReserva> observadores = new ArrayList<>();

    // Políticas
    private List<Politica> politicas = new ArrayList<>();

    public Reserva() {}

    public Reserva(String idReserva, Usuario usuario, double precioBase, String descripcion,
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
        for (ReservaDecorator s : serviciosAdicionales) {
            total = s.getPrecioTotal();
        }
        return total;
    }

    @Override
    public String getDescripcion() {
        String desc = descripcion;
        if (vuelo != null) desc += " | Vuelo: " + vuelo.getIdVuelo();
        if (vehiculo != null) desc += " | Vehiculo: " + vehiculo.getTipoVehiculo();
        for (ReservaDecorator s : serviciosAdicionales) {
            desc = s.getDescripcion();
        }
        return desc;
    }

    @Override
    public void confirmarReserva() {
        if (vuelo != null) vuelo.confirmar();
        if (vehiculo != null) vehiculo.confirmar();
        for (ReservaDecorator s : serviciosAdicionales) s.confirmarReserva();
        notifyObservadores("Reserva confirmada");
    }

    @Override
    public void cancelarReserva() {
        if (vuelo != null) vuelo.cancelar();
        if (vehiculo != null) vehiculo.cancelar();
        for (ReservaDecorator s : serviciosAdicionales) s.cancelarReserva();
        notifyObservadores("Reserva cancelada");
    }

    // Servicios adicionales
    public void agregarServicio(ReservaDecorator servicio) {
        serviciosAdicionales.add(servicio);
    }

    public void eliminarServicio(ReservaDecorator servicio) {
        serviciosAdicionales.remove(servicio);
    }

    // Observadores
    public void agregarObservador(ObservadorReserva o) {
        observadores.add(o);
    }

    public void eliminarObservador(ObservadorReserva o) {
        observadores.remove(o);
    }

    private void notifyObservadores(String mensaje) {
        for (ObservadorReserva o : observadores) {
            o.actualizar(this, mensaje);
        }
    }

    // Políticas
    public void agregarPolitica(Politica p) {
        politicas.add(p);
    }

    public boolean validarPoliticas() {
        for (Politica p : politicas) {
            if (!p.aplicar(this)) return false;
        }
        return true;
    }

    // Getters
    public String getIdReserva() { return idReserva; }
    public Usuario getUsuario() { return usuario; }
    public double getPrecioBase() { return precioBase; }
    public Vuelo getVuelo() { return vuelo; }
    public Vehiculo getVehiculo() { return vehiculo; }
}
