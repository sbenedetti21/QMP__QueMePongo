package domain.uniformes;

import domain.ropa.*;

import java.awt.*;

public class UniformeSanJuan extends UniformeFactory {

  @Override
  public Prenda fabricarParteSuperior() {
    BorradorPrenda chombaSanJuan = new BorradorPrenda(new TipoDePrenda(Categoria.SUPERIOR));
    chombaSanJuan.setColorPrincipal(new Color(0, 255, 0));
    chombaSanJuan.setMaterial(new Material(TipoDeMaterial.PIQUE));
    return chombaSanJuan.generarPrenda();
  }

  @Override
  public Prenda fabricarParteInferior() {
    BorradorPrenda pantalonSanJuan = new BorradorPrenda(new TipoDePrenda(Categoria.INFERIOR));
    pantalonSanJuan.setMaterial(new Material(TipoDeMaterial.ACETATO));
    pantalonSanJuan.setColorPrincipal(new Color(76, 76, 76));
    return pantalonSanJuan.generarPrenda();
  }

  @Override
  public Prenda fabricarCalzado() {
    BorradorPrenda zapatillasSanJuan = new BorradorPrenda(new TipoDePrenda(Categoria.CALZADO));
    zapatillasSanJuan.setMaterial(new Material(TipoDeMaterial.TELA));
    zapatillasSanJuan.setColorPrincipal(new Color(255,255,255));
    return zapatillasSanJuan.generarPrenda();
  }

}
