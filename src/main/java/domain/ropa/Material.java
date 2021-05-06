package domain.ropa;

public class Material {

  private Trama trama;
  private TipoDeMaterial material;

  public Material(Trama trama, TipoDeMaterial material) {
    this.material = material;
    this.trama = trama;
  }

  public Material(TipoDeMaterial material) {
    this.material = material;
    this.trama = Trama.LISA;
  }

}
