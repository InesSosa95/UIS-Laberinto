package unq.edu.ar.UIS_Modelo;

import org.eclipse.xtend.lib.annotations.Accessors;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class AccionRendirse extends Accion {
  public AccionRendirse(final Habitacion habitacion) {
    super(habitacion);
  }
}
