package unq.edu.ar.UIS_Modelo;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class Inventario {
  private Integer idInventario;
  
  private Habitacion habitacion;
  
  private Usuario usuario;
  
  private List<String> items;
  
  public Inventario(final Habitacion habitacion) {
    this.habitacion = habitacion;
    this.usuario = this.usuario;
  }
  
  public boolean agregarItem(final String item) {
    boolean _xifexpression = false;
    int _size = this.items.size();
    boolean _lessEqualsThan = (_size <= 15);
    if (_lessEqualsThan) {
      _xifexpression = this.items.add(item);
    } else {
      throw new UserException("El inventario esta lleno");
    }
    return _xifexpression;
  }
  
  public boolean eliminarItem(final String item) {
    return this.items.remove(item);
  }
  
  @Pure
  public Integer getIdInventario() {
    return this.idInventario;
  }
  
  public void setIdInventario(final Integer idInventario) {
    this.idInventario = idInventario;
  }
  
  @Pure
  public Habitacion getHabitacion() {
    return this.habitacion;
  }
  
  public void setHabitacion(final Habitacion habitacion) {
    this.habitacion = habitacion;
  }
  
  @Pure
  public Usuario getUsuario() {
    return this.usuario;
  }
  
  public void setUsuario(final Usuario usuario) {
    this.usuario = usuario;
  }
  
  @Pure
  public List<String> getItems() {
    return this.items;
  }
  
  public void setItems(final List<String> items) {
    this.items = items;
  }
}
