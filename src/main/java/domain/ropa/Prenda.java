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

  public Prenda(TipoDePrenda tipoDePrenda, String material, String colorPrincipal, String colorSecundario) {
    this(tipoDePrenda, material, colorPrincipal);
    this.colorSecundario = colorSecundario;
  }

  public Categoria identificarCategoria() {
    return tipoDePrenda.categoria();
  }

}