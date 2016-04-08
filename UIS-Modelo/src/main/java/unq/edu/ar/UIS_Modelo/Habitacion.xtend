package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Habitacion {
	
	String id 
	List<Accion> acciones
	List<Habitacion> vecinas
	List<Item> itemsDisponibles
	Item itemUtilizable
	Boolean estaDisponible
	Boolean esFinal
	Boolean esInicial
	Boolean estaHabilitada
	//List<ResultadoDeAccion> resultados
	
	new(String id,Boolean esFinal, Boolean esInicial, Item itemUtilizable, Boolean habilitada){
		this.id = id
		this.vecinas = newArrayList()
		this.itemsDisponibles = newArrayList()
		this.itemUtilizable = itemUtilizable
		this.esFinal = false //'esto puede ir en el laberinto'
		this.esInicial = false //'esto tambien'
		this.estaHabilitada = habilitada
	}
	
	def esHabitacionVecina(Habitacion habitacion){
		vecinas.contains(habitacion)
	}
	
	def eliminarItem(Item item) {
		this.itemsDisponibles.remove(item)
	}
	
	def marcarComoInicial(){
		if(esFinal == false) esInicial = true
		else {throw new UserException("La habitacion no puede ser final e inicial al mismo tiempo")}
	}
	
	def marcarComoFinal(){
		if(esInicial == false) esFinal = true
		else {throw new UserException("La habitacion no puede ser final e inicial al mismo tiempo")} 
	}
}