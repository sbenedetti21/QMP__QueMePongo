package domain.recomendador;

import domain.ropa.Atuendo;
import domain.ropa.Prenda;
import domain.ropa.RepositorioPrendas;
import domain.tiempo.RepositorioTiempo;

import java.util.List;

public class Recomendador {

  public static Atuendo recomendarAtuendo() {
    Object temperatura = RepositorioTiempo.getInstance().getTemperaturas();
    List<Prenda> prendas = RepositorioPrendas.getInstance().getPrendas();

    //TODO
    return null;
  }

}
