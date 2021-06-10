package domain.user;

import domain.tiempo.Alerta;
import domain.tiempo.RepositorioTiempoAccuweather;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
  private List<Usuario> usuarios = new ArrayList<>();

  public void generarSugerenciasDiarias() {
    usuarios.forEach(Usuario::actualizarSugerenciaDiaria);
  }

  public void actualizarAlertas() {
    List<Alerta> alertas = RepositorioTiempoAccuweather.getInstance().getAlertas();
    usuarios.forEach(usuario -> usuario.actualizarAlertas(alertas));
  }
}
