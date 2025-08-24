package Abstract_Factory_Y_Builder.Vehiculo;
//Replace Subclass with Fields
public class Vehiculo {
    private String idVehiculo;
    private TipoVehiculo tipo;        
    private String proveedor;
    private String modelo;
    private String color;
    private EstadoVehiculo estado;
    private double precio;

    Vehiculo() {}

    public void mostrarInfo() {
        System.out.println("=== Vehículo " + tipo + " ===");
        System.out.println("ID: " + idVehiculo);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Estado: " + estado);
        System.out.println("Precio: " + precio);
        System.out.println("==========================\n");
    }

    // Getters
    public String getIdVehiculo() { return idVehiculo; }
    public TipoVehiculo getTipo() { return tipo; }
    public String getProveedor() { return proveedor; }
    public String getModelo() { return modelo; }
    public String getColor() { return color; }
    public EstadoVehiculo getEstado() { return estado; }
    public double getPrecio() { return precio; }

    // Setters
    void setIdVehiculo(String idVehiculo) { this.idVehiculo = idVehiculo; }
    void setTipo(TipoVehiculo tipo) { this.tipo = tipo; }
    void setProveedor(String proveedor) { this.proveedor = proveedor; }
    void setModelo(String modelo) { this.modelo = modelo; }
    void setColor(String color) { this.color = color; }
    void setEstado(EstadoVehiculo estado) { this.estado = estado; }
    void setPrecio(double precio) { this.precio = precio; }
    
    public void confirmar(){}
    public void cancelar(){}
}

