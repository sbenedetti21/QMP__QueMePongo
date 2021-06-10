package domain.user;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuarios {
  private static List<Usuario> usuarios = new ArrayList<>();

  public static void generarSugerenciasDiarias() {
    usuarios.forEach(Usuario::actualizarSugerenciaDiaria);
  }
}
