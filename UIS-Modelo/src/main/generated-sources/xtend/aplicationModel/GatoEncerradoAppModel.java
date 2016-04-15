package aplicationModel;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class GatoEncerradoAppModel {
  private SistemaDeLaberintos sistema;
  
  private Laberinto laberintoSeleccionado;
  
  private Habitacion habitacionSeleccionada;
  
  private Accion accionSeleccionada;
  
  private Usuario administrador;
  
  private Laberinto laberintoNuevo;
  
  public GatoEncerradoAppModel() {
    Usuario _usuario = new Usuario("Pepito");
    this.administrador = _usuario;
    SistemaDeLaberintos _sistemaDeLaberintos = new SistemaDeLaberintos(this.administrador);
    this.sistema = _sistemaDeLaberintos;
    Laberinto _laberinto = new Laberinto("UnLaberintoNuevo", this.administrador);
    this.laberintoNuevo = _laberinto;
  }
  
  public boolean agregarLaberinto(final Laberinto laberinto) {
    return this.sistema.agregarLaberinto(laberinto);
  }
  
  public void validarLaberinto(final Laberinto laberinto) {
    this.sistema.validarLaberinto(laberinto);
  }
  
  public boolean eliminarLaberinto(final Laberinto laberinto) {
    boolean _xblockexpression = false;
    {
      this.sistema.eliminarLaberinto(laberinto);
      _xblockexpression = Objects.equal(this.laberintoSeleccionado, null);
    }
    return _xblockexpression;
  }
  
  public boolean agregarHabitacion(final Habitacion habitacion) {
    return this.laberintoSeleccionado.agregarHabitacion(habitacion);
  }
  
  public boolean eliminarHabitacion(final Habitacion habitacion) {
    return this.laberintoSeleccionado.eliminarHabitacion(habitacion);
  }
  
  public void validarHabitacion(final Habitacion habitacion) {
    this.laberintoSeleccionado.validarHabitacion(habitacion);
  }
  
  public void chequearExistenciaDeLaberinto() {
    List<Laberinto> _laberintos = this.sistema.getLaberintos();
    int _size = _laberintos.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      throw new UserException("No hay laberinto para eliminar");
    }
    boolean _equals_1 = Objects.equal(this.laberintoSeleccionado, null);
    if (_equals_1) {
      throw new UserException("No hay laberinto seleccionado");
    }
  }
  
  public void chequearExistenciaDeHabitacion() {
    List<Habitacion> _habitaciones = this.laberintoSeleccionado.getHabitaciones();
    int _size = _habitaciones.size();
    boolean _equals = (_size == 0);
    if (_equals) {
      throw new UserException("No hay habitacion para eliminar");
    }
    boolean _equals_1 = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals_1) {
      throw new UserException("No hay habitacion seleccionado");
    }
  }
  
  @Pure
  public SistemaDeLaberintos getSistema() {
    return this.sistema;
  }
  
  public void setSistema(final SistemaDeLaberintos sistema) {
    this.sistema = sistema;
  }
  
  @Pure
  public Laberinto getLaberintoSeleccionado() {
    return this.laberintoSeleccionado;
  }
  
  public void setLaberintoSeleccionado(final Laberinto laberintoSeleccionado) {
    this.laberintoSeleccionado = laberintoSeleccionado;
  }
  
  @Pure
  public Habitacion getHabitacionSeleccionada() {
    return this.habitacionSeleccionada;
  }
  
  public void setHabitacionSeleccionada(final Habitacion habitacionSeleccionada) {
    this.habitacionSeleccionada = habitacionSeleccionada;
  }
  
  @Pure
  public Accion getAccionSeleccionada() {
    return this.accionSeleccionada;
  }
  
  public void setAccionSeleccionada(final Accion accionSeleccionada) {
    this.accionSeleccionada = accionSeleccionada;
  }
  
  @Pure
  public Usuario getAdministrador() {
    return this.administrador;
  }
  
  public void setAdministrador(final Usuario administrador) {
    this.administrador = administrador;
  }
  
  @Pure
  public Laberinto getLaberintoNuevo() {
    return this.laberintoNuevo;
  }
  
  public void setLaberintoNuevo(final Laberinto laberintoNuevo) {
    this.laberintoNuevo = laberintoNuevo;
  }
}
