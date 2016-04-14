package view

import java.awt.Color
import org.uqbar.arena.bindings.PropertyAdapter
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.RadioSelector
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Laberinto

import static extension org.uqbar.arena.xtend.ArenaXtendExtensions.*
import org.uqbar.arena.windows.Dialog
import aplicationModel.GatoEncerradoAppModel

class GatoEncerradoWindow extends SimpleWindow<GatoEncerradoAppModel>{
	
	new(WindowOwner parent, GatoEncerradoAppModel model) {
		super(parent, model)
		title = "Aca hay gato encerrado..."
		taskDescription = "Hola " + modelObject.administrador.nombreUsuario + "! Administrá todos tus laberintos"  
	}
	
	override createContents(Panel mainPanel) {
	 
	 
	 new Label(mainPanel) => [
			width = 1000
			setText("Hola " + modelObject.administrador.nombreUsuario + "! Administrá todos tus laberintos")
			height = 15
			fontSize = 10
			]
	 
	 new Label(mainPanel) => [
			width = 1000
			setText("Aca hay gato encerrado...")
			setBackground(Color.RED)
			height = 30
			fontSize = 20
			]
			
	new Label(mainPanel) => [
			height = 20
			]
			
			val panelOpciones = new Panel(mainPanel)
			panelOpciones.setLayout(new HorizontalLayout)
			
				val panelLaberintos = new Panel(panelOpciones)
				
					new Label(panelLaberintos) => [
						setText("Laberintos")
						height = 15
						fontSize = 10
						
					]
					
					
      				new List<Laberinto>(panelLaberintos) => [
            		(items <=> "sistema.laberintos").adapter = new PropertyAdapter(typeof(Laberinto), "nombreLaberinto")
            		value <=> "laberintoSeleccionado"
            		width = 220
            		height = 220
            		
      ]
		
				
					val panelOpcionesLaberintos = new Panel(panelLaberintos)
					panelOpcionesLaberintos.setLayout(new HorizontalLayout)
					
						new Button(panelOpcionesLaberintos) => [
						setCaption("Agregar Laberinto")
						fontSize = 11
						width = 140
			 			onClick [ | crearLaberinto]
						]
												
					
						new Button(panelOpcionesLaberintos) => [
						setCaption("Eliminar Laberinto")
						fontSize = 11
						width = 140
			 			onClick [ | close]
						]
					 
				
				val panelHabitaciones = new Panel(panelOpciones)
				
					new Label(panelHabitaciones) => [
						bindValueToProperty("laberintoSeleccionado.nombreLaberinto")
						height = 15
						fontSize = 10
						]
					
					new Label(panelHabitaciones) => [
						setText("Nombre de Laberinto:")
						height = 15
						fontSize = 10
						
					]
					
					new TextBox(panelHabitaciones) => [
						bindValueToProperty("laberintoSeleccionado.nombreLaberinto")
						height = 15
						fontSize = 10
						
					]
					
					new Label(panelHabitaciones) => [
						height = 20
					
					]
					
					
					new List<Habitacion>(panelHabitaciones)=> [
						(items <=> "laberintoSeleccionado.habitaciones").adapter = new PropertyAdapter(typeof(Habitacion), "id")
            		value <=> "habitacionSeleccionada"
						width = 300
						height = 200
						
					]
					
					val panelOpcionesHabitacion = new Panel(panelHabitaciones)
					panelOpcionesHabitacion.setLayout(new HorizontalLayout)
					
					new Button(panelOpcionesHabitacion) => [
						setCaption("Agregar Habitacion")
						fontSize = 11
						width = 140
			 			onClick [ | close]
						]
					
					new Button(panelOpcionesHabitacion) => [
						setCaption("Eliminar Habitacion")
						fontSize = 11
						width = 140
			 			onClick [ | close]
						]
					
				
				val panelAcciones = new Panel(panelOpciones)
				
				
				new Label(panelAcciones) => [
						bindValueToProperty("habitacionSeleccionada.id")
						height = 15
						fontSize = 10
						
					]
					
				new Label(panelAcciones) => [
						setText("Nombre")
						height = 15
						fontSize = 10
						
					] 
					
					new TextBox(panelAcciones) => [
						bindValueToProperty("habitacionSeleccionada.id")
						height = 15
						fontSize = 10
						width = 100
						
					]
					
					new RadioSelector(panelAcciones) => [
						//opciones esFinal y esInicial
						//ejemplo de bind:
						//bindItems(new ObservableProperty(this, "estadosCiviles"))
            			//bindValueToProperty("estadoCivil")
						
					]
					
					
					
					new Label(panelAcciones) => [
						height = 100
					]
					
					
					new Label(panelAcciones) => [
						setText("Acciones")
						height = 15
						fontSize = 10
						
					]
					
					new List<Habitacion>(panelAcciones)=> [
						(items <=> "habitacionSeleccionada.acciones")//TODO .adapter = new PropertyAdapter(typeof(Accion), "id")
            			value <=> "accionSeleccionada"
						width = 300
						height = 100
						
					]
				
					val panelAccionBotones= new Panel(panelAcciones)
					panelAccionBotones.setLayout(new HorizontalLayout)		
					 
					new Button(panelAccionBotones) => [
						setCaption("Agregar Accion")
						fontSize = 11
						width = 140
			 			onClick [ | close]
						]
					
					new Button(panelAccionBotones) => [
						setCaption("Eliminar Accion")
						fontSize = 11
						width = 140
			 			onClick [ | close]
						]
					
			
			
			
			//new Label(panelOpciones) => [
			//bindValueToProperty("estadisticaSeleccionada.personaje.nombre")
			
			
			//bindValueToProperty("nombrePersonaje")
			
			
			//setBackground(Color.BLACK)
			//width = 600
			//height = 10
			//fontSize = 15
		    //setForeground(Color.WHITE)
			//]
			
			//val panelIrAHabitacion = new Panel(panelOpciones2)
			
			/*
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de ir a otra habitacion")
			fontSize = 8
			 onClick [ | close]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de ir a otra habitacion")
			fontSize = 8
			 onClick [ | close]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			
			new Button(panelOpciones) => [
			setCaption("Agregar accion de ir a otra habitacion")
			fontSize = 8
			 onClick [ | close]
			]
			
			new Label(panelOpciones) => [
			width = 50
			]
			 */
			
			
			/*
			new Label(panelOpciones2) => [
			setText("cantidad de Duelos: ")
			fontSize = 15
			] 
			
			new Label(panelPartidas) => [
			//bindValueToProperty("estadisticaSeleccionada.vecesQueInicio")
			
			
			//bindValueToProperty("vecesQueInicio")
			
			
			fontSize = 15
			]
			
			val panelKills = new Panel(mainPanel)
			panelKills.setLayout(new HorizontalLayout)
			
			new Label(panelKills) => [
			setText("Kills: ")
			fontSize = 15
			]
			
			new Label(panelKills) => [
			//bindValueToProperty("estadisticaSeleccionada.kills")
			
			
			//bindValueToProperty("kills")
			
			
			fontSize = 15
			]
			
			
			val panelDeads = new Panel(mainPanel)
			panelDeads.setLayout(new HorizontalLayout)
			
			new Label(panelDeads) => [
			setText("Deads: ")
			fontSize = 15
			]
			
			new Label(panelDeads) => [
			//bindValueToProperty("estadisticaSeleccionada.deads")
			
			
			//bindValueToProperty("deads")
			
			
			fontSize = 15
			]
			
			val panelAssist = new Panel(mainPanel)
			panelAssist.setLayout(new HorizontalLayout)
			
			new Label(panelAssist) => [
			setText("Assists: ")
			fontSize = 15
			]
			
			new Label(panelAssist) => [
			//bindValueToProperty("estadisticaSeleccionada.assists")
			
			
			//bindValueToProperty("assist")
			
			
			fontSize = 15
			]
			
			
			val panelVictorias = new Panel(mainPanel)
			panelVictorias.setLayout(new HorizontalLayout)
			
			new Label(panelVictorias) => [
			setText("Victorias: ")
			fontSize = 15
			]
			
			new Label(panelVictorias) => [
			//bindValueToProperty("estadisticaSeleccionada.victorias")
			
			
			//bindValueToProperty("victorias")
			
			
			fontSize = 15
			]
			
			val panelMejorLinea = new Panel(mainPanel)
			panelMejorLinea.setLayout(new HorizontalLayout)
			
			new Label(panelMejorLinea) => [
			setText("Mejor Linea: ")
			fontSize = 15
			]
			
			new Label(panelMejorLinea) => [
			//bindValueToProperty("estadisticaSeleccionada.mejorLinea")
			
			
			//bindValueToProperty("mejorLinea")
			
			
			fontSize = 15
			]
			
			val panelUbicaciones = new Panel(mainPanel)
			panelUbicaciones.setLayout(new HorizontalLayout)
			
			new Label(panelUbicaciones) => [
			setText("Ubicaciones: ")
			fontSize = 15
			]
			
			new List(panelUbicaciones) => [
			//bindValueToProperty("estadisticaSeleccionada.ubicaciones")
			
			
			//bindValueToProperty("ubicaciones")
			
			
			]
			
			val panelCalificacion = new Panel(mainPanel)
			panelCalificacion.setLayout(new HorizontalLayout)
			
			new Label(panelCalificacion) => [
			setText("Calificacion: ")
			fontSize = 15
			]
			
			new Label(panelCalificacion) => [
			//bindValueToProperty("estadisticaSeleccionada.calificacionEnDuelo")
			
			
			//bindValueToProperty("calificacionEnDuelo")
			
			
			fontSize = 15
			]
			
			new Button(mainPanel) => [
			setCaption("Volver")
			fontSize = 8
			 onClick [ | close]
			]
			
	
	
	*/
	}
	
	
	
	//def openDialog(Dialog<?> dialog) {
		//dialog.onAccept[|modelObject.seleccionar]
		//dialog.open
	//}
	
	def void abrirEstadistica() {
      //this.openDialog(new WindowEstadistica(this, modelObject.seleccionar))
      //modelObject.abrirEstadistica()
}


	def crearLaberinto(){
		this.openDialog(new CrearLaberintoWindow(this, modelObject.laberintoSeleccionado))
	}

	def openDialog(Dialog<?> dialog) {
		//dialog.onAccept[|modelObject.crearDenuncia()]
		dialog.open
	}

	
override protected addActions(Panel arg0) {
	throw new UnsupportedOperationException("TODO: auto-generated method stub")
}

override protected createFormPanel(Panel arg0) {
	throw new UnsupportedOperationException("TODO: auto-generated method stub")
}
	
	
}