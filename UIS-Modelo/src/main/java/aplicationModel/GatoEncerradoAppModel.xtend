package aplicationModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Laberinto
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos
import unq.edu.ar.UIS_Modelo.Usuario

@Accessors
@Observable
class GatoEncerradoAppModel {
		
	SistemaDeLaberintos sistema
	//List<Laberinto> laberintos
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	Accion accionSeleccionada
	Usuario administrador

	
	new(){
		administrador = new Usuario("Pepito")
		sistema = new SistemaDeLaberintos(administrador)
		//laberintos = newArrayList 
		}
		
	def agregarLaberinto(Laberinto laberinto){
		sistema.agregarLaberinto(laberinto)
	}
	
	def eliminarLaberinto(Laberinto laberinto){
		sistema.eliminarLaberinto(laberinto)
	}
	
	def agregarHabitacion(Habitacion habitacion){
		laberintoSeleccionado.agregarHabitacion(habitacion)
	}
	
	def eliminarHabitacion(Habitacion habitacion){
		laberintoSeleccionado.eliminarHabitacion(habitacion)
	}
	
	def laberintos(){
		sistema.laberintos
	}
	
	
	
	
	
	
	
	
	
}