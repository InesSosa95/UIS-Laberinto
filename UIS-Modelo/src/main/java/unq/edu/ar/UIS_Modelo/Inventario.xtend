package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Inventario {
	
	Integer idInventario
	Laberinto laberinto
	Usuario usuario
	List<Item> items
	
	new (Laberinto laberinto){
		this.laberinto = laberinto
		this.usuario = usuario
		this.items = newArrayList()
	}
	
	def agregarItem(Item item){
		if (items.size < 15) items.add(item)
		else {throw new UserException("El inventario esta lleno")} 
	}
	
	def eliminarItem(Item item){
		items.remove(item)
	}
	
}