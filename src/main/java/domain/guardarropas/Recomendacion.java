package domain.guardarropas;

public class Recomendacion {

  boolean aceptada = false;

  public void aceptarRecomendacion(){
    aceptada = true;
  }

  public void rechazarRecomendacion(){
    aceptada = false;
  }

}
