package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Item {
  private String nombreItem;
  
  private Boolean habilitado;
  
  @Pure
  public String getNombreItem() {
    return this.nombreItem;
  }
  
  public void setNombreItem(final String nombreItem) {
    this.nombreItem = nombreItem;
  }
  
  @Pure
  public Boolean getHabilitado() {
    return this.habilitado;
  }
  
  public void setHabilitado(final Boolean habilitado) {
    this.habilitado = habilitado;
  }
}
