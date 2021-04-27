package domain.ropa;

import java.util.Objects;

// considero que si en el creador de prenda uno no termina de settear los distintos atributos,
// queda guardada la instancia en la que esta trabajando como un borrador.

public class CreadorDePrenda {

  private TipoDePrenda tipoDePrenda;
  private String material;
  private String colorPrincipal;
  private String colorSecundario;

  public void setTipoDePrenda(TipoDePrenda tipoDePrenda) {
    this.tipoDePrenda = tipoDePrenda;
  }

  public void setMaterial(String material) {
    if (this.tipoEstaSeteado()) {
      this.material = material;
    } else {
      throw new TipodePrendaNoIngresado("No hay tipo de prenda");
    }
  }

  public void setColorPrincipal(String colorPrincipal) {
    if (this.tipoEstaSeteado()) {
      this.colorPrincipal = colorPrincipal;
    } else {
      throw new TipodePrendaNoIngresado("No hay tipo de prenda");
    }
  }

  public void setColorSecundario(String colorSecundario) {
    if (this.tipoEstaSeteado()) {
      this.colorSecundario = colorSecundario;
    } else {
      throw new TipodePrendaNoIngresado("No hay tipo de prenda");
    }
  }

  public Prenda generarPrenda() {
    if (colorSecundario == null) {
      return new Prenda(tipoDePrenda, material, colorPrincipal);
    } else {
      return new Prenda(tipoDePrenda, material, colorPrincipal, colorSecundario);
    }
  }

  private boolean tipoEstaSeteado() {
    return !(this.tipoDePrenda == null);
  }

  private class TipodePrendaNoIngresado extends RuntimeException {
    public TipodePrendaNoIngresado(String message) {
      super(message);
    }
  }

}
