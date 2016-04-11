package unq.edu.ar.UIS_Modelo;

import java.util.List;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Inventario;
import unq.edu.ar.UIS_Modelo.Item;

@SuppressWarnings("all")
public class AccionAgarrarItem extends Accion {
  private Inventario inventario;
  
  public AccionAgarrarItem(final String nombre, final Habitacion habitacion) {
    super(nombre, habitacion);
  }
  
  public boolean agarraItem() {
    boolean _xblockexpression = false;
    {
      Habitacion _habitacionActual = this.getHabitacionActual();
      List<Item> _itemsDisponibles = _habitacionActual.getItemsDisponibles();
      Item item = _itemsDisponibles.get(0);
      String _nombreItem = item.getNombreItem();
      this.inventario.agregarItem(_nombreItem);
      Habitacion _habitacionActual_1 = this.getHabitacionActual();
      List<Item> _itemsDisponibles_1 = _habitacionActual_1.getItemsDisponibles();
      _xblockexpression = _itemsDisponibles_1.remove(item);
    }
    return _xblockexpression;
  }
}
