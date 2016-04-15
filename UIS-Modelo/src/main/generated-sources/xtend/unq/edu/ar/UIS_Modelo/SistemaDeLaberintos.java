package unq.edu.ar.UIS_Modelo;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@Observable
@SuppressWarnings("all")
public class SistemaDeLaberintos {
  private List<Laberinto> laberintos;
  
  private List<Usuario> usuarios;
  
  private Usuario administrador;
  
  public SistemaDeLaberintos(final Usuario admin) {
    ArrayList<Laberinto> _newArrayList = CollectionLiterals.<Laberinto>newArrayList();
    this.laberintos = _newArrayList;
    ArrayList<Usuario> _newArrayList_1 = CollectionLiterals.<Usuario>newArrayList();
    this.usuarios = _newArrayList_1;
    this.administrador = admin;
  }
  
  public void validarLaberinto(final Laberinto laberinto) {
    String _nombreLaberinto = laberinto.getNombreLaberinto();
    boolean _esVacio = this.esVacio(_nombreLaberinto);
    if (_esVacio) {
      throw new UserException("El nombre del laberinto no es valido");
    }
    for (final Laberinto l : this.laberintos) {
      String _nombreLaberinto_1 = l.getNombreLaberinto();
      String _nombreLaberinto_2 = laberinto.getNombreLaberinto();
      boolean _equals = Objects.equal(_nombreLaberinto_1, _nombreLaberinto_2);
      if (_equals) {
        throw new UserException("Ya existe un laberinto con ese nombre");
      }
    }
  }
  
  public boolean agregarLaberinto(final Laberinto laberinto) {
    return this.laberintos.add(laberinto);
  }
  
  public boolean eliminarLaberinto(final Laberinto laberinto) {
    return this.laberintos.remove(laberinto);
  }
  
  public boolean agregarUsuario(final Usuario usuario) {
    return this.usuarios.add(usuario);
  }
  
  public void eliminarUsuario(final Usuario usuario) {
    boolean _equals = Objects.equal(this.administrador, usuario);
    if (_equals) {
      throw new UserException("No puede eliminar al administrador");
    }
  }
  
  public Usuario cambiarAdministrador(final Usuario usuario) {
    return this.administrador = usuario;
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
  
  public void setLaberintoSeleccionado(final Laberinto laberinto) {
    this.setLaberintoSeleccionado(laberinto);
    this.actualizar();
  }
  
  public Object actualizar() {
    return null;
  }
  
  @Pure
  public List<Laberinto> getLaberintos() {
    return this.laberintos;
  }
  
  public void setLaberintos(final List<Laberinto> laberintos) {
    this.laberintos = laberintos;
  }
  
  @Pure
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
  
  @Pure
  public Usuario getAdministrador() {
    return this.administrador;
  }
  
  public void setAdministrador(final Usuario administrador) {
    this.administrador = administrador;
  }
}
