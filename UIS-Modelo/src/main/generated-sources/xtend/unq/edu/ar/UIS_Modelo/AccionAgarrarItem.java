package unq.edu.ar.UIS_Modelo;

import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Inventario;

@SuppressWarnings("all")
public class AccionAgarrarItem extends Accion {
  private Inventario inventario;
  
  public AccionAgarrarItem(final String nombre, final Habitacion habitacion) {
    super(nombre, habitacion);
  }
  
  public boolean agarraItem() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Item to String");
  }
}
