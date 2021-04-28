package domain.ropa;

public class Material {

  private Trama trama;

  public Material(Trama trama) {
    this.trama = trama;
  }

  public Material() {
    this.trama = Trama.LISA;
  }

}
