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
import unq.edu.ar.UIS_Modelo.Laberinto;

@SuppressWarnings("all")
public class CrearLaberintoWindow extends TransactionalDialog<Laberinto> {
  public CrearLaberintoWindow(final WindowOwner owner, final Laberinto model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.setTitle("Creando Laberinto");
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Ingrese un nombre para su laberinto");
        it.setWidth(100);
        it.setHeight(15);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    TextBox _textBox = new TextBox(mainPanel);
    final Procedure1<TextBox> _function_1 = new Procedure1<TextBox>() {
      public void apply(final TextBox it) {
        it.<Object, ControlBuilder>bindValueToProperty("nombreLaberinto");
        it.setWidth(100);
        it.setHeight(20);
      }
    };
    ObjectExtensions.<TextBox>operator_doubleArrow(_textBox, _function_1);
    final Panel panelOpciones = new Panel(mainPanel);
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    panelOpciones.setLayout(_horizontalLayout);
    Button _button = new Button(panelOpciones);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Cancelar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            CrearLaberintoWindow.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Label _label_1 = new Label(panelOpciones);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setWidth(50);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_3);
    Button _button_1 = new Button(panelOpciones);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar");
        it.setFontSize(8);
        final Action _function = new Action() {
          public void execute() {
            CrearLaberintoWindow.this.agregarLaberinto();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_4);
  }
  
  public Object agregarLaberinto() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method agregarLaberinto(IModel<Laberinto>) is undefined for the type WindowOwner"
      + "\nThe method or field laberintos is undefined for the type Laberinto"
      + "\nadd cannot be resolved");
  }
}
