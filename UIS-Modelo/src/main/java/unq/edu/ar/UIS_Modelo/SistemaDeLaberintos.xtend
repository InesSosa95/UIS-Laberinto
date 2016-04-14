package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class SistemaDeLaberintos {
	
	List<Laberinto> laberintos
	List<Usuario> usuarios
	Usuario administrador	
	
	new(Usuario admin){
		laberintos= newArrayList 
		usuarios = newArrayList
		administrador= admin
	}
	
	def agregarLaberinto(Laberinto laberinto){
		for(Laberinto l: laberintos){
			if(l.nombreLaberinto == laberinto.nombreLaberinto) 
				throw new UserException("Ya existe un laberinto con ese nombre")
		}
	}
	
	def eliminarLaberinto(Laberinto laberinto){
		laberintos.remove(laberinto)
	}
	
	def agregarUsuario(Usuario usuario){
		usuarios.add(usuario)
	}
	
	def eliminarUsuario(Usuario usuario){
		if(administrador == usuario)
			throw new UserException("No puede eliminar al administrador")
	}
	
	def cambiarAdministrador(Usuario usuario){
		administrador= usuario
	}
}