package runnable

import aplicationModel.GatoEncerradoAppModel
import org.uqbar.arena.Application
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.Disponibilidad
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Laberinto
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos
import view.GatoEncerradoWindow

class AplicacionLaberinto extends Application{

	
	override createMainWindow() {
		
		//ESTO AL APLICATION!!!
		
			var gatoEncerradoModel = new GatoEncerradoAppModel
		
		val sistema = new SistemaDeLaberintos (gatoEncerradoModel.administrador)
		
		val laberinto1 = new Laberinto("Casa embrujada" ,gatoEncerradoModel.administrador, sistema)
		val laberinto2 = new Laberinto("Museo en la noche" ,gatoEncerradoModel.administrador, sistema)
		val laberinto3 = new Laberinto("Pueblo Fantasma" ,gatoEncerradoModel.administrador, sistema)
		val laberinto4 = new Laberinto("Escape del Cementerio" ,gatoEncerradoModel.administrador, sistema)
		
		var habitacion1 = new Habitacion("Recibidor", Disponibilidad.DISPONIBLE)
		var habitacion2 = new Habitacion("Comedor", Disponibilidad.NO_DISPONIBLE)
		var habitacion3 = new Habitacion("Cocina", Disponibilidad.DISPONIBLE)
		
		var habitacion4 = new Habitacion("Sala de Pinturas", Disponibilidad.DISPONIBLE)
		var habitacion5 = new Habitacion("Fosiles Prehistoricos", Disponibilidad.DISPONIBLE)
		var habitacion6 = new Habitacion("Muñecos de Cera", Disponibilidad.DISPONIBLE)
		
		var habitacion7 = new Habitacion("Plaza Central", Disponibilidad.DISPONIBLE)
		var habitacion8 = new Habitacion("Casa abandonada", Disponibilidad.DISPONIBLE)
		var habitacion9 = new Habitacion("Bosque", Disponibilidad.DISPONIBLE)
		
		var habitacion10 = new Habitacion("Calle central", Disponibilidad.DISPONIBLE)
		var habitacion11 = new Habitacion("Catacumba", Disponibilidad.DISPONIBLE)
		var habitacion12 = new Habitacion("Puerta de Entrada", Disponibilidad.NO_DISPONIBLE)
		
		
		val accion1 = new Accion(habitacion1)
		val accion2 = new Accion(habitacion1)
		val accion3 = new Accion(habitacion1)
		val accion4 = new Accion(habitacion1)
		val accion5 = new Accion(habitacion2)
		val accion6 = new Accion(habitacion2)
		val accion7 = new Accion(habitacion2)
		val accion8 = new Accion(habitacion2)
		val accion9 = new Accion(habitacion3)
		val accion10 = new Accion(habitacion3)
		val accion11 = new Accion(habitacion3)
		val accion12 = new Accion(habitacion3)
		val accion13 = new Accion(habitacion3)
		val accion14 = new Accion(habitacion4)
		val accion15 = new Accion(habitacion4)
		val accion16 = new Accion(habitacion4)
		val accion17 = new Accion(habitacion4)
		val accion18 = new Accion(habitacion4)
		val accion19 = new Accion(habitacion4)
		val accion20 = new Accion(habitacion5)
		val accion21 = new Accion(habitacion5)
		val accion22 = new Accion(habitacion5)
		val accion23 = new Accion(habitacion5)
		val accion24 = new Accion(habitacion5)
		
				
		habitacion1.acciones => [
			add(accion1)
			add(accion2)
			add(accion3)
			add(accion4)
		]
		habitacion2.acciones => [
			add(accion5)
			add(accion6)
			add(accion7)
			add(accion8)
		]
		habitacion3.acciones => [
			add(accion9)
			add(accion10)
			add(accion11)
			add(accion12)
			add(accion13)
		]
		//habitacion4.acciones = #[accion14,accion15,accion16,accion17,accion18,accion19]
		
		habitacion4.acciones => [
			add(accion14)
			add(accion15)
			add(accion16)
			add(accion17)
			add(accion18)
			add(accion19)
		]
		
		
		habitacion5.acciones => [
			add(accion20)
			add(accion21)
			add(accion22)
			add(accion23)
			add(accion24)
		]
		
		
		laberinto1.agregarHabitacion(habitacion1)
		laberinto1.agregarHabitacion(habitacion2)
		laberinto1.agregarHabitacion(habitacion3)
			
		laberinto2.agregarHabitacion(habitacion4)
		laberinto2.agregarHabitacion(habitacion5)
		laberinto2.agregarHabitacion(habitacion6)
		
		laberinto3.agregarHabitacion(habitacion7)
		laberinto3.agregarHabitacion(habitacion8)
		laberinto3.agregarHabitacion(habitacion9)
		
		laberinto4.agregarHabitacion(habitacion10)
		laberinto4.agregarHabitacion(habitacion11)
		laberinto4.agregarHabitacion(habitacion12)
		
	
		
		
		gatoEncerradoModel.sistema = sistema
		
		gatoEncerradoModel.sistema.laberintos => [
			add(laberinto1)
			add(laberinto2)
			add(laberinto3)
			add(laberinto4)
		]
		
		
		new GatoEncerradoWindow(this, gatoEncerradoModel)
		
		}

	
	def static main(String[] args){
		
		
		//new AplicacionLaberinto().startApplication
		new AplicacionLaberinto().start
	}
}