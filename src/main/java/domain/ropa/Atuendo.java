package domain.ropa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Atuendo {
  private List<Prenda> prendas = new ArrayList<>();

  public Atuendo(Prenda ... prendas) {
    Collections.addAll(this.prendas, prendas);
  }
}
