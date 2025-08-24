package Abstract_Factory_Y_Builder.Vehiculo;

public abstract class Vehiculo {
    protected String idVehiculo;
    protected String tipo;
    protected String proveedor;
    protected String modelo;
    protected String color;
    protected EstadoVehiculo estado;
    protected double precio;
    
    public abstract void mostrarInfo();
    
    public double getPrecio(){
        return precio;
    }
    
    public void confirmar(){}
    
    public void cancelar(){}
    
    public String getTipoVehiculo(){
        return tipo;
    }
    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }
}
