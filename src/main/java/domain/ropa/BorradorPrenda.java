package domain.ropa;

import java.awt.*;

// considero que si en el creador de prenda uno no termina de settear los distintos atributos,
// queda guardada la instancia en la que esta trabajando como un borrador.

public class BorradorPrenda {

  private TipoDePrenda tipoDePrenda;
  private Material material;
  private Color colorPrincipal;
  private Color colorSecundario;

  public BorradorPrenda(TipoDePrenda tipoDePrenda) {
    this.tipoDePrenda = tipoDePrenda;
  }

  public void setMaterial(Material material) {
      this.material = material;
  }

  public void setColorPrincipal(Color colorPrincipal) {
      this.colorPrincipal = colorPrincipal;
  }

  public void setColorSecundario(Color colorSecundario) {
      this.colorSecundario = colorSecundario;
  }

  public Prenda generarPrenda() {
    if (this.colorSecundario == null) {
      return new Prenda(this.tipoDePrenda, this.material, this.colorPrincipal);
    } else {
      return new Prenda(this.tipoDePrenda, this.material, this.colorPrincipal, this.colorSecundario);
    }
  }

}
