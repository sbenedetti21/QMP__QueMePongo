package domain.recomendador;

import domain.ropa.Atuendo;
import domain.ropa.Prenda;
import domain.ropa.RepositorioPrendas;
import domain.tiempo.RepositorioTiempo;

import java.util.HashMap;
import java.util.List;

public class Recomendador {

  public static Atuendo recomendarAtuendo() {
    HashMap<String, Object> temperatura = RepositorioTiempo.getInstance().getTemperaturas();

    double temperaturaValor = (double) temperatura.get("Value");
    double temperaturaEnFarenheit = RepositorioTiempo.convertirTemperatura((int) temperatura.get("UnitType"), temperaturaValor);

    return generarAtuendo(temperaturaEnFarenheit);
  }

  private static Atuendo generarAtuendo(double temperaturaEnFarenheit) {
    RepositorioPrendas repo = RepositorioPrendas.getInstance();

    Prenda prendaSuperior = repo.getPrendaSuperiorPara(temperaturaEnFarenheit);
    Prenda prendaInferior = repo.getPrendaInferiorPara(temperaturaEnFarenheit);
    Prenda calzado = repo.getCalzadoPara(temperaturaEnFarenheit);
    return new Atuendo(prendaSuperior, prendaInferior, calzado);
  }

}
