package unq.edu.ar.UIS_Modelo;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class AccionMoverDeHabitacion extends Accion {
  private Habitacion habitacionProxima;
  
  public AccionMoverDeHabitacion(final Habitacion habitacionActual) {
    super(habitacionActual);
    this.habitacionProxima = habitacionActual;
  }
  
  public List<Habitacion> habitacionesDisponibles() {
    Habitacion _habitacionActual = this.getHabitacionActual();
    Laberinto _laberinto = _habitacionActual.getLaberinto();
    List<Habitacion> _habitaciones = _laberinto.getHabitaciones();
    return this.distintasAlaActual(_habitaciones);
  }
  
  public List<Habitacion> distintasAlaActual(final List<Habitacion> habitaciones) {
    final Function1<Habitacion, Boolean> _function = new Function1<Habitacion, Boolean>() {
      public Boolean apply(final Habitacion it) {
        Habitacion _habitacionActual = AccionMoverDeHabitacion.this.getHabitacionActual();
        boolean _equals = it.equals(_habitacionActual);
        return Boolean.valueOf((!_equals));
      }
    };
    Iterable<Habitacion> _filter = IterableExtensions.<Habitacion>filter(habitaciones, _function);
    return IterableExtensions.<Habitacion>toList(_filter);
  }
  
  public String toString() {
    String _string = this.habitacionProxima.toString();
    return ("Accion Moverse a -" + _string);
  }
  
  @Pure
  public Habitacion getHabitacionProxima() {
    return this.habitacionProxima;
  }
  
  public void setHabitacionProxima(final Habitacion habitacionProxima) {
    this.habitacionProxima = habitacionProxima;
  }
}
