package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class SistemaDeLaberintos {
	
	List<Laberinto> laberintos
	Laberinto laberintoSeleccionado
	List<Usuario> usuarios
	Usuario admin
	
	
	
	
	
	def agregarLaberinto(String nombre){
		if(!laberintos.contiene LaberintoDeNombre(nombre))
				 this.laberintos.add(new Laberinto(nombre, admin))
	}
	
	def eliminarHabitacion(Habitacion habitacion){
		habitaciones.remove(habitacion)
	}
}