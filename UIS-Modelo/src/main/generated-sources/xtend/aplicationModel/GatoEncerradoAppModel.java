package aplicationModel;

import com.google.common.base.Objects;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.ObservableUtils;
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
  
  public boolean eliminarLaberinto() {
    return this.sistema.eliminarLaberinto(this.laberintoSeleccionado);
  }
  
  public boolean agregarHabitacion(final Habitacion habitacion) {
    return this.laberintoSeleccionado.agregarHabitacion(habitacion);
  }
  
  public boolean eliminarHabitacion() {
    return this.laberintoSeleccionado.eliminarHabitacion(this.habitacionSeleccionada);
  }
  
  public void crearAccion() {
    Accion _accion = new Accion(this.habitacionSeleccionada);
    this.habitacionSeleccionada.agregarAccion(_accion);
    ObservableUtils.firePropertyChanged(this, "toString");
  }
  
  public boolean eliminarAccion(final Accion accion) {
    return this.habitacionSeleccionada.eliminarAccion(accion);
  }
  
  public void validarLaberinto() {
    boolean _equals = Objects.equal(this.laberintoSeleccionado, null);
    if (_equals) {
      throw new UserException("No hay laberinto seleccionado");
    }
  }
  
  public void validarHabitacion() {
    boolean _equals = Objects.equal(this.habitacionSeleccionada, null);
    if (_equals) {
      throw new UserException("No hay habitacion seleccionada");
    }
  }
  
  public void validarAccion() {
    boolean _equals = Objects.equal(this.accionSeleccionada, null);
    if (_equals) {
      throw new UserException("No hay accion seleccionada");
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
