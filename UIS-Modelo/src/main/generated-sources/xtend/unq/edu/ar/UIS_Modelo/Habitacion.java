package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.Laberinto;

@Accessors
@Observable
@SuppressWarnings("all")
public class Habitacion {
  private String nombreHabitacion;
  
  private List<Accion> acciones;
  
  private List<Habitacion> vecinas;
  
  private List<Item> itemsDisponibles;
  
  private Item itemUtilizable;
  
  private Disponibilidad estaDisponible;
  
  private Laberinto laberinto;
  
  public Habitacion(final String id, final Disponibilidad disponibilidad, final Laberinto laberinto) {
    this.nombreHabitacion = id;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.vecinas = _newArrayList;
    ArrayList<Item> _newArrayList_1 = CollectionLiterals.<Item>newArrayList();
    this.itemsDisponibles = _newArrayList_1;
    this.estaDisponible = disponibilidad;
    ArrayList<Accion> _newArrayList_2 = CollectionLiterals.<Accion>newArrayList();
    this.acciones = _newArrayList_2;
    this.laberinto = laberinto;
  }
  
  public boolean esHabitacionVecina(final Habitacion habitacion) {
    return this.vecinas.contains(habitacion);
  }
  
  public boolean agregarVecina(final Habitacion habitacion) {
    return this.vecinas.add(habitacion);
  }
  
  public boolean agregarAccion(final Accion accion) {
    return this.acciones.add(accion);
  }
  
  public boolean eliminarAccion(final Accion accion) {
    return this.acciones.remove(accion);
  }
  
  public boolean eliminarAcciones() {
    return CollectionExtensions.<Accion>removeAll(this.acciones);
  }
  
  public String toString() {
    return this.nombreHabitacion;
  }
  
  public boolean agregarItem(final Item item) {
    return this.itemsDisponibles.add(item);
  }
  
  public boolean eliminarItem(final Item item) {
    return this.itemsDisponibles.remove(item);
  }
  
  public boolean tieneItem(final Item item) {
    return this.itemsDisponibles.contains(item);
  }
  
  @Pure
  public String getNombreHabitacion() {
    return this.nombreHabitacion;
  }
  
  public void setNombreHabitacion(final String nombreHabitacion) {
    this.nombreHabitacion = nombreHabitacion;
  }
  
  @Pure
  public List<Accion> getAcciones() {
    return this.acciones;
  }
  
  public void setAcciones(final List<Accion> acciones) {
    this.acciones = acciones;
  }
  
  @Pure
  public List<Habitacion> getVecinas() {
    return this.vecinas;
  }
  
  public void setVecinas(final List<Habitacion> vecinas) {
    this.vecinas = vecinas;
  }
  
  @Pure
  public List<Item> getItemsDisponibles() {
    return this.itemsDisponibles;
  }
  
  public void setItemsDisponibles(final List<Item> itemsDisponibles) {
    this.itemsDisponibles = itemsDisponibles;
  }
  
  @Pure
  public Item getItemUtilizable() {
    return this.itemUtilizable;
  }
  
  public void setItemUtilizable(final Item itemUtilizable) {
    this.itemUtilizable = itemUtilizable;
  }
  
  @Pure
  public Disponibilidad getEstaDisponible() {
    return this.estaDisponible;
  }
  
  public void setEstaDisponible(final Disponibilidad estaDisponible) {
    this.estaDisponible = estaDisponible;
  }
  
  @Pure
  public Laberinto getLaberinto() {
    return this.laberinto;
  }
  
  public void setLaberinto(final Laberinto laberinto) {
    this.laberinto = laberinto;
  }
}
