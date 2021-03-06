package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.utils.TransactionalAndObservable;
import unq.edu.ar.UIS_Modelo.Inventario;
import unq.edu.ar.UIS_Modelo.Laberinto;

@Accessors
@TransactionalAndObservable
@SuppressWarnings("all")
public class Usuario {
  private String nombreUsuario;
  
  private List<Laberinto> laberintosJugados;
  
  private List<Laberinto> laberintosAbandonados;
  
  private Inventario inventario;
  
  public Usuario(final String nombre) {
    this.nombreUsuario = nombre;
    ArrayList<Laberinto> _newArrayList = CollectionLiterals.<Laberinto>newArrayList();
    this.laberintosJugados = _newArrayList;
    ArrayList<Laberinto> _newArrayList_1 = CollectionLiterals.<Laberinto>newArrayList();
    this.laberintosAbandonados = _newArrayList_1;
  }
  
  @Pure
  public String getNombreUsuario() {
    return this.nombreUsuario;
  }
  
  public void setNombreUsuario(final String nombreUsuario) {
    this.nombreUsuario = nombreUsuario;
  }
  
  @Pure
  public List<Laberinto> getLaberintosJugados() {
    return this.laberintosJugados;
  }
  
  public void setLaberintosJugados(final List<Laberinto> laberintosJugados) {
    this.laberintosJugados = laberintosJugados;
  }
  
  @Pure
  public List<Laberinto> getLaberintosAbandonados() {
    return this.laberintosAbandonados;
  }
  
  public void setLaberintosAbandonados(final List<Laberinto> laberintosAbandonados) {
    this.laberintosAbandonados = laberintosAbandonados;
  }
  
  @Pure
  public Inventario getInventario() {
    return this.inventario;
  }
  
  public void setInventario(final Inventario inventario) {
    this.inventario = inventario;
  }
}
