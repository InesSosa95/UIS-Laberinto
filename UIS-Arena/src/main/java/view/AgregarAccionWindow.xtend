package view

import aplicationModel.GatoEncerradoAppModel
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.AccionAgarrarItem
import unq.edu.ar.UIS_Modelo.AccionMoverDeHabitacion
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.AccionUsarItem

class AgregarAccionWindow extends Dialog<GatoEncerradoAppModel>{
	
	new(WindowOwner owner, GatoEncerradoAppModel model) {
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
			 onClick [ | agarrarItem]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de Usar un elemento")
			fontSize = 8
			 onClick [ | crearAccionDeUsar]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
	}
	
	def cambiarHabitacion(){
		this.close
		this.openDialog(new AccionCambiarHabitacionDialog(owner, new AccionMoverDeHabitacion(modelObject.habitacionSeleccionada)))
		
		
	}
	
	def agarrarItem(){
		this.close
		this.openDialog(new AccionAgarrarItemDialog(owner, new AccionAgarrarItem(modelObject.habitacionSeleccionada)))
		
		
	}
	
	def crearAccionDeUsar(){
		this.close
		this.openDialog(new AccionAgregarAccionItemDialog(owner, new AccionUsarItem(modelObject.habitacionSeleccionada)))
	}
	
	def openDialog(Dialog<?> dialog) {
		dialog.open
	}
		
	
	override protected createFormPanel(Panel arg0) {}
	
	override protected addActions(Panel arg0) {}
		
}