package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Laberinto {
	
	String nombreLaberinto
	List<Habitacion> habitaciones
	Habitacion habitacionActual
	
	new(String nombreLaberinto){
		this.nombreLaberinto = nombreLaberinto
		this.habitaciones = newArrayList()
		this.habitacionActual = null
	}
	
	def agregarHabitacion(Habitacion habitacion){
		if(!habitaciones.contains(habitacion)) habitaciones.add(habitacion)
	}
	
	def moverHabitacion(Habitacion habitacion){
		if(habitacionActual.esHabitacionVecina(habitacion)) habitacionActual = habitacion
		else {throw new UserException("No puede moverse a esta habitación")}
	}
}