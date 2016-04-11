package unq.edu.ar.UIS_Modelo;

import java.util.List;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;

@SuppressWarnings("all")
public class AccionAgarrarItem extends Accion {
  public AccionAgarrarItem(final Habitacion habitacion) {
    super(habitacion);
  }
  
  public boolean agregarItemDisponble(final String nombreItem) {
    Habitacion _habitacionActual = this.getHabitacionActual();
    List<String> _itemsDisponibles = _habitacionActual.getItemsDisponibles();
    return _itemsDisponibles.add(nombreItem);
  }
}
