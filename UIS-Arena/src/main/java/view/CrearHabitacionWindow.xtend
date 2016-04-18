package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.Habitacion
import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*

class CrearHabitacionWindow extends TransactionalDialog<Habitacion>{
	
	new(WindowOwner owner, Habitacion model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		
		this.setTitle("Creando Habitacion")
	 
	 new Label(mainPanel) => [
	 		setText = "Ingrese un nombre para su habitacion"
			width = 230
			height = 15
			]
	 
	 
			
			new TextBox(mainPanel) => [
			value <=> "nombreHabitacion"
			width = 100
			height = 20
			
			]
	}
	
	override protected void addActions(Panel actions) {
		new Button(actions) => [
			caption = "Aceptar"
			onClick [|agregarHabitacion]
			setAsDefault
			disableOnError	
		]

		new Button(actions) => [
			caption = "Cancelar"	
			onClick [|
				this.cancel
			]
		]
				
	}
	
	def agregarHabitacion(){
		owner as GatoEncerradoWindow => [
			agregarHabitacion(this.modelObject)
		]
	}
	
}