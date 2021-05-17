package domain.recomendador;

import domain.ropa.Atuendo;
import domain.tiempo.RegistroTiempo;

public class Recomendador {

  public static Atuendo recomendarAtuendo() {
    Object temperatura = RegistroTiempo.getInstance().getTemperaturas();

    //TODO
    return null;
  }

}
