package view;

import java.awt.Dialog;

@SuppressWarnings("all")
public class AgregarAccionWindow /* extends /* Dialog<Accion> */  */{
  public AgregarAccionWindow(final /* WindowOwner */Object parent, final /* GatoEncerrado */Object model) {
    super(parent, (model).GatoEncerradoValue());
    this.setTitle("Agregar Acción");
  }
}
