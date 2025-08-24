package Abstract_Factory_Y_Builder.Vuelo;

import java.time.LocalDateTime;

public class Vuelo {
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

    public Vuelo(String horario, Aeronave aeronave) {
        this.horario = horario;
        this.aeronave = aeronave;
    }

    public void mostrarDetalles() {
        System.out.println("Vuelo - Horario: " + horario);
        System.out.println("ID: " + idVuelo);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Salida: " + fechaSalida);
        System.out.println("Llegada: " + fechaLlegada);
        System.out.println("Precio base: " + precioBase);
        System.out.println("Asientos disponibles: " + asientosDisponibles);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Estado: " + estado);
        aeronave.mostrarConfiguracion();
    }

    // Getters y setters
    public String getIdVuelo() { return idVuelo; }
    public void setIdVuelo(String idVuelo) { this.idVuelo = idVuelo; }

    public String getOrigen() { return origen; }
    public void setOrigen(String origen) { this.origen = origen; }

    public String getDestino() { return destino; }
    public void setDestino(String destino) { this.destino = destino; }

    public LocalDateTime getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(LocalDateTime fechaSalida) { this.fechaSalida = fechaSalida; }

    public LocalDateTime getFechaLlegada() { return fechaLlegada; }
    public void setFechaLlegada(LocalDateTime fechaLlegada) { this.fechaLlegada = fechaLlegada; }

    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }

    public int getAsientosDisponibles() { return asientosDisponibles; }
    public void setAsientosDisponibles(int asientosDisponibles) { this.asientosDisponibles = asientosDisponibles; }

    public int getCapacidad() { return capacidad; }
    public void setCapacidad(int capacidad) { this.capacidad = capacidad; }

    public EstadoVuelo getEstado() { return estado; }
    public void setEstado(EstadoVuelo estado) { this.estado = estado; }

    public String getHorario() { return horario; }
    public Aeronave getAeronave() { return aeronave; }
}
