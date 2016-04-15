package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import unq.edu.ar.UIS_Modelo.Habitacion;
import view.GatoEncerradoWindow;

@SuppressWarnings("all")
public class EliminarHabitacionWindow extends TransactionalDialog<Habitacion> {
  public EliminarHabitacionWindow(final WindowOwner owner, final Habitacion model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.setTitle("Eliminando Habitacion");
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        Habitacion _modelObject = EliminarHabitacionWindow.this.getModelObject();
        String _nombreHabitacion = _modelObject.getNombreHabitacion();
        String _plus = ("Seguro que Desea Eliminar la Habitacion: < " + _nombreHabitacion);
        String _plus_1 = (_plus + " > ?");
        it.setText(_plus_1);
        it.setWidth(350);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    final Panel panelOpciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        it.setFontSize(8);
        it.setWidth(170);
        final Action _function = new Action() {
          public void execute() {
            EliminarHabitacionWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Eliminar");
        it.setWidth(170);
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            EliminarHabitacionWindow.this.destruirHabitacion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
  }
  
  public void destruirHabitacion() {
    WindowOwner _owner = this.getOwner();
    GatoEncerradoWindow window = ((GatoEncerradoWindow) _owner);
    this.close();
    Habitacion _modelObject = this.getModelObject();
    window.destruirHabitacion(_modelObject);
  }
}
