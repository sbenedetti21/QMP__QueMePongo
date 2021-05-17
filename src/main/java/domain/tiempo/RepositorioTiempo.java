package domain.tiempo;

import java.util.List;
import java.util.Map;

public class RepositorioTiempo {
  private static AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private static RepositorioTiempo INSTANCE = new RepositorioTiempo();

  public static RepositorioTiempo getInstance() {
    return INSTANCE;
  }

  public Object getTemperaturas() {
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
    return condicionesClimaticas.get(0).get("Temperature");
  }

}
