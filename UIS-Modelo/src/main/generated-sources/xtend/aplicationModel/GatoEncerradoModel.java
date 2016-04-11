package aplicationModel;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class GatoEncerradoModel {
  private List<Laberinto> laberintos;
  
  private Laberinto laberintoSeleccionado;
  
  private Usuario administrador;
  
  public GatoEncerradoModel() {
    ArrayList<Laberinto> _arrayList = new ArrayList<Laberinto>();
    this.laberintos = _arrayList;
    Usuario _usuario = new Usuario("Pepito");
    this.administrador = _usuario;
    this.inicializarLaberintos();
  }
  
  public Laberinto inicializarLaberintos() {
    Laberinto _xblockexpression = null;
    {
      final Laberinto laberinto1 = new Laberinto("Casa embrujada", this.administrador);
      final Laberinto laberinto2 = new Laberinto("Museo en la noche", this.administrador);
      final Laberinto laberinto3 = new Laberinto("Pueblo Fantasma", this.administrador);
      final Laberinto laberinto4 = new Laberinto("Escape del Cementerio", this.administrador);
      Habitacion habitacion1 = new Habitacion("Recibidor", Disponibilidad.DISPONIBLE);
      Habitacion habitacion2 = new Habitacion("Comedor", Disponibilidad.NO_DISPONIBLE);
      Habitacion habitacion3 = new Habitacion("Cocina", Disponibilidad.DISPONIBLE);
      Habitacion habitacion4 = new Habitacion("Sala de Pinturas", Disponibilidad.DISPONIBLE);
      Habitacion habitacion5 = new Habitacion("Fosiles Prehistoricos", Disponibilidad.DISPONIBLE);
      Habitacion habitacion6 = new Habitacion("Muñecos de Cera", Disponibilidad.DISPONIBLE);
      Habitacion habitacion7 = new Habitacion("Plaza Central", Disponibilidad.DISPONIBLE);
      Habitacion habitacion8 = new Habitacion("Casa abandonada", Disponibilidad.DISPONIBLE);
      Habitacion habitacion9 = new Habitacion("Bosque", Disponibilidad.DISPONIBLE);
      Habitacion habitacion10 = new Habitacion("Calle central", Disponibilidad.DISPONIBLE);
      Habitacion habitacion11 = new Habitacion("Catacumba", Disponibilidad.DISPONIBLE);
      Habitacion habitacion12 = new Habitacion("Puerta de Entrada", Disponibilidad.NO_DISPONIBLE);
      laberinto1.agregarHabitacion(habitacion1);
      laberinto1.agregarHabitacion(habitacion2);
      laberinto1.agregarHabitacion(habitacion3);
      laberinto2.agregarHabitacion(habitacion4);
      laberinto2.agregarHabitacion(habitacion5);
      laberinto2.agregarHabitacion(habitacion6);
      laberinto3.agregarHabitacion(habitacion7);
      laberinto3.agregarHabitacion(habitacion8);
      laberinto3.agregarHabitacion(habitacion9);
      laberinto4.agregarHabitacion(habitacion10);
      laberinto4.agregarHabitacion(habitacion11);
      laberinto4.agregarHabitacion(habitacion12);
      final Procedure1<List<Laberinto>> _function = new Procedure1<List<Laberinto>>() {
        public void apply(final List<Laberinto> it) {
          it.add(laberinto1);
          it.add(laberinto2);
          it.add(laberinto3);
          it.add(laberinto4);
        }
      };
      ObjectExtensions.<List<Laberinto>>operator_doubleArrow(
        this.laberintos, _function);
      _xblockexpression = this.laberintoSeleccionado = laberinto1;
    }
    return _xblockexpression;
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
  public Usuario getAdministrador() {
    return this.administrador;
  }
  
  public void setAdministrador(final Usuario administrador) {
    this.administrador = administrador;
  }
}
