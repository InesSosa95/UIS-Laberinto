package unq.edu.ar.UIS_Modelo;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Laberinto {
  private String nombreLaberinto;
  
  private List<Habitacion> habitaciones;
  
  private Habitacion habitacionInicial;
  
  private Habitacion habitacionFinal;
  
  private Usuario administrador;
  
  private List<Item> items;
  
  public Laberinto(final String nombre, final Usuario admin) {
    this.nombreLaberinto = nombre;
    this.administrador = admin;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.habitaciones = _newArrayList;
    ArrayList<Item> _newArrayList_1 = CollectionLiterals.<Item>newArrayList();
    this.items = _newArrayList_1;
    this.habitacionInicial = null;
    this.habitacionFinal = null;
  }
  
  public Habitacion setHabitacionInicial(final Habitacion habitacion) {
    Habitacion _xifexpression = null;
    boolean _or = false;
    boolean _hayHabitacionInicial = this.hayHabitacionInicial(habitacion);
    if (_hayHabitacionInicial) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(habitacion, this.habitacionFinal);
      _or = _equals;
    }
    if (_or) {
      throw new UserException("Solo puede haber una habitacion inicial");
    } else {
      _xifexpression = this.habitacionInicial = habitacion;
    }
    return _xifexpression;
  }
  
  public Habitacion setHabitacionFinal(final Habitacion habitacion) {
    Habitacion _xifexpression = null;
    boolean _or = false;
    boolean _hayHabitacionFinal = this.hayHabitacionFinal(habitacion);
    if (_hayHabitacionFinal) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(habitacion, this.habitacionInicial);
      _or = _equals;
    }
    if (_or) {
      throw new UserException("Solo puede haber una habitacion final");
    } else {
      _xifexpression = this.habitacionFinal = habitacion;
    }
    return _xifexpression;
  }
  
  private boolean hayHabitacionInicial(final Habitacion habitacion) {
    return (!Objects.equal(this.habitacionInicial, null));
  }
  
  private boolean hayHabitacionFinal(final Habitacion habitacion) {
    return (!Objects.equal(this.habitacionFinal, null));
  }
  
  public boolean agregarHabitacion(final Habitacion habitacion) {
    boolean _xifexpression = false;
    boolean _contains = this.habitaciones.contains(habitacion);
    boolean _not = (!_contains);
    if (_not) {
      _xifexpression = this.habitaciones.add(habitacion);
    }
    return _xifexpression;
  }
  
  public boolean eliminarHabitacion(final Habitacion habitacion) {
    return this.habitaciones.remove(habitacion);
  }
  
  public boolean agregarItem(final Item item) {
    boolean _xifexpression = false;
    Boolean _noExisteItem = this.noExisteItem(item);
    if ((_noExisteItem).booleanValue()) {
      _xifexpression = this.items.add(item);
    }
    return _xifexpression;
  }
  
  private Boolean noExisteItem(final Item item) {
    for (final Item i : this.items) {
      String _nombre = i.getNombre();
      String _nombre_1 = item.getNombre();
      boolean _equals = Objects.equal(_nombre, _nombre_1);
      if (_equals) {
        throw new UserException("El item ya existe");
      }
    }
    return null;
  }
  
  @Pure
  public String getNombreLaberinto() {
    return this.nombreLaberinto;
  }
  
  public void setNombreLaberinto(final String nombreLaberinto) {
    this.nombreLaberinto = nombreLaberinto;
  }
  
  @Pure
  public List<Habitacion> getHabitaciones() {
    return this.habitaciones;
  }
  
  public void setHabitaciones(final List<Habitacion> habitaciones) {
    this.habitaciones = habitaciones;
  }
  
  @Pure
  public Habitacion getHabitacionInicial() {
    return this.habitacionInicial;
  }
  
  @Pure
  public Habitacion getHabitacionFinal() {
    return this.habitacionFinal;
  }
  
  @Pure
  public Usuario getAdministrador() {
    return this.administrador;
  }
  
  public void setAdministrador(final Usuario administrador) {
    this.administrador = administrador;
  }
  
  @Pure
  public List<Item> getItems() {
    return this.items;
  }
  
  public void setItems(final List<Item> items) {
    this.items = items;
  }
}
