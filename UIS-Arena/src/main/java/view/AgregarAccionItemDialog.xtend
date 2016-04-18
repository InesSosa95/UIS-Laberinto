package view

import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.AccionAgarrarItem
import unq.edu.ar.UIS_Modelo.AccionMoverDeHabitacion

class AgregarAccionItemDialog  extends Dialog<Accion>{
	
	new(WindowOwner owner, Accion model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		 new Label(mainPanel) => [
			setText("Selecciona una acción a agregar:")
		]
			
			new Label(mainPanel) => [
			height = 20
			]
			
			val panelOpciones = new Panel(mainPanel)
			panelOpciones.setLayout(new HorizontalLayout)
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de Ir a otra habitacion")
			fontSize = 8
			 onClick [ | cambiarHabitacion]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de Agarrar un elemento")
			fontSize = 8
			 onClick [ | agarrarItem]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
	}
	
	
	
	def cambiarHabitacion(){
		this.close
		this.openDialog(new AccionCambiarHabitacionDialog(owner, new AccionMoverDeHabitacion(modelObject.habitacionActual)))
		
		
	}
	
	def agarrarItem(){
		this.close
		this.openDialog(new AccionAgarrarItemDialog(owner, new AccionAgarrarItem(modelObject.habitacionActual)))
		
		
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.open
	}
	
}