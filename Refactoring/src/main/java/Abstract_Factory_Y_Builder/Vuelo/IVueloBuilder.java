package Abstract_Factory_Y_Builder.Vuelo;

public interface IVueloBuilder {
    IVueloBuilder setIdVuelo(String idVuelo);
    IVueloBuilder setOrigen(String origen);
    IVueloBuilder setDestino(String destino);
    IVueloBuilder setFechaSalida(java.time.LocalDateTime fechaSalida);
    IVueloBuilder setFechaLlegada(java.time.LocalDateTime fechaLlegada);
    IVueloBuilder setPrecioBase(double precioBase);
    IVueloBuilder setAsientosDisponibles(int asientosDisponibles);
    IVueloBuilder setCapacidad(int capacidad);
    IVueloBuilder setEstado(EstadoVuelo estado);
    IVueloBuilder setHorario(String horario);
    IVueloBuilder setAeronave(Aeronave aeronave);

    Vuelo build();
}
