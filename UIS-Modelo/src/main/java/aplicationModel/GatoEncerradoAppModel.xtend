package aplicationModel

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.ObservableUtils
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
	Laberinto laberintoNuevo

	
	new(){
		administrador = new Usuario("Pepito")
		sistema = new SistemaDeLaberintos(administrador)
		laberintoNuevo = new Laberinto("UnLaberintoNuevo", administrador)
		}
		
	def agregarLaberinto(Laberinto laberinto){
		sistema.agregarLaberinto(laberinto)
	}
	
	def eliminarLaberinto(){
		sistema.eliminarLaberinto(laberintoSeleccionado)
	}
	
	def agregarHabitacion(Habitacion habitacion){
		laberintoSeleccionado.agregarHabitacion(habitacion)
	}
	
	
	def eliminarHabitacion(){
		laberintoSeleccionado.eliminarHabitacion(habitacionSeleccionada)
	}
	
	def crearAccion(){
		this.habitacionSeleccionada.agregarAccion(new Accion(habitacionSeleccionada))
		ObservableUtils.firePropertyChanged(this,"toString")
	}
	
	def eliminarAccion(Accion accion){
		habitacionSeleccionada.eliminarAccion(accion)
	}
	
	def validarLaberinto(){
		if(this.laberintoSeleccionado == null)
			throw new UserException("No hay laberinto seleccionado")
}
	def validarHabitacion(){
		if(this.habitacionSeleccionada == null)
			throw new UserException("No hay habitacion seleccionada")
}

	def validarAccion(){
		if(this.accionSeleccionada == null)
			throw new UserException("No hay accion seleccionada")
	}
	
}