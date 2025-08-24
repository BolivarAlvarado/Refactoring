package Facade;

import java.util.Objects;

public class PoliticaCancelacion implements Politica {
    private int diasAntesParaCancelar;
    private double porcentajePenalidad;

    public PoliticaCancelacion(int diasAntesParaCancelar, double porcentajePenalidad) {
        this.diasAntesParaCancelar = diasAntesParaCancelar;
        this.porcentajePenalidad = porcentajePenalidad;
    }
    
    public double calcularReembolso(double precio, int diasAntelacion) {
        if (diasAntelacion >= 10) return precio; // 100% reembolso
        if (diasAntelacion >= 5) return precio * 0.5; // 50%
        return 0; // No reembolso
    }

    @Override
    public boolean aplicar(Reserva reserva) {
        return true;
    }

    @Override
    public String getDescripcion() {
        return "Política de cancelación: " + diasAntesParaCancelar + " días, penalidad " + porcentajePenalidad;
    }
    
}