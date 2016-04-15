package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Habitacion {
	
	var String nombreHabitacion
	var List<Accion> acciones
	var List<Habitacion> vecinas
	var List<String> itemsDisponibles
	var String itemUtilizable
	var Disponibilidad estaDisponible
	

	new(String id, Disponibilidad disponibilidad){
		this.nombreHabitacion = id
		this.vecinas = newArrayList()
		this.itemsDisponibles = newArrayList()
		this.itemUtilizable = itemUtilizable
		this.estaDisponible = disponibilidad
		this.acciones = newArrayList() 
	}
	
	def esHabitacionVecina(Habitacion habitacion){
		vecinas.contains(habitacion)
	}
	
	def eliminarAccion(Accion accion){
		this.acciones.remove(accion)
		
		}
		
	def eliminarAcciones(){
		this.acciones.removeAll()
	}
	
	
	
	def eliminarItem(Item item) {
		this.itemsDisponibles.remove(item)
	}
	
	
	
}