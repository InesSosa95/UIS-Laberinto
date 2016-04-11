package view

import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import java.awt.Color
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.List
import unq.edu.ar.UIS_Modelo.Laberinto
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.TextBox
import unq.edu.ar.UIS_Modelo.Habitacion

class GatoEncerradoWindow extends MainWindow<SistemaDeLaberintos>{
	
	new(SistemaDeLaberintos model) {
		super(model)
	}
	
	override createContents(Panel mainPanel) {
	 
	 
	 
	 
	 
	 //val panelPersonaje = new Panel(mainPanel)
	 //panelPersonaje.setLayout(new HorizontalLayout)
	 
	 
		
		/* new Selector<ControladorEstadisticas>(mainPanel) => [
            
            allowNull = false
            bindItemsToProperty("nombreEstadisticas")
            bindValueToProperty("nombrePersonaje")
			]
			
			* 
			*/
	 
	 new Label(mainPanel)  => [
	 	
	 	title = "Hola juan! administrá todos tus laberintos"
	 ]
	 
	 new Label(mainPanel) => [
			//width = 50
			setText("Aca hay gato encerrado...")
			setBackground(Color.RED)
			height = 30
			//width = 600
			//height = 10
			fontSize = 20
		    //setForeground(Color.WHITE)
			]
			
	new Label(mainPanel) => [
			//width = 50
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
					
					
					new List<Laberinto>(panelLaberintos)=> [
						
						width = 200
						height = 200
						
					]
					
					val panelOpcionesLaberintos = new Panel(panelLaberintos)
					panelOpcionesLaberintos.setLayout(new HorizontalLayout)
					
						new Button(panelOpcionesLaberintos) => [
						setCaption("Agregar Laberinto")
						fontSize = 8
			 			onClick [ | close]
						]
					
						new Button(panelOpcionesLaberintos) => [
						setCaption("Eliminar Laberinto")
						fontSize = 8
			 			onClick [ | close]
						]
					 
				
				val panelHabitaciones = new Panel(panelOpciones)
				
					new Label(panelHabitaciones) => [
						setText("Nombre de Laberinto <bindear>")
						height = 15
						fontSize = 10
						
					]
					
					new Label(panelHabitaciones) => [
						setText("Nombre de Laberinto:")
						height = 15
						fontSize = 10
						
					]
					
					new TextBox(panelHabitaciones) => [
						height = 15
						fontSize = 10
						
					]
					
					new Label(panelHabitaciones) => [
						//espacio
						height = 20
					
					]
					
					
					new List<Habitacion>(panelHabitaciones)=> [
						
						width = 200
						height = 200
						
					]
					
					val panelOpcionesHabitacion = new Panel(panelHabitaciones)
					panelOpcionesHabitacion.setLayout(new HorizontalLayout)
					
					new Button(panelOpcionesHabitacion) => [
						setCaption("Agregar Habitacion")
						fontSize = 8
			 			onClick [ | close]
						]
					
					new Button(panelOpcionesHabitacion) => [
						setCaption("Eliminar Habitacion")
						fontSize = 8
			 			onClick [ | close]
						]
					
				
				val panelAcciones = new Panel(panelOpciones)
			
			
			
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
	
	
}