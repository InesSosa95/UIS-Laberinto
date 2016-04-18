package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.ObservableUtils
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Habitacion {
	
	String nombreHabitacion
	List<Accion> acciones
	List<Habitacion> vecinas
	List<Item> itemsDisponibles
	Item itemUtilizable
	Disponibilidad estaDisponible
	Laberinto laberinto
	

	new(String id, Disponibilidad disponibilidad, Laberinto laberinto){
		this.nombreHabitacion = id
		this.vecinas = newArrayList()
		this.itemsDisponibles = newArrayList()
		this.estaDisponible = disponibilidad
		this.acciones = newArrayList()
		this.laberinto = laberinto
	}
	
	def esHabitacionVecina(Habitacion habitacion){
		vecinas.contains(habitacion)
	}
	
	def agregarVecina(Habitacion habitacion){
		vecinas.add(habitacion)
	}
	
	def agregarAccion(Accion accion){
		this.acciones.add(accion)
	}
	
	def eliminarAccion(Accion accion){
		this.acciones.remove(accion)
	}
		
	def eliminarAcciones(){
		this.acciones.removeAll()
	}
	
	override toString(){
		nombreHabitacion
	}
	
	def agregarItem(Item item){
		itemsDisponibles.add(item)
	}
	
	def eliminarItem(Item item) {
		itemsDisponibles.remove(item)
	}
	
}