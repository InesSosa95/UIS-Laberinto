package unq.edu.ar.UIS_Modelo;

import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class SistemaDeLaberintos {
  private List<Laberinto> laberintos;
  
  private Laberinto laberintoSeleccionado;
  
  private List<Usuario> usuarios;
  
  private Usuario admin;
  
  public Object agregarLaberinto(final String nombre) {
    throw new Error("Unresolved compilation problems:"
      + "\nmissing \')\' at \'LaberintoDeNombre\'"
      + "\nmismatched input \')\' expecting \'}\'"
      + "\nThe method or field contiene is undefined for the type List<Laberinto>"
      + "\nThe method LaberintoDeNombre(String) is undefined"
      + "\n! cannot be resolved");
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
  public List<Usuario> getUsuarios() {
    return this.usuarios;
  }
  
  public void setUsuarios(final List<Usuario> usuarios) {
    this.usuarios = usuarios;
  }
  
  @Pure
  public Usuario getAdmin() {
    return this.admin;
  }
  
  public void setAdmin(final Usuario admin) {
    this.admin = admin;
  }
}
