package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Inventario {
	
	Integer idInventario
	Habitacion habitacion
	Usuario usuario
	List<String> items
	
	new (Habitacion habitacion){
		this.habitacion = habitacion
		this.usuario = usuario
	}
	
	def agregarItem(String item){
		if (items.size <= 15) items.add(item)
		else {throw new UserException("El inventario esta lleno")} 
	}
	
	def eliminarItem(String item){
		items.remove(item)
	}
	
}