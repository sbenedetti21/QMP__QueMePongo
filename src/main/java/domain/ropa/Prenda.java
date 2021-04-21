package domain.ropa;

public class Prenda {

  private String tipoDePrenda;
  private Categoria categoria;
  private String material;
  private String colorPrincipal;
  private String colorSecundario;

  public Prenda(String tipoDePrenda, Categoria categoria, String material, String colorPrincipal) {
    this.tipoDePrenda = tipoDePrenda;
    this.categoria = categoria;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
  }


  // Esta es la manera que se me ocurrio de añadir un color secundario, aunque podría traer problemas ya que
  // si no se utilizase, colorSecundario quedaría en null
  public void setColorSecundario(String colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

}
