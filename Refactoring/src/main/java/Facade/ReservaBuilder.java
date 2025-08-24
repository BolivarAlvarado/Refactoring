package Facade;

import Abstract_Factory_Y_Builder.Vehiculo.*;
import Abstract_Factory_Y_Builder.Vuelo.*;

public class ReservaBuilder {
    private String idReserva;
    private Usuario usuario;
    private double precioBase;
    private String descripcion;
    private Vuelo vuelo;
    private Vehiculo vehiculo;

    public ReservaBuilder setIdReserva(String idReserva) { this.idReserva = idReserva; return this; }
    public ReservaBuilder setUsuario(Usuario usuario) { this.usuario = usuario; return this; }
    public ReservaBuilder setPrecioBase(double precioBase) { this.precioBase = precioBase; return this; }
    public ReservaBuilder setDescripcion(String descripcion) { this.descripcion = descripcion; return this; }
    public ReservaBuilder setVuelo(Vuelo vuelo) { this.vuelo = vuelo; return this; }
    public ReservaBuilder setVehiculo(Vehiculo vehiculo) { this.vehiculo = vehiculo; return this; }

    public Reserva build() {
        return new Reserva(idReserva, usuario, precioBase, descripcion, vuelo, vehiculo);
    }
}
