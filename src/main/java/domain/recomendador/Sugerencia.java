package domain.recomendador;

import domain.ropa.Atuendo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sugerencia {
  List<Atuendo> atuendos = new ArrayList<>();

  public Sugerencia(Atuendo ... atuendos) {
    Collections.addAll(this.atuendos, atuendos);
  }
}
