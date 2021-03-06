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
import unq.edu.ar.UIS_Modelo.Laberinto;

@SuppressWarnings("all")
public class EliminarLaberintoWindow extends TransactionalDialog<Laberinto> {
  public EliminarLaberintoWindow(final WindowOwner owner, final Laberinto model) {
    super(owner, model);
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.setTitle("Eliminando Laberinto");
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        Laberinto _modelObject = EliminarLaberintoWindow.this.getModelObject();
        String _nombreLaberinto = _modelObject.getNombreLaberinto();
        String _plus = ("Seguro que Desea Eliminar El laberinto: < " + _nombreLaberinto);
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
            EliminarLaberintoWindow.this.close();
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
            EliminarLaberintoWindow.this.eliminarLaberinto();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
  }
  
  public Object eliminarLaberinto() {
    return null;
  }
}
