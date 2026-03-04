package ProduccionRopa;

import java.util.ArrayList;
import java.util.List;

public class Prenda {

    private String genero;
    private String modelo;
    private String tela;
    private double costoProduccion;
    private String temporada;
    private List<Lote> lotes;

    private static final double PORCENTAJE_GANANCIA_POR_PIEZA = 0.15;
    private static final double PORCENTAJE_GANANCIA_POR_LOTE = 0.05;

    public Prenda(String genero, String modelo, String tela, double costoProduccion, String temporada) {
        this.genero = genero;
        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccion = costoProduccion;
        this.temporada = temporada;
        this.lotes = new ArrayList<>();
    }

    public void agregarLote(Lote lote) {
        lotes.add(lote);
    }


    public double calcularPrecioVentaPorPieza() {
        return costoProduccion * (1 + PORCENTAJE_GANANCIA_POR_PIEZA);
    }

    public double calcularPrecioVentaPorPiezaEnLote() {
        return costoProduccion * (1 + PORCENTAJE_GANANCIA_POR_LOTE);
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public String getGenero()
    {
        return genero;
    }

    public String getModelo()
    {
        return modelo;
    }

    public String getTela()
    {
        return tela;
    }

    public double getCostoProduccion() {
        return costoProduccion;
    }

    public String getTemporada()
    {
        return temporada;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "genero='" + genero + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tela='" + tela + '\'' +
                ", costoProduccion=" + costoProduccion +
                ", temporada='" + temporada + '\'' +
                '}';
    }
}
