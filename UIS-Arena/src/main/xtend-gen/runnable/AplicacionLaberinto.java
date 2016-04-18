package runnable;

import aplicationModel.GatoEncerradoAppModel;
import java.util.List;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.Application;
import org.uqbar.arena.windows.Window;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos;
import unq.edu.ar.UIS_Modelo.Usuario;
import view.GatoEncerradoWindow;

@SuppressWarnings("all")
public class AplicacionLaberinto extends Application {
  public Window<?> createMainWindow() {
    GatoEncerradoWindow _xblockexpression = null;
    {
      GatoEncerradoAppModel gatoEncerradoModel = new GatoEncerradoAppModel();
      Usuario _administrador = gatoEncerradoModel.getAdministrador();
      final SistemaDeLaberintos sistema = new SistemaDeLaberintos(_administrador);
      Usuario _administrador_1 = gatoEncerradoModel.getAdministrador();
      final Laberinto laberinto1 = new Laberinto("Casa embrujada", _administrador_1, sistema);
      Usuario _administrador_2 = gatoEncerradoModel.getAdministrador();
      final Laberinto laberinto2 = new Laberinto("Museo en la noche", _administrador_2, sistema);
      Usuario _administrador_3 = gatoEncerradoModel.getAdministrador();
      final Laberinto laberinto3 = new Laberinto("Pueblo Fantasma", _administrador_3, sistema);
      Usuario _administrador_4 = gatoEncerradoModel.getAdministrador();
      final Laberinto laberinto4 = new Laberinto("Escape del Cementerio", _administrador_4, sistema);
      Habitacion habitacion1 = new Habitacion("Recibidor", Disponibilidad.DISPONIBLE, laberinto1);
      Habitacion habitacion2 = new Habitacion("Comedor", Disponibilidad.NO_DISPONIBLE, laberinto1);
      Habitacion habitacion3 = new Habitacion("Cocina", Disponibilidad.DISPONIBLE, laberinto1);
      Habitacion habitacion4 = new Habitacion("Sala de Pinturas", Disponibilidad.DISPONIBLE, laberinto2);
      Habitacion habitacion5 = new Habitacion("Fosiles Prehistoricos", Disponibilidad.DISPONIBLE, laberinto2);
      Habitacion habitacion6 = new Habitacion("Muñecos de Cera", Disponibilidad.DISPONIBLE, laberinto2);
      Habitacion habitacion7 = new Habitacion("Plaza Central", Disponibilidad.DISPONIBLE, laberinto3);
      Habitacion habitacion8 = new Habitacion("Casa abandonada", Disponibilidad.DISPONIBLE, laberinto3);
      Habitacion habitacion9 = new Habitacion("Bosque", Disponibilidad.DISPONIBLE, laberinto3);
      Habitacion habitacion10 = new Habitacion("Calle central", Disponibilidad.DISPONIBLE, laberinto4);
      Habitacion habitacion11 = new Habitacion("Catacumba", Disponibilidad.DISPONIBLE, laberinto4);
      Habitacion habitacion12 = new Habitacion("Puerta de Entrada", Disponibilidad.NO_DISPONIBLE, laberinto4);
      final Accion accion1 = new Accion(habitacion1);
      final Accion accion2 = new Accion(habitacion1);
      final Accion accion3 = new Accion(habitacion1);
      final Accion accion4 = new Accion(habitacion1);
      final Accion accion5 = new Accion(habitacion2);
      final Accion accion6 = new Accion(habitacion2);
      final Accion accion7 = new Accion(habitacion2);
      final Accion accion8 = new Accion(habitacion2);
      final Accion accion9 = new Accion(habitacion3);
      final Accion accion10 = new Accion(habitacion3);
      final Accion accion11 = new Accion(habitacion3);
      final Accion accion12 = new Accion(habitacion3);
      final Accion accion13 = new Accion(habitacion3);
      final Accion accion14 = new Accion(habitacion4);
      final Accion accion15 = new Accion(habitacion4);
      final Accion accion16 = new Accion(habitacion4);
      final Accion accion17 = new Accion(habitacion4);
      final Accion accion18 = new Accion(habitacion4);
      final Accion accion19 = new Accion(habitacion4);
      final Accion accion20 = new Accion(habitacion5);
      final Accion accion21 = new Accion(habitacion5);
      final Accion accion22 = new Accion(habitacion5);
      final Accion accion23 = new Accion(habitacion5);
      final Accion accion24 = new Accion(habitacion5);
      List<Accion> _acciones = habitacion1.getAcciones();
      final Procedure1<List<Accion>> _function = new Procedure1<List<Accion>>() {
        public void apply(final List<Accion> it) {
          it.add(accion1);
          it.add(accion2);
          it.add(accion3);
          it.add(accion4);
        }
      };
      ObjectExtensions.<List<Accion>>operator_doubleArrow(_acciones, _function);
      List<Accion> _acciones_1 = habitacion2.getAcciones();
      final Procedure1<List<Accion>> _function_1 = new Procedure1<List<Accion>>() {
        public void apply(final List<Accion> it) {
          it.add(accion5);
          it.add(accion6);
          it.add(accion7);
          it.add(accion8);
        }
      };
      ObjectExtensions.<List<Accion>>operator_doubleArrow(_acciones_1, _function_1);
      List<Accion> _acciones_2 = habitacion3.getAcciones();
      final Procedure1<List<Accion>> _function_2 = new Procedure1<List<Accion>>() {
        public void apply(final List<Accion> it) {
          it.add(accion9);
          it.add(accion10);
          it.add(accion11);
          it.add(accion12);
          it.add(accion13);
        }
      };
      ObjectExtensions.<List<Accion>>operator_doubleArrow(_acciones_2, _function_2);
      List<Accion> _acciones_3 = habitacion4.getAcciones();
      final Procedure1<List<Accion>> _function_3 = new Procedure1<List<Accion>>() {
        public void apply(final List<Accion> it) {
          it.add(accion14);
          it.add(accion15);
          it.add(accion16);
          it.add(accion17);
          it.add(accion18);
          it.add(accion19);
        }
      };
      ObjectExtensions.<List<Accion>>operator_doubleArrow(_acciones_3, _function_3);
      List<Accion> _acciones_4 = habitacion5.getAcciones();
      final Procedure1<List<Accion>> _function_4 = new Procedure1<List<Accion>>() {
        public void apply(final List<Accion> it) {
          it.add(accion20);
          it.add(accion21);
          it.add(accion22);
          it.add(accion23);
          it.add(accion24);
        }
      };
      ObjectExtensions.<List<Accion>>operator_doubleArrow(_acciones_4, _function_4);
      laberinto1.agregarHabitacion(habitacion1);
      laberinto1.agregarHabitacion(habitacion2);
      laberinto1.agregarHabitacion(habitacion3);
      laberinto2.agregarHabitacion(habitacion4);
      laberinto2.agregarHabitacion(habitacion5);
      laberinto2.agregarHabitacion(habitacion6);
      laberinto3.agregarHabitacion(habitacion7);
      laberinto3.agregarHabitacion(habitacion8);
      laberinto3.agregarHabitacion(habitacion9);
      laberinto4.agregarHabitacion(habitacion10);
      laberinto4.agregarHabitacion(habitacion11);
      laberinto4.agregarHabitacion(habitacion12);
      gatoEncerradoModel.setSistema(sistema);
      SistemaDeLaberintos _sistema = gatoEncerradoModel.getSistema();
      List<Laberinto> _laberintos = _sistema.getLaberintos();
      final Procedure1<List<Laberinto>> _function_5 = new Procedure1<List<Laberinto>>() {
        public void apply(final List<Laberinto> it) {
          it.add(laberinto1);
          it.add(laberinto2);
          it.add(laberinto3);
          it.add(laberinto4);
        }
      };
      ObjectExtensions.<List<Laberinto>>operator_doubleArrow(_laberintos, _function_5);
      _xblockexpression = new GatoEncerradoWindow(this, gatoEncerradoModel);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    AplicacionLaberinto _aplicacionLaberinto = new AplicacionLaberinto();
    _aplicacionLaberinto.start();
  }
}
