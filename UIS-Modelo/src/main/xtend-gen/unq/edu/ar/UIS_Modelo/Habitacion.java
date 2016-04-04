package unq.edu.ar.UIS_Modelo;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pure;
import org.uqbar.commons.model.UserException;
import org.uqbar.commons.utils.Observable;

@Accessors
@Observable
@SuppressWarnings("all")
public class Habitacion {
  private String id;
  
  private List<Habitacion> vecinas;
  
  private List<String> itemUtilizable;
  
  private String itemDisponible;
  
  private Boolean esFinal;
  
  private Boolean esInicial;
  
  public Habitacion(final String id, final Boolean esFinal, final Boolean esInicial) {
    this.id = id;
    ArrayList<Habitacion> _newArrayList = CollectionLiterals.<Habitacion>newArrayList();
    this.vecinas = _newArrayList;
    ArrayList<String> _newArrayList_1 = CollectionLiterals.<String>newArrayList();
    this.itemUtilizable = _newArrayList_1;
    this.esFinal = esFinal;
    if ((((esFinal).booleanValue() == true) && ((esInicial).booleanValue() == true))) {
      throw new UserException("La habitacion no puede ser inicial y final al mismo tiempo");
    }
  }
  
  public boolean esHabitacionVecina(final Habitacion habitacion) {
    return this.vecinas.contains(habitacion);
  }
  
  @Pure
  public String getId() {
    return this.id;
  }
  
  public void setId(final String id) {
    this.id = id;
  }
  
  @Pure
  public List<Habitacion> getVecinas() {
    return this.vecinas;
  }
  
  public void setVecinas(final List<Habitacion> vecinas) {
    this.vecinas = vecinas;
  }
  
  @Pure
  public List<String> getItemUtilizable() {
    return this.itemUtilizable;
  }
  
  public void setItemUtilizable(final List<String> itemUtilizable) {
    this.itemUtilizable = itemUtilizable;
  }
  
  @Pure
  public String getItemDisponible() {
    return this.itemDisponible;
  }
  
  public void setItemDisponible(final String itemDisponible) {
    this.itemDisponible = itemDisponible;
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
}
