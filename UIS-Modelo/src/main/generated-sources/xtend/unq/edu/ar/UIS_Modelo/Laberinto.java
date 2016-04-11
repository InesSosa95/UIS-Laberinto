package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Laberinto {
  private String nombreLaberinto;
  
  private List<Habitacion> habitaciones;
  
  private Habitacion habitacionInicial;
  
  private Habitacion habitacionFinal;
  
  private Usuario administrador;
  
  public Laberinto(final String nombreLaberinto, final Usuario administrador) {
    this.nombreLaberinto = nombreLaberinto;
    this.administrador = administrador;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.habitaciones = _newArrayList;
    this.habitacionInicial = null;
    this.habitacionFinal = null;
  }
  
  public boolean agregarHabitacion(final Habitacion habitacion) {
    boolean _xifexpression = false;
    boolean _contains = this.habitaciones.contains(habitacion);
    boolean _not = (!_contains);
    if (_not) {
      _xifexpression = this.habitaciones.add(habitacion);
    }
    return _xifexpression;
  }
  
  public boolean eliminarHabitacion(final Habitacion habitacion) {
    return this.habitaciones.remove(habitacion);
  }
  
  @Pure
  public String getNombreLaberinto() {
    return this.nombreLaberinto;
  }
  
  public void setNombreLaberinto(final String nombreLaberinto) {
    this.nombreLaberinto = nombreLaberinto;
  }
  
  @Pure
  public List<Habitacion> getHabitaciones() {
    return this.habitaciones;
  }
  
  public void setHabitaciones(final List<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }
  
  @Pure
  public Habitacion getHabitacionInicial() {
    return this.habitacionInicial;
  }
  
  public void setHabitacionInicial(final Habitacion habitacionInicial) {
    this.habitacionInicial = habitacionInicial;
  }
  
  @Pure
  public Habitacion getHabitacionFinal() {
    return this.habitacionFinal;
  }
  
  public void setHabitacionFinal(final Habitacion habitacionFinal) {
    this.habitacionFinal = habitacionFinal;
  }
  
  @Pure
  public Usuario getAdministrador() {
    return this.administrador;
  }
  
  public void setAdministrador(final Usuario administrador) {
    this.administrador = administrador;
  }
}
