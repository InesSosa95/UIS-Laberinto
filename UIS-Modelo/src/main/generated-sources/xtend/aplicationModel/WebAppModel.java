package aplicationModel;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.Usuario;

@SuppressWarnings("all")
public class WebAppModel {
  private Usuario usuario;
  
  public WebAppModel(final Usuario user) {
    this.usuario = user;
  }
  
  public ArrayList<Laberinto> laberintos() {
    ArrayList<Laberinto> _xblockexpression = null;
    {
      ArrayList<Laberinto> laberintos = CollectionLiterals.<Laberinto>newArrayList();
      final Item cuchillo = new Item("Cuchillo");
      final Item pala = new Item("Pala");
      final Item llaveMaestra = new Item("Llave maestra");
      final Item media = new Item("Media");
      final Item clip = new Item("Clip");
      final Item lupa = new Item("Lupa");
      final Item cepillo = new Item("Cepillo");
      final Laberinto laberinto1 = new Laberinto("Castillo", this.usuario);
      final Laberinto laberinto2 = new Laberinto("Hospital abandonado", this.usuario);
      final Laberinto laberinto3 = new Laberinto("Bosque", this.usuario);
      final Habitacion cocina = new Habitacion("Comedor", Disponibilidad.DISPONIBLE, laberinto1);
      final Habitacion patio = new Habitacion("Patio", Disponibilidad.NO_DISPONIBLE, laberinto1);
      final Habitacion salaUrgencias = new Habitacion("Sala de Urgencias", Disponibilidad.DISPONIBLE, laberinto2);
      final Habitacion recepcion = new Habitacion("Recepcion", Disponibilidad.DISPONIBLE, laberinto2);
      final Habitacion claro = new Habitacion("Claro", Disponibilidad.DISPONIBLE, laberinto3);
      final Habitacion sotobosque = new Habitacion("Sotobosque", Disponibilidad.NO_DISPONIBLE, laberinto3);
      final Procedure1<Laberinto> _function = new Procedure1<Laberinto>() {
        public void apply(final Laberinto it) {
          it.agregarItem(cuchillo);
          it.agregarItem(pala);
          it.agregarItem(llaveMaestra);
          it.agregarHabitacion(cocina);
          it.agregarHabitacion(patio);
          it.setHabitacionInicial(cocina);
          it.setHabitacionFinal(patio);
        }
      };
      ObjectExtensions.<Laberinto>operator_doubleArrow(laberinto1, _function);
      final Procedure1<Laberinto> _function_1 = new Procedure1<Laberinto>() {
        public void apply(final Laberinto it) {
          it.agregarItem(media);
          it.agregarItem(clip);
          it.agregarHabitacion(salaUrgencias);
          it.agregarHabitacion(recepcion);
          it.setHabitacionInicial(recepcion);
          it.setHabitacionFinal(salaUrgencias);
        }
      };
      ObjectExtensions.<Laberinto>operator_doubleArrow(laberinto2, _function_1);
      final Procedure1<Laberinto> _function_2 = new Procedure1<Laberinto>() {
        public void apply(final Laberinto it) {
          it.agregarItem(lupa);
          it.agregarItem(cepillo);
        }
      };
      ObjectExtensions.<Laberinto>operator_doubleArrow(laberinto3, _function_2);
      final Procedure1<ArrayList<Laberinto>> _function_3 = new Procedure1<ArrayList<Laberinto>>() {
        public void apply(final ArrayList<Laberinto> it) {
          it.add(laberinto3);
        }
      };
      _xblockexpression = ObjectExtensions.<ArrayList<Laberinto>>operator_doubleArrow(laberintos, _function_3);
    }
    return _xblockexpression;
  }
}
