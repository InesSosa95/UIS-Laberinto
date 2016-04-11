package aplicacion;

import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos;
import view.GatoEncerradoWindow;

@SuppressWarnings("all")
public class AplicacionLaberinto {
  public static void main(final String[] args) {
    SistemaDeLaberintos _sistemaDeLaberintos = new SistemaDeLaberintos();
    GatoEncerradoWindow _gatoEncerradoWindow = new GatoEncerradoWindow(_sistemaDeLaberintos);
    _gatoEncerradoWindow.startApplication();
  }
}
