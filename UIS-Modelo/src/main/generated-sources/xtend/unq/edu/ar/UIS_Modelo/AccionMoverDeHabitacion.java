package unq.edu.ar.UIS_Modelo;

import org.uqbar.commons.model.UserException;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;

@SuppressWarnings("all")
public class AccionMoverDeHabitacion extends Accion {
  public AccionMoverDeHabitacion(final String nombre, final Habitacion habitacion) {
    super(nombre, habitacion);
  }
  
  public void moverse(final Habitacion otraHabitacion) {
    boolean _and = false;
    Habitacion _habitacionActual = this.getHabitacionActual();
    boolean _esHabitacionVecina = _habitacionActual.esHabitacionVecina(otraHabitacion);
    if (!_esHabitacionVecina) {
      _and = false;
    } else {
      Boolean _estaHabilitada = otraHabitacion.getEstaHabilitada();
      boolean _equals = ((_estaHabilitada).booleanValue() == true);
      _and = _equals;
    }
    if (_and) {
      this.setHabitacionActual(otraHabitacion);
    } else {
      throw new UserException("No se puede mover a esta habitacion");
    }
  }
}
