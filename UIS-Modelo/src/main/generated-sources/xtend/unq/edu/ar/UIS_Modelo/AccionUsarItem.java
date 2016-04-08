package unq.edu.ar.UIS_Modelo;

import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;

@SuppressWarnings("all")
public class AccionUsarItem extends Accion {
  public void usarItem(final Item item, final Habitacion habitacion) {
    habitacion.eliminarItem(item);
  }
}
