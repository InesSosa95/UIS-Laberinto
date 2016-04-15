package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable
import org.uqbar.commons.model.Entity
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Laberinto { //extends Entity{
	
	SistemaDeLaberintos sistema
	
	var String nombreLaberinto
	var List<Habitacion> habitaciones
	var Habitacion habitacionInicial
	var Habitacion habitacionFinal
	var Usuario administrador
	var List<Item> items
	
	new(){
		nombreLaberinto = "estoNoDeberiaPasar"
		habitaciones = newArrayList
		items = newArrayList
		habitacionInicial = null
		habitacionFinal = null
	}
	
	new(String nombre, Usuario admin){
		nombreLaberinto = nombre
		administrador = admin
		habitaciones = newArrayList
		items = newArrayList
		habitacionInicial = null
		habitacionFinal = null
	}
	
	new(String nombre, Usuario admin, SistemaDeLaberintos sistema){
		nombreLaberinto = nombre
		administrador = admin
		habitaciones = newArrayList
		items = newArrayList
		habitacionInicial = null
		habitacionFinal = null
		this.sistema = sistema
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
		habitaciones.add(habitacion)
	}
	
	def eliminarHabitacion(Habitacion habitacion){
		habitaciones.remove(habitacion)
	}
	
	def eliminarHabitaciones(){
		habitaciones.removeAll()
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

def validarHabitacion(Habitacion habitacion){
		if(esVacio(habitacion.nombreHabitacion)){
			throw new UserException("El nombre de la habitacion no es valido")
		}
		
		for(Habitacion h: habitaciones){
			if(h.nombreHabitacion == habitacion.nombreHabitacion)
				throw new UserException("Ya existe una habitacion con ese nombre")
		}
	
	}

	def esVacio(String string){
		var s = string.toCharArray
		for(char each : s){
			if(each !=  " ".toCharArray.get(0)){
				return false
			}
		}
		return true
	}
	
		}