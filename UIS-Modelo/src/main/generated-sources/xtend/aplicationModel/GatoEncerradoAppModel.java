package aplicationModel;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class GatoEncerradoAppModel {
  private List<Laberinto> laberintos;
  
  private Laberinto laberintoSeleccionado;
  
  private Habitacion habitacionSeleccionada;
  
  private Accion accionSeleccionada;
  
  private Usuario administrador;
  
  public GatoEncerradoAppModel() {
    ArrayList<Laberinto> _arrayList = new ArrayList<Laberinto>();
    this.laberintos = _arrayList;
    Usuario _usuario = new Usuario("Pepito");
    this.administrador = _usuario;
    Laberinto _laberinto = new Laberinto();
    this.laberintoSeleccionado = _laberinto;
  }
  
  @Pure
  public List<Laberinto> getLaberintos() {
    return this.laberintos;
  }
  
  public void setLaberintos(final List<Laberinto> laberintos) {
    this.laberintos = laberintos;
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
