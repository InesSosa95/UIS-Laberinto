package unq.edu.ar.UIS_Modelo

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Accion {
	
	String nombreAccion
	Habitacion habitacionActual
	
	new(String nombre,Habitacion habitacion ){
		nombreAccion = nombre
		habitacionActual = habitacion
	}
}

class AccionMoverDeHabitacion extends Accion{

	new(String nombre, Habitacion habitacion) {
		super(nombre, habitacion)
	}
	
	def void moverse(Habitacion otraHabitacion){
		if(habitacionActual.esHabitacionVecina(otraHabitacion) && otraHabitacion.estaHabilitada== true)
			 habitacionActual = otraHabitacion
		else {throw new UserException("No se puede mover a esta habitacion")}
	}
}

class AccionAgarrarItem extends Accion{
	
	Inventario inventario
	
	new(String nombre, Habitacion habitacion) {
		super(nombre, habitacion)
	}
	
	def agarraItem(){
		var item = habitacionActual.itemsDisponibles.get(0)
		inventario.agregarItem(item)
		habitacionActual.itemsDisponibles.remove(item)	
	}
	
}
class AccionUsarItem extends Accion{
	def void usarItem(Item item, Habitacion habitacion){
		habitacion.eliminarItem(item)
				
		}
	}
class AccionSalir extends Accion{}
class AccionRendirse extends Accion{}

