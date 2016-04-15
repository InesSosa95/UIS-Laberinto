package aplicationModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Laberinto
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos
import unq.edu.ar.UIS_Modelo.Usuario
import org.uqbar.commons.model.UserException

@Accessors
@Observable
class GatoEncerradoAppModel {
		
	SistemaDeLaberintos sistema
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	Accion accionSeleccionada
	Usuario administrador
	//crotada
	Laberinto laberintoNuevo

	
	new(){
		administrador = new Usuario("Pepito")
		sistema = new SistemaDeLaberintos(administrador)
		//crotada
		laberintoNuevo = new Laberinto("UnLaberintoNuevo", administrador)
		//laberintos = newArrayList 
		}
		
	def agregarLaberinto(Laberinto laberinto){
		sistema.agregarLaberinto(laberinto)
	}
	
	def validarLaberinto(Laberinto laberinto){
		sistema.validarLaberinto(laberinto)
	}
	
	
	def eliminarLaberinto(Laberinto laberinto){
		sistema.eliminarLaberinto(laberinto)
		this.laberintoSeleccionado == null
	}
	
	def agregarHabitacion(Habitacion habitacion){
		laberintoSeleccionado.agregarHabitacion(habitacion)
	}
	
	def eliminarHabitacion(Habitacion habitacion){
		laberintoSeleccionado.eliminarHabitacion(habitacion)
		
	}
	
	def validarHabitacion(Habitacion habitacion){
		laberintoSeleccionado.validarHabitacion(habitacion)
	}
	
	
	def chequearExistenciaDeLaberinto(){
		if(sistema.laberintos.size()==0)
			throw new UserException("No hay laberinto para eliminar")
			if(laberintoSeleccionado == null)
			throw new UserException("No hay laberinto seleccionado")
	}
	//def laberintos(){
	//	sistema.laberintos
//	}
	
	
	
	
	
	
	
	
	
}