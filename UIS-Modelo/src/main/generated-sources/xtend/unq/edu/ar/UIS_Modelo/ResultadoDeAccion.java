package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public abstract class ResultadoDeAccion {
  private Item item;
  
  public abstract void habilitar(final Item item, final Habitacion habitacion);
  
  @Pure
  public Item getItem() {
    return this.item;
  }
  
  public void setItem(final Item item) {
    this.item = item;
  }
}
