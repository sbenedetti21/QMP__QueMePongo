package domain.tiempo;

import java.util.List;
import java.util.Map;

public class RegistroTiempo {
  private static AccuWeatherAPI apiClima = new AccuWeatherAPI();
  private static RegistroTiempo INSTANCE = new RegistroTiempo();

  public static RegistroTiempo getInstance() {
    return INSTANCE;
  }

  public Object getTemperaturas() {
    List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
    return condicionesClimaticas.get(0).get("Temperature");
  }

}
