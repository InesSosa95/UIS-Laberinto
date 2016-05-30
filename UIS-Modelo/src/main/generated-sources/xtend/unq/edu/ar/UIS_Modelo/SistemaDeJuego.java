package unq.edu.ar.UIS_Modelo;

import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Inventario;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@SuppressWarnings("all")
public class SistemaDeJuego {
  private Usuario usuario;
  
  private Laberinto laberinto;
  
  private Habitacion habitacionActual;
  
  public SistemaDeJuego(final Usuario user, final Laberinto labyrinth, final Habitacion room) {
    this.usuario = user;
    this.laberinto = labyrinth;
    this.habitacionActual = room;
  }
  
  public boolean recogerItem(final Item item) {
    boolean _xifexpression = false;
    boolean _tieneItem = this.habitacionActual.tieneItem(item);
    if (_tieneItem) {
      _xifexpression = this.agregarItemAInventario(item);
    }
    return _xifexpression;
  }
  
  public Habitacion moverAVecina(final Habitacion habitacion) {
    Habitacion _xifexpression = null;
    boolean _esVecina = this.esVecina(habitacion);
    if (_esVecina) {
      _xifexpression = this.habitacionActual = habitacion;
    }
    return _xifexpression;
  }
  
  public boolean arrojarItem(final Item item) {
    Inventario _inventario = this.usuario.getInventario();
    return _inventario.eliminarItem(item);
  }
  
  public boolean agregarItemAInventario(final Item item) {
    Inventario _inventario = this.usuario.getInventario();
    return _inventario.agregarItem(item);
  }
  
  public boolean eliminarItemDeHabitacion(final Item item) {
    return this.habitacionActual.eliminarItem(item);
  }
  
  public boolean esVecina(final Habitacion habitacion) {
    return this.habitacionActual.esHabitacionVecina(habitacion);
  }
}
