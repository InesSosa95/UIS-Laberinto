package unq.edu.ar.UIS_Modelo;

import java.util.List;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;

@SuppressWarnings("all")
public class AccionMoverDeHabitacion extends Accion {
  public AccionMoverDeHabitacion(final Habitacion habitacion) {
    super(habitacion);
  }
  
  public List<Habitacion> habitacionesDisponibles() {
    Habitacion _habitacionActual = this.getHabitacionActual();
    return _habitacionActual.getVecinas();
  }
}
