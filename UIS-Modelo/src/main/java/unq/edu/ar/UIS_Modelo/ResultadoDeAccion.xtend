package unq.edu.ar.UIS_Modelo

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable

abstract class ResultadoDeAccion {
	Item item
	
	def abstract void habilitar(Item item, Habitacion habitacion) 
	
	
}

class ResultadoHabilitarHabitacion extends ResultadoDeAccion{
	Habitacion habitacionADesbloquear
	
	override void habilitar(Item item, Habitacion habitacion){
		if(item.nombreItem == this.item.nombreItem)
		habitacionADesbloquear.estaDisponible = true
	}  
	
}

class ResultadoHabilitarItem extends ResultadoDeAccion{
	
	
	override void habilitar(Item item, Habitacion habitacion){
		if(item.nombreItem == this.item.nombreItem)
		habitacion.estaDisponible = true
	}  
	
	
}