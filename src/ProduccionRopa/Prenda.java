package ProduccionRopa;

import java.util.Comparator;
import java.util.Objects;

public class Prenda implements Comparable <Prenda>{

    private String genero;
    private String modelo;
    private String tela;
    private double costoProduccion;
    private String temporada;

    private static Comparator<Prenda> comparator = new Comparator<Prenda>(){
        public int compare(Prenda o1, Prenda o2){
            return o1.compareTo(o2);
        }
    };

    public Prenda(String genero, String modelo, String tela, double costoProduccion, String temporada) {
        this.genero = genero;
        this.modelo = modelo;
        this.tela = tela;
        this.costoProduccion = costoProduccion;
        this.temporada = temporada;
    }

    public String getGenero() {return genero;}

    public String getModelo() {return modelo;}

    public String getTela() {return tela;}

    public double getCostoProduccion() {return costoProduccion;}

    public String getTemporada() {return temporada;}

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

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Prenda prenda)) return false;
        return Double.compare(costoProduccion, prenda.costoProduccion) == 0 && Objects.equals(genero, prenda.genero) && Objects.equals(modelo, prenda.modelo) && Objects.equals(tela, prenda.tela) && Objects.equals(temporada, prenda.temporada);
    }

    @Override
    public int hashCode() {
       int result = Double.hashCode(costoProduccion);
        result = 31 * result + Objects.hashCode(genero);
        result = 31 * result + Objects.hashCode(modelo);
        result = 31 * result + Objects.hashCode(tela);
        result = 31 * result + Objects.hashCode(temporada);
        return result;
    }

    @Override
    public int compareTo(Prenda o) {
        int r = 0;
        if((r = Double.compare(this.costoProduccion, o.costoProduccion))!=0)
            return r;
        if((r=this.modelo.compareTo(o.modelo))!=0)
            return r;
        if((r=this.tela.compareTo(o.tela))!=0)
            return r;
        if((r=this.temporada.compareTo(o.temporada))!=0)
            return r;
        return this.genero.compareTo(o.genero);
    }
}

