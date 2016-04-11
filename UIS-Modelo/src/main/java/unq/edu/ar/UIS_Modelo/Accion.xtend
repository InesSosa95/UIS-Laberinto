package unq.edu.ar.UIS_Modelo

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Accion {
	
	Habitacion habitacionActual
	
	new(Habitacion habitacion ){
		habitacionActual = habitacion
	}
}

class AccionMoverDeHabitacion extends Accion{

	new(Habitacion habitacion) {
		super (habitacion)
	}
	
	def habitacionesDisponibles(){
		return habitacionActual.vecinas
	}
	
}

class AccionAgarrarItem extends Accion{
	
	new(Habitacion habitacion){
		super (habitacion)
	}
	
	def agregarItemDisponble(String nombreItem){
		this.habitacionActual.itemsDisponibles.add(nombreItem)
	}
	
}
class AccionUsarItem extends Accion{
	
	String itemSeleccionado
	
	new(Habitacion habitacion, String item){
		super(habitacion)
		itemSeleccionado = item
	}	
	def crearAccionItem(){
		//////!!!!!?????????
	}

	}
class AccionSalir extends Accion{
	
	new(Habitacion habitacion) {
		super( habitacion)
	}
	
	}
class AccionRendirse extends Accion{
	
	new(Habitacion habitacion) {
		super( habitacion)
	}
	
	}

