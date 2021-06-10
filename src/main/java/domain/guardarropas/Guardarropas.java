package domain.guardarropas;

import domain.ropa.Atuendo;
import domain.ropa.Prenda;
import domain.user.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Guardarropas {
  private List<Usuario> duenios = new ArrayList<>();
  private List<Prenda> prendas = new ArrayList<>();
  private List<Atuendo> atuendosPosibles = Arrays.asList(); //TODO
  private List<Recomendacion> recomendacions = new ArrayList<>();

  public List<Atuendo> getAtuendosPosibles() {
    return atuendosPosibles;
  }

  public void recibirSugerencia(Recomendacion nuevaRecomendacion) {
    recomendacions.add(nuevaRecomendacion);
  }

  public List<Recomendacion> verSugerencias() {
    return recomendacions;
  }

  public void aceptarSugerencia(int idSugerencia) {
    recomendacions.get(idSugerencia).aceptarRecomendacion();
  }

  public void rechazarSugerencia(int idSugerencia) {
    recomendacions.get(idSugerencia).rechazarRecomendacion();
  }

}
