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

}
