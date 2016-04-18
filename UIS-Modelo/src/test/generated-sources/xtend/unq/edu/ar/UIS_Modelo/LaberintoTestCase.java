package unq.edu.ar.UIS_Modelo;

import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@SuppressWarnings("all")
public class LaberintoTestCase {
  private Laberinto laberinto;
  
  private Usuario administrador;
  
  private Habitacion habitacion1;
  
  private Habitacion habitacion2;
  
  private Habitacion habitacion3;
  
  @Before
  public void setup() {
    final Disponibilidad disponible = Disponibilidad.DISPONIBLE;
    Usuario _usuario = new Usuario("Pepe");
    this.administrador = _usuario;
    Laberinto _laberinto = new Laberinto();
    this.laberinto = _laberinto;
    Habitacion _habitacion = new Habitacion("Patio", disponible, this.laberinto);
    this.habitacion1 = _habitacion;
    Habitacion _habitacion_1 = new Habitacion("Catacumba", disponible, this.laberinto);
    this.habitacion2 = _habitacion_1;
    Habitacion _habitacion_2 = new Habitacion("Catacumba", disponible, this.laberinto);
    this.habitacion3 = _habitacion_2;
  }
  
  @Test
  public void testAgregarHabitacion() {
    this.laberinto.agregarHabitacion(this.habitacion1);
    List<Habitacion> _habitaciones = this.laberinto.getHabitaciones();
    final int actual = _habitaciones.size();
    final int expected = 1;
    Assert.assertEquals(expected, actual);
    List<Habitacion> _habitaciones_1 = this.laberinto.getHabitaciones();
    boolean _contains = _habitaciones_1.contains(this.habitacion1);
    Assert.assertTrue(_contains);
  }
  
  @Test
  public void testEliminarHabitacion() {
    this.laberinto.agregarHabitacion(this.habitacion1);
    this.laberinto.eliminarHabitacion(this.habitacion1);
    List<Habitacion> _habitaciones = this.laberinto.getHabitaciones();
    final int actual = _habitaciones.size();
    final int expected = 0;
    Assert.assertEquals(expected, actual);
    List<Habitacion> _habitaciones_1 = this.laberinto.getHabitaciones();
    boolean _contains = _habitaciones_1.contains(this.habitacion1);
    Assert.assertFalse(_contains);
  }
}
