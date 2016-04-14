package aplicationModel;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
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
  
  public GatoEncerradoAppModel() {
    Usuario _usuario = new Usuario("Pepito");
    this.administrador = _usuario;
    SistemaDeLaberintos _sistemaDeLaberintos = new SistemaDeLaberintos(this.administrador);
    this.sistema = _sistemaDeLaberintos;
  }
  
  public void agregarLaberinto(final Laberinto laberinto) {
    this.sistema.agregarLaberinto(laberinto);
  }
  
  public boolean eliminarLaberinto(final Laberinto laberinto) {
    return this.sistema.eliminarLaberinto(laberinto);
  }
  
  public boolean agregarHabitacion(final Habitacion habitacion) {
    return this.laberintoSeleccionado.agregarHabitacion(habitacion);
  }
  
  public boolean eliminarHabitacion(final Habitacion habitacion) {
    return this.laberintoSeleccionado.eliminarHabitacion(habitacion);
  }
  
  public List<Laberinto> laberintos() {
    return this.sistema.getLaberintos();
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
}
