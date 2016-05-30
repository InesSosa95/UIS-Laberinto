package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class AccionUsarItem extends Accion {
  private Item itemSeleccionado;
  
  private Accion accionItem;
  
  public AccionUsarItem(final Habitacion habitacion, final String item) {
    super(habitacion);
    Item _item = new Item(item);
    this.itemSeleccionado = _item;
  }
  
  public AccionUsarItem(final Habitacion habitacion) {
    super(habitacion);
  }
  
  public Accion crearAccionItem() {
    Habitacion _habitacionActual = this.getHabitacionActual();
    Accion _accion = new Accion(_habitacionActual);
    return this.accionItem = _accion;
  }
  
  public String toString() {
    String _string = this.itemSeleccionado.toString();
    String _plus = ("Accion de Usar " + _string);
    String _plus_1 = (_plus + ":");
    String _string_1 = this.accionItem.toString();
    return (_plus_1 + _string_1);
  }
  
  @Pure
  public Item getItemSeleccionado() {
    return this.itemSeleccionado;
  }
  
  public void setItemSeleccionado(final Item itemSeleccionado) {
    this.itemSeleccionado = itemSeleccionado;
  }
  
  @Pure
  public Accion getAccionItem() {
    return this.accionItem;
  }
  
  public void setAccionItem(final Accion accionItem) {
    this.accionItem = accionItem;
  }
}
