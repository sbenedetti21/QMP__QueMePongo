package domain.ropa;

// TODO
// Podria ser un enum el tipo de prenda, por ahora prefiero patearlo a ver que otro requerimiento me llega

public class TipoDePrenda {

  private Categoria categoria;

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria categoria() {
    return categoria;
  }

  //TODO
  private TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
  private TipoDePrenda REMERA = new TipoDePrenda(Categoria.SUPERIOR);
  private TipoDePrenda PANTALON = new TipoDePrenda(Categoria.INFERIOR);

}
