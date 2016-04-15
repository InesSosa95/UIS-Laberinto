package view

import org.uqbar.arena.aop.windows.TransactionalDialog
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.Laberinto

class EliminarLaberintoWindow  extends TransactionalDialog<Laberinto>{
	
	new(WindowOwner owner, Laberinto model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		
		this.setTitle("Eliminando Laberinto")
	 
	 new Label(mainPanel) => [
	 		setText = "Seguro que Desea Eliminar El laberinto: < " + modelObject.nombreLaberinto + " > ?" 
			width = 350
			]		
			
		val panelOpciones = new Panel(mainPanel)
	 	panelOpciones.setLayout(new HorizontalLayout)
			
			
			
			new Button(panelOpciones) => [
			setCaption("Cancelar")
			fontSize = 8
			width = 170
			 onClick [ | close]
			]
			
			
			new Button(panelOpciones) => [
			setCaption("Eliminar")
			width = 170
			fontSize = 8
			 onClick [ | destruirLaberinto]
			]
			
	}
	
	def destruirLaberinto(){
		var window = this.owner as GatoEncerradoWindow
		this.close
		window.destruirLaberinto(this.modelObject)
		
	}
	
}