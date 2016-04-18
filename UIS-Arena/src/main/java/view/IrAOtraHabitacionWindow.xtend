package view

import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.MainWindow
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.Habitacion
import org.uqbar.arena.widgets.Selector

class IrAOtraHabitacionWindow extends MainWindow<Accion>{ //TransactionalDialog<Accion>
	
	
	
	new(Accion model) {
		super(model)
		
		
		
	}
	
	def createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}


	//new(WindowOwner parent, GatoEncerrado model ){
		//super(parent, model)
		//title = "Agregar Acción"
	//}
	
	
	
	override createContents(Panel mainPanel) {
	 this.setTitle("				 	                                     	Selecciona una habitacion a la cual ir")
	 
	 new Label(mainPanel) => [
			//width = 50
			height = 10
			]
	 
	 
			
			new Label(mainPanel) => [
			//width = 50
			height = 20
			]
			
			new Selector<Habitacion>(mainPanel)=> [
						
						width = 300
						height = 100
						
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
			 onClick [ | close]
			]
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
		
}