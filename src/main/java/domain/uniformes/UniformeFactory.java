package domain.uniformes;

import domain.ropa.Prenda;
import domain.uniformes.Uniforme;

public abstract class UniformeFactory {

  public Uniforme fabricarUniforme() {
    return new Uniforme(
        this.fabricarParteSuperior(),
        this.fabricarParteInferior(),
        this.fabricarCalzado()
    );
  }

  public abstract Prenda fabricarParteSuperior();
  public abstract Prenda fabricarParteInferior();
  public abstract Prenda fabricarCalzado();

}
