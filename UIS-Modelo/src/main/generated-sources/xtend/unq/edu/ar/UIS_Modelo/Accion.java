package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Habitacion;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Accion {
  private String nombreAccion;
  
  private Habitacion habitacionActual;
  
  public Accion(final String nombre, final Habitacion habitacion) {
    this.nombreAccion = nombre;
    this.habitacionActual = habitacion;
  }
  
  @Pure
  public String getNombreAccion() {
    return this.nombreAccion;
  }
  
  public void setNombreAccion(final String nombreAccion) {
    this.nombreAccion = nombreAccion;
  }
  
  @Pure
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
}
