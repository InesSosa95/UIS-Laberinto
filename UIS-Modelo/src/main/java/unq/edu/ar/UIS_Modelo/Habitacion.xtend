package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Habitacion {
	
	String id 
	List<Accion> acciones
	List<Habitacion> vecinas
	List<String> itemsDisponibles
	String itemUtilizable
	Disponibilidad estaDisponible
	
	//TODO new(String id, String itemUtilizable, Disponibilidad disponibilidad){
	new(String id, Disponibilidad disponibilidad){
		this.id = id
		this.vecinas = newArrayList()
		this.itemsDisponibles = newArrayList()
		this.itemUtilizable = itemUtilizable
		this.estaDisponible = disponibilidad
	}
	
	def esHabitacionVecina(Habitacion habitacion){
		vecinas.contains(habitacion)
	}
	
	def eliminarItem(Item item) {
		this.itemsDisponibles.remove(item)
	}
	
}