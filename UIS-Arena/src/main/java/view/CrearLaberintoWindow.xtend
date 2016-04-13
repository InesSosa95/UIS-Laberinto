package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.Habitacion
import org.uqbar.arena.widgets.TextBox
import unq.edu.ar.UIS_Modelo.Laberinto
import aplicationModel.GatoEncerradoAppModel

class CrearLaberintoWindow extends TransactionalDialog<Laberinto>{
	
	new(WindowOwner owner, Laberinto model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		
		this.setTitle("Creando Laberinto")
	 
	 new Label(mainPanel) => [
	 		setText = "Ingrese un nombre para su laberinto"
			width = 100
			height = 15
			]
	 
	 
			
			new TextBox(mainPanel) => [
			bindValueToProperty("nombreLaberinto")
			width = 100
			height = 20
			
			]
			
			
				 val panelOpciones = new Panel(mainPanel)
	 			panelOpciones.setLayout(new HorizontalLayout)
			
			
			
			new Button(panelOpciones) => [
			setCaption("Cancelar")
			fontSize = 8
			 onClick [ | close]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar")
			fontSize = 8
			 onClick [ | agregarLaberinto]
			]
			
	}
	
	def agregarLaberinto() {
		owner.agregarLaberinto(model)
		modelObject.laberintos.add(model)
	}
	
}