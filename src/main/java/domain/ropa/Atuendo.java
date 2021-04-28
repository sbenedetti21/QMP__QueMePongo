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

/*
Considero que los uniformes podrian ser instancias de una clase Uniforme que herede de Atuendo,
pero teniendo un atributo de nombre y que al inicializar un objeto tenga que si o si asignarse una prenda
superior, inferior y calzado
 */