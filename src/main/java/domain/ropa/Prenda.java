package domain.ropa;

import java.awt.*;
import static java.util.Objects.requireNonNull;

public class Prenda {

  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;
  private double temperaturaMaxima;

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, double temperaturaMaxima) {
    this.tipoDePrenda = requireNonNull(tipoDePrenda, "Tipo de prenda NULL");
    this.material = requireNonNull(material, "Material NULL");
    this.colorPrincipal = requireNonNull(colorPrincipal, "Color Principal NULL");
    this.temperaturaMaxima = requireNonNull(temperaturaMaxima, "TemperaturaMaxima NULL");
  }

  public Prenda(TipoDePrenda tipoDePrenda, Material material, Color colorPrincipal, double temperaturaMaxima, Color colorSecundario) {
    this(tipoDePrenda, material, colorPrincipal, temperaturaMaxima);
    this.colorSecundario = requireNonNull(colorSecundario, "Color Secundario NULL");
  }

  public Categoria identificarCategoria() {
    return tipoDePrenda.categoria();
  }

  public double getTemperaturaMaxima() {
    return temperaturaMaxima;
  }
}
