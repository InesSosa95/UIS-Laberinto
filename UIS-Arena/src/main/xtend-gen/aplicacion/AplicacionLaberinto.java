package aplicacion;

import aplicationModel.GatoEncerradoModel;
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import view.GatoEncerradoWindow;

@SuppressWarnings("all")
public class AplicacionLaberinto extends Application {
  public Window<?> createMainWindow() {
    GatoEncerradoModel _gatoEncerradoModel = new GatoEncerradoModel();
    return new GatoEncerradoWindow(this, _gatoEncerradoModel);
  }
  
  public static void main(final String[] args) {
    AplicacionLaberinto _aplicacionLaberinto = new AplicacionLaberinto();
    _aplicacionLaberinto.start();
  }
}
