package ProduccionRopa;

import java.time.LocalDate;

public class Lote {

    private int numero;
    private int numPiezas;
    private LocalDate fechaFabricacion;
    private Prenda prenda;

    public Lote(int numero, int numPiezas, LocalDate fechaFabricacion, Prenda prenda) {
        this.numero = numero;
        this.numPiezas = numPiezas;
        this.fechaFabricacion = fechaFabricacion;
        this.prenda = prenda;
    }

    public double calcularCostoProduccionLote()
    {
        return numPiezas * prenda.getCostoProduccion();
    }

    public double calcularMontoRecuperacionVentaIndividual() {
        return numPiezas * prenda.calcularPrecioVentaPorPieza();
    }

    public double calcularMontoRecuperacionVentaPorLote() {
        return numPiezas * prenda.calcularPrecioVentaPorPiezaEnLote();
    }

    public int getNumero() {
        return numero;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public Prenda getPrenda() {
        return prenda;
    }

    @Override
    public String toString() {
        return "Lote{" +
                "numero=" + numero +
                ", numPiezas=" + numPiezas +
                ", fechaFabricacion=" + fechaFabricacion +
                ", prenda=" + prenda +
                '}';
    }
}
