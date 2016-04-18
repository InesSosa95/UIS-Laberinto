package unq.edu.ar.UIS_Modelo;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class AccionAgarrarItem extends Accion {
  private String nombreItem;
  
  public AccionAgarrarItem(final Habitacion habitacion) {
    super(habitacion);
  }
  
  public boolean agregarItemDisponble() {
    boolean _xblockexpression = false;
    {
      Item item = new Item(this.nombreItem);
      Habitacion _habitacionActual = this.getHabitacionActual();
      List<Item> _itemsDisponibles = _habitacionActual.getItemsDisponibles();
      _xblockexpression = _itemsDisponibles.add(item);
    }
    return _xblockexpression;
  }
  
  public String toString() {
    return ("Accion Agarrar item -" + this.nombreItem);
  }
  
  @Pure
  public String getNombreItem() {
    return this.nombreItem;
  }
  
  public void setNombreItem(final String nombreItem) {
    this.nombreItem = nombreItem;
  }
}
