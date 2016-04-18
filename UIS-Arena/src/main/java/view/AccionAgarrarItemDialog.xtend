package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.AccionAgarrarItem

class AccionAgarrarItemDialog extends TransactionalDialog<AccionAgarrarItem>{
	
	new(WindowOwner owner, AccionAgarrarItem model) {
		super(owner, model)
		title = "Agregar Acción"
	}
	
	override createContents(Panel mainPanel) {	 
	 
	 new Label(mainPanel) => [
			setText("Agregar accion de agregar un elemento")
		]
			
	new Label(mainPanel) => [
		text = "Escriba el elemento que aparecera en la habitacion"
		height = 20
		]
			
	new TextBox(mainPanel) => [
		bindValueToProperty("accionSeleccionada.agregarItemDisponible")
		height = 15
		fontSize = 10
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
	    onClick [ | agregarAccion]
		]
			
			
	}
	
	//REVISAR
	def agregarAccion(){
		modelObject.habitacionActual.agregarAccion(modelObject)
	}
	
	override protected createFormPanel(Panel arg0) {}	
}