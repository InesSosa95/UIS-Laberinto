package unq.edu.ar.UIS_Modelo;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.Laberinto;

@SuppressWarnings("all")
public class HabitacionTestCase {
  private Habitacion habitacion1;
  
  private Habitacion habitacion2;
  
  private Laberinto laberinto1;
  
  private Accion accion;
  
  private Item item;
  
  @Before
  public void setUp() {
    final Disponibilidad disponible = Disponibilidad.DISPONIBLE;
    Habitacion _habitacion = new Habitacion("cocina", disponible, this.laberinto1);
    this.habitacion1 = _habitacion;
    Habitacion _habitacion_1 = new Habitacion("Baño", disponible, this.laberinto1);
    this.habitacion2 = _habitacion_1;
    Accion _accion = new Accion(this.habitacion1);
    this.accion = _accion;
    Item _item = new Item("Llave maestra");
    this.item = _item;
  }
  
  @Test
  public void testValues() {
    final String nombre = this.habitacion1.getNombreHabitacion();
    List<Habitacion> _vecinas = this.habitacion1.getVecinas();
    final int actual = _vecinas.size();
    final int expected = 0;
    Assert.assertEquals(expected, actual);
    Assert.assertEquals("cocina", nombre);
  }
  
  @Test
  public void testAgregarVecina() {
    this.habitacion1.agregarVecina(this.habitacion2);
    final boolean vecinas = this.habitacion1.esHabitacionVecina(this.habitacion2);
    List<Habitacion> _vecinas = this.habitacion1.getVecinas();
    final int actual = _vecinas.size();
    final int expected = 1;
    Assert.assertEquals(expected, actual);
    Assert.assertTrue(vecinas);
  }
  
  @Test
  public void testEliminarVecina() {
    this.habitacion1.agregarVecina(this.habitacion2);
    List<Habitacion> _vecinas = this.habitacion1.getVecinas();
    _vecinas.remove(this.habitacion2);
    final boolean esVecina = this.habitacion1.esHabitacionVecina(this.habitacion2);
    List<Habitacion> _vecinas_1 = this.habitacion1.getVecinas();
    final int actual = _vecinas_1.size();
    final int expected = 0;
    Assert.assertEquals(expected, actual);
    Assert.assertFalse(esVecina);
  }
  
  @Test
  public void testAgregarAccion() {
    this.habitacion1.agregarAccion(this.accion);
    List<Accion> _acciones = this.habitacion1.getAcciones();
    final int actual = _acciones.size();
    final int expected = 1;
    List<Accion> _acciones_1 = this.habitacion1.getAcciones();
    final boolean tieneAccion = _acciones_1.contains(this.accion);
    Assert.assertEquals(expected, actual);
    Assert.assertTrue(tieneAccion);
  }
  
  @Test
  public void testEliminarLaberinto() {
    this.habitacion1.agregarAccion(this.accion);
    this.habitacion1.eliminarAccion(this.accion);
    List<Accion> _acciones = this.habitacion1.getAcciones();
    final int actual = _acciones.size();
    final int expected = 0;
    List<Accion> _acciones_1 = this.habitacion1.getAcciones();
    final boolean tieneAccion = _acciones_1.contains(this.accion);
    Assert.assertEquals(expected, actual);
    Assert.assertFalse(tieneAccion);
  }
  
  @Test
  public void testAgregarItem() {
    this.habitacion1.agregarItem(this.item);
    List<Item> _itemsDisponibles = this.habitacion1.getItemsDisponibles();
    final int actual = _itemsDisponibles.size();
    final int expected = 1;
    Assert.assertEquals(expected, actual);
    List<Item> _itemsDisponibles_1 = this.habitacion1.getItemsDisponibles();
    boolean _contains = _itemsDisponibles_1.contains(this.item);
    Assert.assertTrue(_contains);
  }
}
