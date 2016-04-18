package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import unq.edu.ar.UIS_Modelo.AccionAgarrarItem;
import unq.edu.ar.UIS_Modelo.Habitacion;

@SuppressWarnings("all")
public class AccionAgarrarItemDialog extends TransactionalDialog<AccionAgarrarItem> {
  public AccionAgarrarItemDialog(final WindowOwner owner, final AccionAgarrarItem model) {
    super(owner, model);
    this.setTitle("Agregar Acción");
  }
  
  public void createContents(final Panel mainPanel) {
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Agregar accion de agregar un elemento");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Escriba el elemento que aparecera en la habitacion");
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function_2 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.<Object, ControlBuilder>bindValueToProperty("accionSeleccionada.agregarItemDisponible");
        it.setHeight(15);
        it.setFontSize(10);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_2);
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
            AccionAgarrarItemDialog.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_3);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AccionAgarrarItemDialog.this.agregarAccion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_4);
  }
  
  public boolean agregarAccion() {
    AccionAgarrarItem _modelObject = this.getModelObject();
    Habitacion _habitacionActual = _modelObject.getHabitacionActual();
    AccionAgarrarItem _modelObject_1 = this.getModelObject();
    return _habitacionActual.agregarAccion(_modelObject_1);
  }
  
  protected void createFormPanel(final Panel arg0) {
  }
}
