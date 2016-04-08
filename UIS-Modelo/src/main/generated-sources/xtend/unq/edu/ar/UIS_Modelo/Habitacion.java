package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Item;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Habitacion {
  private String id;
  
  private List<Accion> acciones;
  
  private List<Habitacion> vecinas;
  
  private List<Item> itemsDisponibles;
  
  private Item itemUtilizable;
  
  private Boolean estaDisponible;
  
  private Boolean esFinal;
  
  private Boolean esInicial;
  
  private Boolean estaHabilitada;
  
  public Habitacion(final String id, final Boolean esFinal, final Boolean esInicial, final Item itemUtilizable, final Boolean habilitada) {
    this.id = id;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.vecinas = _newArrayList;
    ArrayList<Item> _newArrayList_1 = CollectionLiterals.<Item>newArrayList();
    this.itemsDisponibles = _newArrayList_1;
    this.itemUtilizable = itemUtilizable;
    this.esFinal = Boolean.valueOf(false);
    this.esInicial = Boolean.valueOf(false);
    this.estaHabilitada = habilitada;
  }
  
  public boolean esHabitacionVecina(final Habitacion habitacion) {
    return this.vecinas.contains(habitacion);
  }
  
  public boolean eliminarItem(final Item item) {
    return this.itemsDisponibles.remove(item);
  }
  
  public Boolean marcarComoInicial() {
    Boolean _xifexpression = null;
    if (((this.esFinal).booleanValue() == false)) {
      _xifexpression = this.esInicial = Boolean.valueOf(true);
    } else {
      throw new UserException("La habitacion no puede ser final e inicial al mismo tiempo");
    }
    return _xifexpression;
  }
  
  public Boolean marcarComoFinal() {
    Boolean _xifexpression = null;
    if (((this.esInicial).booleanValue() == false)) {
      _xifexpression = this.esFinal = Boolean.valueOf(true);
    } else {
      throw new UserException("La habitacion no puede ser final e inicial al mismo tiempo");
    }
    return _xifexpression;
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
  public Boolean getEstaDisponible() {
    return this.estaDisponible;
  }
  
  public void setEstaDisponible(final Boolean estaDisponible) {
    this.estaDisponible = estaDisponible;
  }
  
  @Pure
  public Boolean getEsFinal() {
    return this.esFinal;
  }
  
  public void setEsFinal(final Boolean esFinal) {
    this.esFinal = esFinal;
  }
  
  @Pure
  public Boolean getEsInicial() {
    return this.esInicial;
  }
  
  public void setEsInicial(final Boolean esInicial) {
    this.esInicial = esInicial;
  }
  
  @Pure
  public Boolean getEstaHabilitada() {
    return this.estaHabilitada;
  }
  
  public void setEstaHabilitada(final Boolean estaHabilitada) {
    this.estaHabilitada = estaHabilitada;
  }
}
