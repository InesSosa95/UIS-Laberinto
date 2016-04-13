package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Item;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Habitacion {
  private String id;
  
  private List<Accion> acciones;
  
  private List<Habitacion> vecinas;
  
  private List<String> itemsDisponibles;
  
  private String itemUtilizable;
  
  private Disponibilidad estaDisponible;
  
  public Habitacion(final String id, final Disponibilidad disponibilidad) {
    this.id = id;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.vecinas = _newArrayList;
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList();
    this.itemsDisponibles = _newArrayList_1;
    this.itemUtilizable = this.itemUtilizable;
    this.estaDisponible = disponibilidad;
    ArrayList<Accion> _newArrayList_2 = CollectionLiterals.<Accion>newArrayList();
    this.acciones = _newArrayList_2;
  }
  
  public boolean esHabitacionVecina(final Habitacion habitacion) {
    return this.vecinas.contains(habitacion);
  }
  
  public boolean eliminarItem(final Item item) {
    return this.itemsDisponibles.remove(item);
  }
  
  @Pure
  public String getId() {
    return this.id;
  }
  
  public void setId(final String id) {
    this.id = id;
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
  public List<String> getItemsDisponibles() {
    return this.itemsDisponibles;
  }
  
  public void setItemsDisponibles(final List<String> itemsDisponibles) {
    this.itemsDisponibles = itemsDisponibles;
  }
  
  @Pure
  public String getItemUtilizable() {
    return this.itemUtilizable;
  }
  
  public void setItemUtilizable(final String itemUtilizable) {
    this.itemUtilizable = itemUtilizable;
  }
  
  @Pure
  public Disponibilidad getEstaDisponible() {
    return this.estaDisponible;
  }
  
  public void setEstaDisponible(final Disponibilidad estaDisponible) {
    this.estaDisponible = estaDisponible;
  }
}
