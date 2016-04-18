package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.bindings.ObservableValue;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Control;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.arena.xtend.ArenaXtendExtensions;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import unq.edu.ar.UIS_Modelo.Habitacion;
import view.GatoEncerradoWindow;

@SuppressWarnings("all")
public class CrearHabitacionWindow extends TransactionalDialog<Habitacion> {
  public CrearHabitacionWindow(final WindowOwner owner, final Habitacion model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.setTitle("Creando Habitacion");
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Ingrese un nombre para su habitacion");
        it.setWidth(230);
        it.setHeight(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function_1 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        ObservableValue<Control, ControlBuilder> _value = it.<ControlBuilder>value();
        ArenaXtendExtensions.operator_spaceship(_value, "nombreHabitacion");
        it.setWidth(100);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_1);
  }
  
  protected void addActions(final Panel actions) {
    Button _button = new Button(actions);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            CrearHabitacionWindow.this.agregarHabitacion();
          }
        };
        it.onClick(_function);
        it.setAsDefault();
        it.disableOnError();
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Button _button_1 = new Button(actions);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        final Action _function = new Action() {
          public void execute() {
            CrearHabitacionWindow.this.cancel();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
  }
  
  public GatoEncerradoWindow agregarHabitacion() {
    WindowOwner _owner = this.getOwner();
    final Procedure1<GatoEncerradoWindow> _function = new Procedure1<GatoEncerradoWindow>() {
      public void apply(final GatoEncerradoWindow it) {
        Habitacion _modelObject = CrearHabitacionWindow.this.getModelObject();
        it.agregarHabitacion(_modelObject);
      }
    };
    return ObjectExtensions.<GatoEncerradoWindow>operator_doubleArrow(
      ((GatoEncerradoWindow) _owner), _function);
  }
}
