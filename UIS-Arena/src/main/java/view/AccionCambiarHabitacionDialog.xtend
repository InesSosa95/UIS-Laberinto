package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.bindings.*
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.AccionMoverDeHabitacion
import unq.edu.ar.UIS_Modelo.Habitacion

class AccionCambiarHabitacionDialog extends TransactionalDialog<AccionMoverDeHabitacion>{
	
	new(WindowOwner owner, AccionMoverDeHabitacion model) {
		super(owner, model)
		title = "Agregar Acción"
	}
	
	override createContents(Panel mainPanel) {	 
	 
	 new Label(mainPanel) => [
			setText("Agregar accion de Ir a otra habitacion")
		]
			
			new Label(mainPanel) => [
				text = "Selecciona una habitacion a la cual ir"
				height = 20
			]
			
			new Selector<Habitacion>(mainPanel) => [
				allowNull(false)				
				bindValueToProperty("habitacionActual")
				bindItems(new ObservableProperty(modelObject, "habitacionesDisponibles"))
			]
			
			
			val panelOpciones = new Panel(mainPanel)
			panelOpciones.setLayout(new HorizontalLayout)
			
			new Button(panelOpciones) => [
			setCaption("Cancelar")
			fontSize = 8
			 onClick [ | close]
			]
			
			
			new Button(panelOpciones) => [
			setCaption("Agregar")
			fontSize = 8
			 onClick [ | crearAccion]
			]
			
			
	}
	
	//REVISAR
	def crearAccion(){
		modelObject.habitacionActual.crearAccion()
		close		
	}
	
	override protected createFormPanel(Panel arg0) {}	
		
}