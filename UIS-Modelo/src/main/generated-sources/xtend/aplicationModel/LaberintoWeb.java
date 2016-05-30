package aplicationModel;

import java.util.List;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.Laberinto;

@SuppressWarnings("all")
public class LaberintoWeb {
  private String nombre;
  
  private String path;
  
  private List<Habitacion> habitaciones;
  
  private List<Item> items;
  
  private String habitacionInicial;
  
  private String habitacionFinal;
  
  public LaberintoWeb(final Laberinto lab, final String p) {
    String _nombreLaberinto = lab.getNombreLaberinto();
    this.nombre = _nombreLaberinto;
    this.path = p;
    List<Habitacion> _habitaciones = lab.getHabitaciones();
    this.habitaciones = _habitaciones;
    List<Item> _items = lab.getItems();
    this.items = _items;
    Habitacion _habitacionInicial = lab.getHabitacionInicial();
    String _string = _habitacionInicial.toString();
    this.habitacionInicial = _string;
    Habitacion _habitacionFinal = lab.getHabitacionFinal();
    String _string_1 = _habitacionFinal.toString();
    this.habitacionFinal = _string_1;
  }
}
