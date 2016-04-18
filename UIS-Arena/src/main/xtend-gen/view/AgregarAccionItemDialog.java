package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.AccionAgarrarItem;
import unq.edu.ar.UIS_Modelo.AccionMoverDeHabitacion;
import unq.edu.ar.UIS_Modelo.Habitacion;
import view.AccionAgarrarItemDialog;
import view.AccionCambiarHabitacionDialog;

@SuppressWarnings("all")
public class AgregarAccionItemDialog extends Dialog<Accion> {
  public AgregarAccionItemDialog(final WindowOwner owner, final Accion model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Selecciona una acción a agregar:");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    final Panel panelOpciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout);
    Label _label_2 = new Label(panelOpciones);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_2);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar accion de Ir a otra habitacion");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AgregarAccionItemDialog.this.cambiarHabitacion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_3);
    Label _label_3 = new Label(panelOpciones);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_4);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar accion de Agarrar un elemento");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AgregarAccionItemDialog.this.agarrarItem();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_5);
    Label _label_4 = new Label(panelOpciones);
    final Procedure1<Label> _function_6 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_6);
  }
  
  public void cambiarHabitacion() {
    this.close();
    WindowOwner _owner = this.getOwner();
    Accion _modelObject = this.getModelObject();
    Habitacion _habitacionActual = _modelObject.getHabitacionActual();
    AccionMoverDeHabitacion _accionMoverDeHabitacion = new AccionMoverDeHabitacion(_habitacionActual);
    AccionCambiarHabitacionDialog _accionCambiarHabitacionDialog = new AccionCambiarHabitacionDialog(_owner, _accionMoverDeHabitacion);
    this.openDialog(_accionCambiarHabitacionDialog);
  }
  
  public void agarrarItem() {
    this.close();
    WindowOwner _owner = this.getOwner();
    Accion _modelObject = this.getModelObject();
    Habitacion _habitacionActual = _modelObject.getHabitacionActual();
    AccionAgarrarItem _accionAgarrarItem = new AccionAgarrarItem(_habitacionActual);
    AccionAgarrarItemDialog _accionAgarrarItemDialog = new AccionAgarrarItemDialog(_owner, _accionAgarrarItem);
    this.openDialog(_accionAgarrarItemDialog);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    dialog.open();
  }
}
