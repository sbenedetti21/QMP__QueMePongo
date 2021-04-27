package domain.ropa;

// TODO
// Podria ser un enum el tipo de prenda, por ahora prefiero patearlo a ver que otro requerimiento me llega

public class TipoDePrenda {

  private Categoria categoria;
  private Trama trama = Trama.LISA;

  public TipoDePrenda(Categoria categoria, Trama trama) {
    this.categoria = categoria;
    this.trama = trama;
  }

  public Categoria categoria() {
    return categoria;
  }

  private TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
  private TipoDePrenda REMERA = new TipoDePrenda(Categoria.SUPERIOR);
  private TipoDePrenda PANTALON = new TipoDePrenda(Categoria.INFERIOR);

}
