package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Usuario {
	
	String nombreUsuario
	List<Laberinto> laberintosJugados
	List<Laberinto> laberintosAbandonados
	Inventario inventario
	
	new(String nombre){
		nombreUsuario = nombre
		laberintosJugados = newArrayList()
		laberintosAbandonados = newArrayList()
	}
	
	
}