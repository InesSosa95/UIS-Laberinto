package unq.edu.ar.UIS_Modelo

import java.util.List
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable
import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
@TransactionalAndObservable
class Usuario {
	
	String nombreUsuario
	List<Laberinto> laberintosJugados
	List<Laberinto> laberintosAbandonados
	List<String> inventario
	
	new(String nombre){
		nombreUsuario = nombre
		laberintosJugados = newArrayList()
		laberintosAbandonados = newArrayList()
		inventario = newArrayList()
	}
	
	def agregarItem(String item){
		if(inventario.size < 15) inventario.add(item)
		else{throw new UserException("El inventario esta lleno")}
		
		}
}