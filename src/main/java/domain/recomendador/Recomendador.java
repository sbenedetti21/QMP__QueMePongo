package domain.recomendador;

import domain.ropa.Atuendo;
import domain.ropa.Prenda;
import domain.ropa.RepositorioPrendas;
import domain.tiempo.RepositorioTiempo;

import java.util.HashMap;
import java.util.List;

public class Recomendador {

  public static Atuendo recomendarAtuendo() {
    double temperatura = RepositorioTiempo.getInstance().getTemperaturas();
    return generarAtuendo(temperatura);
  }

  private static Atuendo generarAtuendo(double temperaturaEnCelsius) {
    RepositorioPrendas repo = RepositorioPrendas.getInstance();

    Prenda prendaSuperior = repo.getPrendaSuperiorPara(temperaturaEnCelsius);
    Prenda prendaInferior = repo.getPrendaInferiorPara(temperaturaEnCelsius);
    Prenda calzado = repo.getCalzadoPara(temperaturaEnCelsius);
    return new Atuendo(prendaSuperior, prendaInferior, calzado);
  }

}
