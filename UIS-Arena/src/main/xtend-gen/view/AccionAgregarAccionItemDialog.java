package view;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.aop.windows.TransactionalDialog;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import unq.edu.ar.UIS_Modelo.AccionUsarItem;
import unq.edu.ar.UIS_Modelo.Habitacion;
import unq.edu.ar.UIS_Modelo.Item;
import view.AgregarAccionItemDialog;

@SuppressWarnings("all")
public class AccionAgregarAccionItemDialog extends TransactionalDialog<AccionUsarItem> {
  public AccionAgregarAccionItemDialog(final WindowOwner owner, final AccionUsarItem model) {
    super(owner, model);
    this.setTitle("Agregar Acción");
  }
  
  public void createContents(final Panel mainPanel) {
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Agregar accion de usar un elemento");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Seleccione el elemento que tendrá una accion");
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_1);
    Selector<Item> _selector = new Selector<Item>(mainPanel);
    final Procedure1<Selector<Item>> _function_2 = new Procedure1<Selector<Item>>() {
      public void apply(final Selector<Item> it) {
        it.allowNull(false);
        it.<Object, ControlBuilder>bindValueToProperty("itemSeleccionado");
        AccionUsarItem _modelObject = AccionAgregarAccionItemDialog.this.getModelObject();
        ObservableProperty<Object> _observableProperty = new ObservableProperty<Object>(_modelObject, "habitacionActual.itemsDisponibles");
        it.<Object>bindItems(_observableProperty);
      }
    };
    ObjectExtensions.<Selector<Item>>operator_doubleArrow(_selector, _function_2);
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
            AccionAgregarAccionItemDialog.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_3);
    Label _label_2 = new Label(panelOpciones);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Cree la accion a realizar");
        it.setHeight(20);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_4);
    Label _label_3 = new Label(panelOpciones);
    final Procedure1<Label> _function_5 = new Procedure1<Label>() {
      public void apply(final Label it) {
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_5);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            AccionAgregarAccionItemDialog.this.crearAccion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_6);
  }
  
  public void crearAccion() {
    AccionUsarItem _modelObject = this.getModelObject();
    Habitacion _habitacionActual = _modelObject.getHabitacionActual();
    AccionUsarItem _accionUsarItem = new AccionUsarItem(_habitacionActual);
    AgregarAccionItemDialog _agregarAccionItemDialog = new AgregarAccionItemDialog(this, _accionUsarItem);
    this.openDialog(_agregarAccionItemDialog);
  }
  
  public void openDialog(final Dialog<?> dialog) {
    dialog.open();
  }
  
  protected void createFormPanel(final Panel arg0) {
  }
}
