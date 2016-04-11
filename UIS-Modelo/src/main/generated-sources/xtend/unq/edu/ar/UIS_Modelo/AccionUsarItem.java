package unq.edu.ar.UIS_Modelo;

import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;

@SuppressWarnings("all")
public class AccionUsarItem extends Accion {
  private String itemSeleccionado;
  
  public AccionUsarItem(final Habitacion habitacion, final String item) {
    super(habitacion);
    this.itemSeleccionado = item;
  }
  
  public Object crearAccionItem() {
    return null;
  }
}
