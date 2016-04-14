package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Laberinto {
	
	String nombreLaberinto
	List<Habitacion> habitaciones
	Habitacion habitacionInicial
	Habitacion habitacionFinal
	Usuario administrador
	List<Item> items
	
	
	new(String nombre, Usuario admin){
		nombreLaberinto = nombre
		administrador = admin
		habitaciones = newArrayList
		items = newArrayList
		habitacionInicial = null
		habitacionFinal = null
	}
	
	def setHabitacionInicial(Habitacion habitacion){
		if(hayHabitacionInicial(habitacion) || habitacion == habitacionFinal)
			throw new UserException("Solo puede haber una habitacion inicial")
		else{habitacionInicial = habitacion }
	}
	
	def setHabitacionFinal(Habitacion habitacion){
		if(hayHabitacionFinal(habitacion) || habitacion == habitacionInicial)
			throw new UserException("Solo puede haber una habitacion final")
		else{habitacionFinal = habitacion }
	}
	
	def private hayHabitacionInicial(Habitacion habitacion) {
		return habitacionInicial != null
	}
	
	def private hayHabitacionFinal(Habitacion habitacion) {
		return habitacionFinal != null
	}
	
	def agregarHabitacion(Habitacion habitacion){
		if(!habitaciones.contains(habitacion)) habitaciones.add(habitacion)
	}
	
	def eliminarHabitacion(Habitacion habitacion){
		habitaciones.remove(habitacion)
	}
	
	def agregarItem(Item item){
		if(noExisteItem(item))
			items.add(item)
	}
	
	def private Boolean noExisteItem(Item item){
		for(Item i: items){
			if(i.nombre == item.nombre)
				throw new UserException("El item ya existe")
		}
	}
}