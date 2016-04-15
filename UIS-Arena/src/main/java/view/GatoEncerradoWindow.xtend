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
import org.uqbar.arena.windows.MainWindow
import unq.edu.ar.UIS_Modelo.Disponibilidad

class GatoEncerradoWindow extends SimpleWindow<GatoEncerradoAppModel>{
	
	new(WindowOwner owner, GatoEncerradoAppModel model) {
		super(owner,model)
		
		title = "Aca hay gato encerrado..."
		//taskDescription = "Hola " + modelObject.administrador.nombreUsuario + "! Administrá todos tus laberintos"  
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
			 			onClick [ | eliminarLaberinto]
						]
					 
				
				val panelHabitaciones = new Panel(panelOpciones)
				
					new Label(panelHabitaciones) => [
						//bindValueToProperty("sistema.laberintoSeleccionado.nombreLaberinto")
						height = 15
						fontSize = 10
						]
					
					new Label(panelHabitaciones) => [
						setText("Nombre de Laberinto:")
						height = 15
						fontSize = 10
						
					]
					
					new TextBox(panelHabitaciones) => [
						//value <=> "sistema.laberintoSeleccionado.nombreLaberinto"
						bindValueToProperty("laberintoSeleccionado.nombreLaberinto")
						height = 15
						fontSize = 10
						
					]
					
					new Label(panelHabitaciones) => [
						height = 20
					
					]
					
					
					new List<Habitacion>(panelHabitaciones)=> [
						(items <=> "laberintoSeleccionado.habitaciones").adapter = new PropertyAdapter(typeof(Habitacion), "nombreHabitacion")
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
			 			onClick [ | crearHabitacion]
						]
					
					new Button(panelOpcionesHabitacion) => [
						setCaption("Eliminar Habitacion")
						fontSize = 11
						width = 140
			 			onClick [ | eliminarHabitacion]
						]
					
				
				val panelAcciones = new Panel(panelOpciones)
				
				
				new Label(panelAcciones) => [
						bindValueToProperty("habitacionSeleccionada.nombreHabitacion")
						height = 15
						fontSize = 10
						
					]
					
				new Label(panelAcciones) => [
						setText("Nombre")
						height = 15
						fontSize = 10
						
					] 
					
					new TextBox(panelAcciones) => [
						bindValueToProperty("habitacionSeleccionada.nombreHabitacion")
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
					
			
			
	}
	
	def eliminarHabitacion() {
		modelObject.chequearExistenciaDeHabitacion()
		this.openDialog(new EliminarHabitacionWindow(this, modelObject.habitacionSeleccionada))
	}
	
	def destruirHabitacion(Habitacion habitacion){
		modelObject.eliminarHabitacion(habitacion)
		modelObject.habitacionSeleccionada = null
		modelObject.accionSeleccionada = null
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
		this.openDialog(new CrearLaberintoWindow(this, new Laberinto("LaberintoNuevo", modelObject.administrador)))
		//this.openDialog(new CrearLaberintoWindow(this))
	}
	
	def eliminarLaberinto(){
		modelObject.chequearExistenciaDeLaberinto()
		this.openDialog(new EliminarLaberintoWindow(this, modelObject.laberintoSeleccionado))
	}
	
	
	def agregarLaberinto(Laberinto laberinto){
		modelObject.agregarLaberinto(laberinto)
	}
	
	def validarLaberinto(Laberinto laberinto){
		modelObject.sistema.validarLaberinto(laberinto)
	}
	
	def destruirLaberinto(Laberinto laberinto){
		modelObject.eliminarLaberinto(laberinto)
		modelObject.laberintoSeleccionado = null
		modelObject.habitacionSeleccionada = null
		modelObject.accionSeleccionada = null
		}
	
	def crearHabitacion() {
		modelObject.chequearExistenciaDeLaberinto
		this.openDialog(new CrearHabitacionWindow(this, new Habitacion("HabitacionNueva", Disponibilidad.DISPONIBLE)))
	}
	
	def validarHabitacion(Habitacion habitacion){
		this.modelObject.validarHabitacion(habitacion)
	}
	
	def agregarHabitacion(Habitacion habitacion){
		this.modelObject.agregarHabitacion(habitacion)
	}
	

	def openDialog(Dialog<?> dialog) {
		//dialog.onAccept[|modelObject.crearDenuncia()]
		dialog.open
	}
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

	def getAdministrador(){
		modelObject.administrador
	}

	
}