package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.bindings.ObservableProperty
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.AccionMoverDeHabitacion
import unq.edu.ar.UIS_Modelo.AccionUsarItem
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Item

class AccionAgregarAccionItemDialog extends TransactionalDialog<AccionUsarItem>{
	
	new(WindowOwner owner, AccionUsarItem model) {
		super(owner, model)
		title = "Agregar Acción"
	}
	
	override createContents(Panel mainPanel) {	 
	 
	 new Label(mainPanel) => [
			setText("Agregar accion de usar un elemento")
		]
			
	new Label(mainPanel) => [
		text = "Seleccione el elemento que tendrá una accion"
		height = 20
		]
			
	new Selector<Item>(mainPanel) => [
		allowNull(false)				
		bindValueToProperty("itemSeleccionado")
		bindItems(new ObservableProperty(modelObject, "habitacionActual.itemsDisponibles"))
		]
			
	val panelOpciones = new Panel(mainPanel)
	panelOpciones.setLayout(new HorizontalLayout)
			
	new Button(panelOpciones) => [
		setCaption("Cancelar")
		fontSize = 8
		 onClick [ | close]
		]
	
	new Label(panelOpciones)=>[
		text= "Cree la accion a realizar"
		height = 20
	]
	
	new Label(panelOpciones) => [
//		text = bindValueToProperty()
	] 
			
	new Button(panelOpciones) => [
		setCaption("Agregar")
		fontSize = 8
	    onClick [ | crearAccion]
		]
			
			
	}
	
	//REVISAR
	def crearAccion(){
		this.openDialog(new AgregarAccionItemDialog(this, new AccionUsarItem(modelObject.habitacionActual)))
		
	}
	

	def openDialog(Dialog<?> dialog) {
		dialog.open
	}
	
	override protected createFormPanel(Panel arg0) {}
	
	
}