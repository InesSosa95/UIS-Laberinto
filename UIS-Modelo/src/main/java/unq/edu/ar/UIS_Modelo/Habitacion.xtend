package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Habitacion {
	
	var String nombre 
	var List<Accion> acciones
	var List<Habitacion> vecinas
	var List<String> itemsDisponibles
	var String itemUtilizable
	var Disponibilidad estaDisponible
	

	new(String id, Disponibilidad disponibilidad){
		this.nombre = id
		this.vecinas = newArrayList()
		this.itemsDisponibles = newArrayList()
		this.itemUtilizable = itemUtilizable
		this.estaDisponible = disponibilidad
		this.acciones = newArrayList() 
	}
	
	def esHabitacionVecina(Habitacion habitacion){
		vecinas.contains(habitacion)
	}
	
	def eliminarItem(Item item) {
		this.itemsDisponibles.remove(item)
	}
	
}