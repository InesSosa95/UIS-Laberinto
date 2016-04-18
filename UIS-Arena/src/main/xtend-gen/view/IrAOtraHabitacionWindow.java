package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import unq.edu.ar.UIS_Modelo.Accion;
import unq.edu.ar.UIS_Modelo.Habitacion;

@SuppressWarnings("all")
public class IrAOtraHabitacionWindow extends MainWindow<Accion> {
  public IrAOtraHabitacionWindow(final Accion model) {
    super(model);
  }
  
  public void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("\t\t\t\t \t                                     \tSelecciona una habitacion a la cual ir");
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setHeight(10);
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
    Selector<Habitacion> _selector = new Selector<Habitacion>(mainPanel);
    final Procedure1<Selector<Habitacion>> _function_2 = new Procedure1<Selector<Habitacion>>() {
      public void apply(final Selector<Habitacion> it) {
        it.setWidth(300);
        it.setHeight(100);
      }
    };
    ObjectExtensions.<Selector<Habitacion>>operator_doubleArrow(_selector, _function_2);
    final Panel panelOpciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            IrAOtraHabitacionWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_3);
    Label _label_2 = new Label(panelOpciones);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_4);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            IrAOtraHabitacionWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_5);
  }
}
