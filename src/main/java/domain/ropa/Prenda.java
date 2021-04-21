package domain.ropa;

public class Prenda {

  private TipoDePrenda tipoDePrenda;
  private String material;
  private String colorPrincipal;
  private String colorSecundario;

  public Prenda(TipoDePrenda tipoDePrenda, String material, String colorPrincipal) {
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
  }

  public Categoria identificarCategoria() {
    return tipoDePrenda.categoria();
  }

  // Esta es la manera que se me ocurrio de añadir un color secundario, aunque podría traer problemas ya que
  // si no se utilizase, colorSecundario quedaría en null
  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

}
