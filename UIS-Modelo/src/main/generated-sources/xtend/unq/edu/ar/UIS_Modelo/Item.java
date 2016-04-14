package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Item {
  private String nombre;
  
  private Accion accion;
  
  public Item(final String nombreItem) {
    this.nombre = nombreItem;
  }
  
  @Pure
  public String getNombre() {
    return this.nombre;
  }
  
  public void setNombre(final String nombre) {
    this.nombre = nombre;
  }
  
  @Pure
  public Accion getAccion() {
    return this.accion;
  }
  
  public void setAccion(final Accion accion) {
    this.accion = accion;
  }
}
