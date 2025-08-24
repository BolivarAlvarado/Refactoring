package Abstract_Factory_Y_Builder.Vuelo;
//Replace Subclass with Fields
import java.time.LocalDateTime;

public class VueloBuilder implements IVueloBuilder {
    private String idVuelo;
    private String origen;
    private String destino;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private double precioBase;
    private int asientosDisponibles;
    private int capacidad;
    private EstadoVuelo estado;
    private String horario;
    private Aeronave aeronave;

    @Override
    public IVueloBuilder setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
        return this;
    }

    @Override
    public IVueloBuilder setOrigen(String origen) {
        this.origen = origen;
        return this;
    }

    @Override
    public IVueloBuilder setDestino(String destino) {
        this.destino = destino;
        return this;
    }

    @Override
    public IVueloBuilder setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
        return this;
    }

    @Override
    public IVueloBuilder setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
        return this;
    }

    @Override
    public IVueloBuilder setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
        return this;
    }

    @Override
    public IVueloBuilder setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
        return this;
    }

    @Override
    public IVueloBuilder setCapacidad(int capacidad) {
        this.capacidad = capacidad;
        return this;
    }

    @Override
    public IVueloBuilder setEstado(EstadoVuelo estado) {
        this.estado = estado;
        return this;
    }

    @Override
    public IVueloBuilder setHorario(String horario) {
        this.horario = horario;
        return this;
    }

    @Override
    public IVueloBuilder setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
        return this;
    }

    @Override
    public Vuelo build() {
        Vuelo vuelo = new Vuelo(horario, aeronave);
        vuelo.setIdVuelo(idVuelo);
        vuelo.setOrigen(origen);
        vuelo.setDestino(destino);
        vuelo.setFechaSalida(fechaSalida);
        vuelo.setFechaLlegada(fechaLlegada);
        vuelo.setPrecioBase(precioBase);
        vuelo.setAsientosDisponibles(asientosDisponibles);
        vuelo.setCapacidad(capacidad);
        vuelo.setEstado(estado);
        return vuelo;
    }
}
