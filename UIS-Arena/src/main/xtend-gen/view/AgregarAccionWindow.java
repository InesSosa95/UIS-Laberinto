package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import unq.edu.ar.UIS_Modelo.Accion;

@SuppressWarnings("all")
public class AgregarAccionWindow extends MainWindow<Accion> {
  public AgregarAccionWindow(final Accion model) {
    super(model);
    this.setTitle("Agregar Accion");
  }
  
  public void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("\t\t\t\t \t                                     \tAgregar Accion");
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
        it.setText("Selecciona una accion a agregar:");
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
    Label _label_3 = new Label(panelOpciones);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_3);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar accion de ir a otra habitacion");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AgregarAccionWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_4);
    Label _label_4 = new Label(panelOpciones);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_4, _function_5);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar accion de ir a otra habitacion");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AgregarAccionWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_6);
    Label _label_5 = new Label(panelOpciones);
    final Procedure1<Label> _function_7 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_7);
    Button _button_2 = new Button(panelOpciones);
    final Procedure1<Button> _function_8 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar accion de ir a otra habitacion");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AgregarAccionWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_8);
    Label _label_6 = new Label(panelOpciones);
    final Procedure1<Label> _function_9 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_6, _function_9);
  }
  
  public void abrirEstadistica() {
  }
}
