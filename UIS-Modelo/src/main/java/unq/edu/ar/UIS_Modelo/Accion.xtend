package unq.edu.ar.UIS_Modelo

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable
import java.util.List

@Accessors
@TransactionalAndObservable
class Accion {
	
	Habitacion habitacionActual
	
	new(Habitacion habitacion ){
		habitacionActual = habitacion
	}
	
	override toString(){
		"Accion " + habitacionActual.toString()
	}
}

@Accessors
@TransactionalAndObservable
class AccionMoverDeHabitacion extends Accion{
	
	new(Habitacion habitacion) {
		super (habitacion)
	}
	
	def habitacionesDisponibles(){
		return habitacionActual.laberinto.habitaciones.distintasAlaActual
	}
	
	def List<Habitacion> distintasAlaActual(List<Habitacion> habitaciones){
		habitaciones.filter[! it.equals(habitacionActual)].toList
	}
	
}

@Accessors
@TransactionalAndObservable
class AccionAgarrarItem extends Accion{
	
	new(Habitacion habitacion){
		super (habitacion)
	}
	
	def agregarItemDisponble(String nombreItem){
		var item = new Item(nombreItem)
		habitacionActual.itemsDisponibles.add(item)
	}
	
}

@Accessors
@TransactionalAndObservable
class AccionUsarItem extends Accion{
	
	Item itemSeleccionado
	Accion accionItem
	
	new(Habitacion habitacion, String item){
		super(habitacion)
		itemSeleccionado = new Item(item)
	}	
	def crearAccionItem(){
		accionItem = new Accion(habitacionActual)
	}

	}
	
@Accessors
@TransactionalAndObservable
class AccionSalir extends Accion{
	
	new(Habitacion habitacion) {
		super( habitacion)
	}
	
	}
	
@Accessors
@TransactionalAndObservable
class AccionRendirse extends Accion{
	
	new(Habitacion habitacion) {
		super( habitacion)
	}
	
	}

