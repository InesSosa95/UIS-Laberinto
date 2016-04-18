package view

import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.AccionMoverDeHabitacion

class AgregarHabitacionWindow extends Dialog<AccionMoverDeHabitacion>{
	
	new(WindowOwner owner, AccionMoverDeHabitacion model) {
		super(owner, model)
		title = "Agregar Acción"
	}
	
	override createContents(Panel mainPanel) {	 
	 
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
			 onClick [ | close]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de Usar un elemento")
			fontSize = 8
			 onClick [ | close]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
	}
	
	def cambiarHabitacion(){
		this.openDialog(new AccionCambiarHabitacionDialog(this, modelObject))
	}
	
	def openDialog(AccionCambiarHabitacionDialog dialog) {
		dialog.open
	}
		
	
	override protected createFormPanel(Panel arg0) {}
	
	override protected addActions(Panel arg0) {}
		
}