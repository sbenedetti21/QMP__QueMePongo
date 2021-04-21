package domain.ropa;

public class TipoDePrenda {

  private Categoria categoria;

  public TipoDePrenda(Categoria categoria) {
    this.categoria = categoria;
  }

  public Categoria categoria() {
    return categoria;
  }

}
