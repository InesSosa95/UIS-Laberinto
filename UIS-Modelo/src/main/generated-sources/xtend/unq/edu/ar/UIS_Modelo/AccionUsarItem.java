package unq.edu.ar.UIS_Modelo;

import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;

@SuppressWarnings("all")
public class AccionUsarItem extends Accion {
  public AccionUsarItem(final String nombre, final Habitacion habitacion) {
    super(nombre, habitacion);
  }
  
  public void usarItem(final Item item, final Habitacion habitacion) {
    habitacion.eliminarItem(item);
  }
}
