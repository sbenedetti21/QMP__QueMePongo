package domain.uniformes;

import domain.ropa.*;

import java.awt.*;

public class UniformeJohnson extends UniformeFactory {

  @Override
  public Prenda fabricarParteSuperior() {
    BorradorPrenda camisaJohnson = new BorradorPrenda(new TipoDePrenda(Categoria.SUPERIOR));
    camisaJohnson.setColorPrincipal(new Color(255, 255, 255));
    camisaJohnson.setMaterial(new Material(TipoDeMaterial.TELA));
    return camisaJohnson.generarPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    BorradorPrenda pantalonJohnson = new BorradorPrenda(new TipoDePrenda(Categoria.INFERIOR));
    pantalonJohnson.setMaterial(new Material(TipoDeMaterial.ACETATO));
    pantalonJohnson.setColorPrincipal(new Color(0, 0, 0));
    return pantalonJohnson.generarPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    BorradorPrenda zapatosJohnson = new BorradorPrenda(new TipoDePrenda(Categoria.CALZADO));
    zapatosJohnson.setColorPrincipal(new Color(0,0,0));
    zapatosJohnson.setMaterial(new Material(TipoDeMaterial.CUERO));
    return zapatosJohnson.generarPrenda();
  }

}
