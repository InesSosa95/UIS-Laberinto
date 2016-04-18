package unq.edu.ar.UIS_Modelo;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class Laberinto {
  private SistemaDeLaberintos sistema;
  
  private String nombreLaberinto;
  
  private List<Habitacion> habitaciones;
  
  private Habitacion habitacionInicial;
  
  private Habitacion habitacionFinal;
  
  private Usuario administrador;
  
  private List<Item> items;
  
  public Laberinto() {
    this.nombreLaberinto = "estoNoDeberiaPasar";
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.habitaciones = _newArrayList;
    ArrayList<Item> _newArrayList_1 = CollectionLiterals.<Item>newArrayList();
    this.items = _newArrayList_1;
    this.habitacionInicial = null;
    this.habitacionFinal = null;
  }
  
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
  
  public Laberinto(final String nombre, final Usuario admin, final SistemaDeLaberintos sistema) {
    this.nombreLaberinto = nombre;
    this.administrador = admin;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.habitaciones = _newArrayList;
    ArrayList<Item> _newArrayList_1 = CollectionLiterals.<Item>newArrayList();
    this.items = _newArrayList_1;
    this.habitacionInicial = null;
    this.habitacionFinal = null;
    this.sistema = sistema;
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
    boolean _xblockexpression = false;
    {
      this.validarHabitacion(habitacion);
      _xblockexpression = this.habitaciones.add(habitacion);
    }
    return _xblockexpression;
  }
  
  public boolean eliminarHabitacion(final Habitacion habitacion) {
    return this.habitaciones.remove(habitacion);
  }
  
  public boolean eliminarHabitaciones() {
    return CollectionExtensions.<Habitacion>removeAll(this.habitaciones);
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
  
  public void validarHabitacion(final Habitacion habitacion) {
    String _nombreHabitacion = habitacion.getNombreHabitacion();
    boolean _esVacio = this.esVacio(_nombreHabitacion);
    if (_esVacio) {
      throw new UserException("El nombre de la habitacion no es valido");
    }
    for (final Habitacion h : this.habitaciones) {
      String _nombreHabitacion_1 = h.getNombreHabitacion();
      String _nombreHabitacion_2 = habitacion.getNombreHabitacion();
      boolean _equals = Objects.equal(_nombreHabitacion_1, _nombreHabitacion_2);
      if (_equals) {
        throw new UserException("Ya existe una habitacion con ese nombre");
      }
    }
  }
  
  public boolean esVacio(final String string) {
    char[] s = string.toCharArray();
    for (final char each : s) {
      char[] _charArray = " ".toCharArray();
      char _get = _charArray[0];
      boolean _notEquals = (each != _get);
      if (_notEquals) {
        return false;
      }
    }
    return true;
  }
  
  @Pure
  public SistemaDeLaberintos getSistema() {
    return this.sistema;
  }
  
  public void setSistema(final SistemaDeLaberintos sistema) {
    this.sistema = sistema;
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
