package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Habitacion;

@Accessors
@Observable
@SuppressWarnings("all")
public class Laberinto {
  private String nombreLaberinto;
  
  private List<Habitacion> habitaciones;
  
  private Habitacion habitacionActual;
  
  public Laberinto(final String nombreLaberinto) {
    this.nombreLaberinto = nombreLaberinto;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.habitaciones = _newArrayList;
    this.habitacionActual = null;
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
  
  public Habitacion moverHabitacion(final Habitacion habitacion) {
    Habitacion _xifexpression = null;
    boolean _esHabitacionVecina = this.habitacionActual.esHabitacionVecina(habitacion);
    if (_esHabitacionVecina) {
      _xifexpression = this.habitacionActual = habitacion;
    } else {
      throw new UserException("No puede moverse a esta habitación");
    }
    return _xifexpression;
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
  public Habitacion getHabitacionActual() {
    return this.habitacionActual;
  }
  
  public void setHabitacionActual(final Habitacion habitacionActual) {
    this.habitacionActual = habitacionActual;
  }
}
