package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import org.eclipse.xtend.lib.annotations.ToStringProcessor.Util

@Accessors
@TransactionalAndObservable
class Laberinto {
	
	String nombreLaberinto
	List<Habitacion> habitaciones
	Habitacion habitacionInicial
	Habitacion habitacionFinal
	Usuario administrador
	
	
	new(String nombreLaberinto, Usuario administrador){
		this.nombreLaberinto = nombreLaberinto
		this.administrador = administrador
		this.habitaciones = newArrayList()
		this.habitacionInicial = null
		this.habitacionFinal = null
		
	}
	
	def agregarHabitacion(Habitacion habitacion){
		if(!habitaciones.contains(habitacion)) habitaciones.add(habitacion)
	}
	
	def eliminarHabitacion(Habitacion habitacion){
		habitaciones.remove(habitacion)
	}
	
}