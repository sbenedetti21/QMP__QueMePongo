package domain.ropa;

import java.util.Objects;

public class Prenda {

  private TipoDePrenda tipoDePrenda;
  private String material;
  private String colorPrincipal;
  private String colorSecundario;

  public Prenda(TipoDePrenda tipoDePrenda, String material, String colorPrincipal) {
    this.tipoDePrenda = Objects.requireNonNull(tipoDePrenda, "Tipo de prenda NULL");
    this.material = Objects.requireNonNull(material, "Material NULL");
    this.colorPrincipal = Objects.requireNonNull(colorPrincipal, "Color Principal NULL");
  }

  public Prenda(TipoDePrenda tipoDePrenda, String material, String colorPrincipal, String colorSecundario) {
    this(tipoDePrenda, material, colorPrincipal);
    this.colorSecundario = Objects.requireNonNull(colorSecundario, "Color Secundario NULL");
  }

  public Categoria identificarCategoria() {
    return tipoDePrenda.categoria();
  }

}