package view;

import aplicationModel.GatoEncerradoAppModel;
import java.awt.Color;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableItems;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.RadioSelector;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Disponibilidad;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Laberinto;
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos;
import unq.edu.ar.UIS_Modelo.Usuario;
import view.AgregarAccionWindow;
import view.CrearHabitacionWindow;
import view.CrearLaberintoWindow;

@SuppressWarnings("all")
public class GatoEncerradoWindow extends SimpleWindow<GatoEncerradoAppModel> {
  public GatoEncerradoWindow(final WindowOwner owner, final GatoEncerradoAppModel model) {
    super(owner, model);
    this.setTitle("Aca hay gato encerrado...");
  }
  
  public void createContents(final Panel mainPanel) {
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(1000);
        GatoEncerradoAppModel _modelObject = GatoEncerradoWindow.this.getModelObject();
        Usuario _administrador = _modelObject.getAdministrador();
        String _nombreUsuario = _administrador.getNombreUsuario();
        String _plus = ("Hola " + _nombreUsuario);
        String _plus_1 = (_plus + "! Administrá todos tus laberintos");
        it.setText(_plus_1);
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(1000);
        it.setText("Aca hay gato encerrado...");
        it.setBackground(Color.RED);
        it.setHeight(30);
        it.setFontSize(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Label _label_2 = new Label(mainPanel);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
    final Panel panelOpciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout);
    final Panel panelLaberintos = new Panel(panelOpciones);
    Label _label_3 = new Label(panelLaberintos);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Laberintos");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_3);
    List<Laberinto> _list = new List<Laberinto>(panelLaberintos);
    final Procedure1<List<Laberinto>> _function_4 = new Procedure1<List<Laberinto>>() {
      public void apply(final List<Laberinto> it) {
        ObservableItems<Selector<Laberinto>, Laberinto, ListBuilder<Laberinto>> _items = it.items();
        Binding _spaceship = ArenaXtendExtensions.operator_spaceship(_items, "sistema.laberintos");
        PropertyAdapter _propertyAdapter = new PropertyAdapter(Laberinto.class, "nombreLaberinto");
        _spaceship.setAdapter(_propertyAdapter);
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "laberintoSeleccionado");
        it.setWidth(220);
        it.setHeight(220);
      }
    };
    ObjectExtensions.<List<Laberinto>>operator_doubleArrow(_list, _function_4);
    final Panel panelOpcionesLaberintos = new Panel(panelLaberintos);
    HorizontalLayout _horizontalLayout_1 = new HorizontalLayout();
    panelOpcionesLaberintos.setLayout(_horizontalLayout_1);
    Button _button = new Button(panelOpcionesLaberintos);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Laberinto");
        it.setFontSize(11);
        it.setWidth(140);
        final Action _function = new Action() {
          public void execute() {
            GatoEncerradoWindow.this.crearLaberinto();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_5);
    Button _button_1 = new Button(panelOpcionesLaberintos);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Eliminar Laberinto");
        it.setFontSize(11);
        it.setWidth(140);
        final Action _function = new Action() {
          public void execute() {
            GatoEncerradoWindow.this.eliminarLaberinto();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_6);
    final Panel panelHabitaciones = new Panel(panelOpciones);
    Label _label_4 = new Label(panelHabitaciones);
    final Procedure1<Label> _function_7 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_7);
    Label _label_5 = new Label(panelHabitaciones);
    final Procedure1<Label> _function_8 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre de Laberinto:");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_8);
    TextBox _textBox = new TextBox(panelHabitaciones);
    final Procedure1<TextBox> _function_9 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.<Object, ControlBuilder>bindValueToProperty("laberintoSeleccionado.nombreLaberinto");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_9);
    Label _label_6 = new Label(panelHabitaciones);
    final Procedure1<Label> _function_10 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_10);
    List<Habitacion> _list_1 = new List<Habitacion>(panelHabitaciones);
    final Procedure1<List<Habitacion>> _function_11 = new Procedure1<List<Habitacion>>() {
      public void apply(final List<Habitacion> it) {
        ObservableItems<Selector<Habitacion>, Habitacion, ListBuilder<Habitacion>> _items = it.items();
        Binding _spaceship = ArenaXtendExtensions.operator_spaceship(_items, "laberintoSeleccionado.habitaciones");
        PropertyAdapter _propertyAdapter = new PropertyAdapter(Habitacion.class, "nombreHabitacion");
        _spaceship.setAdapter(_propertyAdapter);
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "habitacionSeleccionada");
        it.setWidth(300);
        it.setHeight(200);
      }
    };
    ObjectExtensions.<List<Habitacion>>operator_doubleArrow(_list_1, _function_11);
    final Panel panelOpcionesHabitacion = new Panel(panelHabitaciones);
    HorizontalLayout _horizontalLayout_2 = new HorizontalLayout();
    panelOpcionesHabitacion.setLayout(_horizontalLayout_2);
    Button _button_2 = new Button(panelOpcionesHabitacion);
    final Procedure1<Button> _function_12 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Habitacion");
        it.setFontSize(11);
        it.setWidth(140);
        final Action _function = new Action() {
          public void execute() {
            GatoEncerradoWindow.this.crearHabitacion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_12);
    Button _button_3 = new Button(panelOpcionesHabitacion);
    final Procedure1<Button> _function_13 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Eliminar Habitacion");
        it.setFontSize(11);
        it.setWidth(140);
        final Action _function = new Action() {
          public void execute() {
            GatoEncerradoWindow.this.eliminarHabitacion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_13);
    final Panel panelAcciones = new Panel(panelOpciones);
    Label _label_7 = new Label(panelAcciones);
    final Procedure1<Label> _function_14 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.<Object, ControlBuilder>bindValueToProperty("habitacionSeleccionada.nombreHabitacion");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_7, _function_14);
    Label _label_8 = new Label(panelAcciones);
    final Procedure1<Label> _function_15 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_8, _function_15);
    TextBox _textBox_1 = new TextBox(panelAcciones);
    final Procedure1<TextBox> _function_16 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.<Object, ControlBuilder>bindValueToProperty("habitacionSeleccionada.nombreHabitacion");
        it.setHeight(15);
        it.setFontSize(10);
        it.setWidth(100);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox_1, _function_16);
    RadioSelector<Object> _radioSelector = new RadioSelector<Object>(panelAcciones);
    final Procedure1<RadioSelector<Object>> _function_17 = new Procedure1<RadioSelector<Object>>() {
      public void apply(final RadioSelector<Object> it) {
      }
    };
    ObjectExtensions.<RadioSelector<Object>>operator_doubleArrow(_radioSelector, _function_17);
    Label _label_9 = new Label(panelAcciones);
    final Procedure1<Label> _function_18 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setHeight(100);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_9, _function_18);
    Label _label_10 = new Label(panelAcciones);
    final Procedure1<Label> _function_19 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Acciones");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_10, _function_19);
    List<Habitacion> _list_2 = new List<Habitacion>(panelAcciones);
    final Procedure1<List<Habitacion>> _function_20 = new Procedure1<List<Habitacion>>() {
      public void apply(final List<Habitacion> it) {
        ObservableItems<Selector<Habitacion>, Habitacion, ListBuilder<Habitacion>> _items = it.items();
        ArenaXtendExtensions.operator_spaceship(_items, "habitacionSeleccionada.acciones");
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "accionSeleccionada");
        it.setWidth(300);
        it.setHeight(100);
      }
    };
    ObjectExtensions.<List<Habitacion>>operator_doubleArrow(_list_2, _function_20);
    final Panel panelAccionBotones = new Panel(panelAcciones);
    HorizontalLayout _horizontalLayout_3 = new HorizontalLayout();
    panelAccionBotones.setLayout(_horizontalLayout_3);
    Button _button_4 = new Button(panelAccionBotones);
    final Procedure1<Button> _function_21 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar Accion");
        it.setFontSize(11);
        it.setWidth(140);
        final Action _function = new Action() {
          public void execute() {
            GatoEncerradoWindow.this.crearAccion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_4, _function_21);
    Button _button_5 = new Button(panelAccionBotones);
    final Procedure1<Button> _function_22 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Eliminar Accion");
        it.setFontSize(11);
        it.setWidth(140);
        final Action _function = new Action() {
          public void execute() {
            GatoEncerradoWindow.this.eliminarAccion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_5, _function_22);
  }
  
  public boolean eliminarHabitacion() {
    boolean _xblockexpression = false;
    {
      GatoEncerradoAppModel _modelObject = this.getModelObject();
      _modelObject.validarHabitacion();
      GatoEncerradoAppModel _modelObject_1 = this.getModelObject();
      _xblockexpression = _modelObject_1.eliminarHabitacion();
    }
    return _xblockexpression;
  }
  
  public void crearLaberinto() {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    Usuario _administrador = _modelObject.getAdministrador();
    Laberinto _laberinto = new Laberinto("LaberintoNuevo", _administrador);
    CrearLaberintoWindow _crearLaberintoWindow = new CrearLaberintoWindow(this, _laberinto);
    this.openDialog(_crearLaberintoWindow);
  }
  
  public boolean eliminarLaberinto() {
    boolean _xblockexpression = false;
    {
      GatoEncerradoAppModel _modelObject = this.getModelObject();
      _modelObject.validarLaberinto();
      GatoEncerradoAppModel _modelObject_1 = this.getModelObject();
      _xblockexpression = _modelObject_1.eliminarLaberinto();
    }
    return _xblockexpression;
  }
  
  public boolean agregarLaberinto(final Laberinto laberinto) {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    return _modelObject.agregarLaberinto(laberinto);
  }
  
  public void validarLaberinto(final Laberinto laberinto) {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    SistemaDeLaberintos _sistema = _modelObject.getSistema();
    _sistema.validarLaberinto(laberinto);
  }
  
  public void crearHabitacion() {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    _modelObject.validarLaberinto();
    GatoEncerradoAppModel _modelObject_1 = this.getModelObject();
    Laberinto _laberintoSeleccionado = _modelObject_1.getLaberintoSeleccionado();
    Habitacion _habitacion = new Habitacion("HabitacionNueva", Disponibilidad.DISPONIBLE, _laberintoSeleccionado);
    CrearHabitacionWindow _crearHabitacionWindow = new CrearHabitacionWindow(this, _habitacion);
    this.openDialog(_crearHabitacionWindow);
  }
  
  public boolean agregarHabitacion(final Habitacion habitacion) {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    return _modelObject.agregarHabitacion(habitacion);
  }
  
  public void crearAccion() {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    _modelObject.validarHabitacion();
    GatoEncerradoAppModel _modelObject_1 = this.getModelObject();
    AgregarAccionWindow _agregarAccionWindow = new AgregarAccionWindow(this, _modelObject_1);
    this.openDialog(_agregarAccionWindow);
  }
  
  public boolean eliminarAccion() {
    boolean _xblockexpression = false;
    {
      GatoEncerradoAppModel _modelObject = this.getModelObject();
      _modelObject.validarAccion();
      GatoEncerradoAppModel _modelObject_1 = this.getModelObject();
      GatoEncerradoAppModel _modelObject_2 = this.getModelObject();
      Accion _accionSeleccionada = _modelObject_2.getAccionSeleccionada();
      _xblockexpression = _modelObject_1.eliminarAccion(_accionSeleccionada);
    }
    return _xblockexpression;
  }
  
  public void openDialog(final Dialog<?> dialog) {
    dialog.open();
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
  
  public Usuario getAdministrador() {
    GatoEncerradoAppModel _modelObject = this.getModelObject();
    return _modelObject.getAdministrador();
  }
  
  protected void addActions(final Panel arg0) {
  }
}
