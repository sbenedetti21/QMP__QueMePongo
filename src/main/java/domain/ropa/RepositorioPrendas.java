package domain.ropa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;
import java.util.stream.Collectors;

public class RepositorioPrendas {

  private static List<Prenda> prendasSuperiores = Arrays.asList();
  private static List<Prenda> prendasInferiores = Arrays.asList();
  private static List<Prenda> calzados = Arrays.asList();
  private static List<Prenda> accesorios = Arrays.asList();
  private static RepositorioPrendas INSTANCE = new RepositorioPrendas();


  public static RepositorioPrendas getInstance() {
    return INSTANCE;
  }

  public Prenda getPrendaSuperiorPara(double temperaturaEnCelsius) {
    return getPrendaAleatoria(temperaturaEnCelsius, prendasSuperiores);
  }

  public Prenda getPrendaInferiorPara(double temperaturaEnCelsius) {
    return getPrendaAleatoria(temperaturaEnCelsius, prendasInferiores);
  }


  public Prenda getCalzadoPara(double temperaturaEnCelsius) {
    return getPrendaAleatoria(temperaturaEnCelsius, calzados);
  }

  private Prenda getPrendaAleatoria(double temperaturaEnCelsius, List<Prenda> prendas) {
    return prendas.stream()
        .filter(prenda -> prenda.getTemperaturaMaxima() < temperaturaEnCelsius)
        .collect(Collectors.toList())
        .get((int) Math.floor(Math.random()*(prendas.size()+1)));
  }

  public List<Prenda> getAllPrendas() {
    List<Prenda> listaCompleta = new ArrayList<>();
    listaCompleta.addAll(prendasInferiores);
    listaCompleta.addAll(prendasSuperiores);
    listaCompleta.addAll(calzados);
    listaCompleta.addAll(accesorios);
    return listaCompleta;
  }

  public void agregarPrendaSuperior(Prenda unaPrenda) {
    prendasSuperiores.add(unaPrenda);
  }
  public void agregarPrendaInferior(Prenda unaPrenda) {
    prendasInferiores.add(unaPrenda);
  }
  public void agregarCalzado(Prenda unaPrenda) {
    calzados.add(unaPrenda);
  }
  public void agregarAccesorio(Prenda unaPrenda) {
    accesorios.add(unaPrenda);
  }

}
