package ProduccionRopa;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Lote {

    private int numero;
    private int numPiezas;
    private LocalDate fechaFabricacion;
    private Prenda prenda;

    private static final double PORCENTAJE_GANANCIA_POR_PIEZA = 0.15;
    private static final double PORCENTAJE_GANANCIA_POR_LOTE = 0.05;


    private static Comparator<Lote> comparator = new Comparator<Lote>(){
        public int compare(Lote o1, Lote o2){
            return o1.compareTo(o2);
        }
    };

    public Lote(int numero, int numPiezas, LocalDate fechaFabricacion)
    {
        this.numero = numero;
        this.numPiezas = numPiezas;
        this.fechaFabricacion = fechaFabricacion;
    }

    public void agregarPrenda(Prenda p)
    {
        this.prenda = p;
    }

    public double calcularCostoProduccionLote()
    {
        return numPiezas * prenda.getCostoProduccion();
    }

    public double calcularMontoRecuperacionVentaIndividual() {
        return calcularCostoProduccionLote() + (calcularCostoProduccionLote() * PORCENTAJE_GANANCIA_POR_PIEZA);
    }

    public double calcularMontoRecuperacionVentaPorLote() {
        return calcularCostoProduccionLote() + (calcularCostoProduccionLote() * PORCENTAJE_GANANCIA_POR_LOTE);
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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Lote lote)) return false;
        return numero == lote.numero && numPiezas == lote.numPiezas && Objects.equals(fechaFabricacion, lote.fechaFabricacion) && Objects.equals(prenda, lote.prenda);
    }

    @Override
    public int hashCode() {
        int result = numero;
        result = 31 * result + numPiezas;
        result = 31 * result + Objects.hashCode(fechaFabricacion);
        result = 31 * result + Objects.hashCode(prenda);
        return result;
    }

    public int compareTo(Lote o)
    {
        int r=0;
        if ((r=this.numero - o.numero)!=0)
            return r;
        if ((r=this.numPiezas - o.numPiezas)!=0)
            return r;
        if ((r=this.fechaFabricacion.compareTo(o.fechaFabricacion))!=0)
            return r;
        return this.prenda.compareTo(o.prenda);
    }
}
