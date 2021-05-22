package domain.tiempo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepositorioTiempoAccuweather implements RepositorioTiempo {  // TODO -> hacer que se almacenen las respuestas por ciudad
  private static AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private static RepositorioTiempoAccuweather INSTANCE = new RepositorioTiempoAccuweather();

  public static RepositorioTiempoAccuweather getInstance() {
    return INSTANCE;
  }

  public double getTemperaturas() {
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
    HashMap<String, Object> temperatura = (HashMap<String, Object>) condicionesClimaticas.get(0).get("Temperature");
    double temperaturaValor = (double) temperatura.get("Value");
    return convertirTemperatura((int) temperatura.get("UnitType"), temperaturaValor);
  }

  public static double convertirTemperatura(int unitType, double temperaturaValor) {
    switch (unitType) {
      case 17:
        return temperaturaValor;
      case 18:
        return (temperaturaValor - 32.0) * 5.0/9.0;
      case 19:
        return temperaturaValor - 273.15;
    }
    throw new RuntimeException("tipo invalido");
  }

}
