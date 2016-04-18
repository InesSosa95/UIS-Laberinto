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
	
	Habitacion habitacionProxima
	
	new(Habitacion habitacionActual) {
		super (habitacionActual)
		habitacionProxima = habitacionActual 
	}
	
	def habitacionesDisponibles(){
		return habitacionActual.laberinto.habitaciones.distintasAlaActual
	}
	
	def List<Habitacion> distintasAlaActual(List<Habitacion> habitaciones){
		habitaciones.filter[! it.equals(habitacionActual)].toList
	}
	
	override toString(){
		"Accion Moverse a -" + habitacionProxima.toString()
	}
	
}

@Accessors
@TransactionalAndObservable
class AccionAgarrarItem extends Accion{
	
	String nombreItem
	
	new(Habitacion habitacion){
		super (habitacion)
	}
	
	def agregarItemDisponble(){
		var item = new Item(nombreItem)
		habitacionActual.itemsDisponibles.add(item)
	}
	
	override toString(){
		"Accion Agarrar item -" + nombreItem
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
	
	new(Habitacion habitacion){
		super(habitacion)
	}
		
	def crearAccionItem(){
		accionItem = new Accion(habitacionActual)
	}
	
	override toString(){
		"Accion de Usar " + itemSeleccionado.toString + ":" + accionItem.toString
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

