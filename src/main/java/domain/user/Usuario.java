package domain.user;

import domain.guardarropas.Guardarropas;
import domain.recomendador.Recomendador;
import domain.recomendador.Sugerencia;

import java.util.List;

public class Usuario {

  private List<Guardarropas> guardarropas;
  private Sugerencia sugerenciaDiaria;

  public Sugerencia getSugerenciaDiaria() {
    return sugerenciaDiaria;
  }

  public Sugerencia calcularSugerencia() {
    return new Sugerencia(Recomendador.recomendarAtuendo());
  }

  public void actualizarSugerenciaDiaria() {
    this.sugerenciaDiaria = calcularSugerencia();
  }

}
