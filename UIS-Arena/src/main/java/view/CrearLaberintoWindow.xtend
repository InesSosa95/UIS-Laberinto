package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.Laberinto

import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*

class CrearLaberintoWindow extends TransactionalDialog<Laberinto>{
	
		new(WindowOwner owner, Laberinto model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		
		this.setTitle("Creando Laberinto")
	 
	 new Label(mainPanel) => [
	 		setText = "Ingrese un nombre para su laberinto"
			width = 230
			height = 15
			]
	 
	 
			
			new TextBox(mainPanel) => [
			value <=> "nombreLaberinto"
			width = 100
			height = 20
			
			]
	}
	
	override protected void addActions(Panel actions) {
		new Button(actions) => [
			caption = "Aceptar"
			onClick [|agregarLaberinto]
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
	
	
	def agregarLaberinto() {
		owner as GatoEncerradoWindow => [
			validarLaberinto(this.modelObject)
		]
		this.close
		owner as GatoEncerradoWindow => [
			agregarLaberinto(this.modelObject)
		]		
	}
	
}