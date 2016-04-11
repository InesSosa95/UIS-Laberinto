package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Habitacion;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Accion {
  private Habitacion habitacionActual;
  
  public Accion(final Habitacion habitacion) {
    this.habitacionActual = habitacion;
  }
  
  @Pure
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
}
