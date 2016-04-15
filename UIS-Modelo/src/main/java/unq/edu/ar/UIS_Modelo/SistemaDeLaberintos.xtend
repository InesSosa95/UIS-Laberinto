package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.TransactionalAndObservable
import scala.Char
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class SistemaDeLaberintos {
	
	var List<Laberinto> laberintos
	var List<Usuario> usuarios
	var Usuario administrador
	
	new(Usuario admin){
		laberintos= newArrayList 
		usuarios = newArrayList
		administrador= admin
		
	}
	
	def validarLaberinto(Laberinto laberinto){
	if(esVacio(laberinto.nombreLaberinto)){
			throw new UserException("El nombre del laberinto no es valido")
		}
		
		for(Laberinto l: laberintos){
			if(l.nombreLaberinto == laberinto.nombreLaberinto)
				throw new UserException("Ya existe un laberinto con ese nombre")
		}
	
	}
	
	def agregarLaberinto(Laberinto laberinto){
		laberintos.add(laberinto)
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
	
	def esVacio(String string){
		var s = string.toCharArray
		for(char each : s){
			if(each !=  " ".toCharArray.get(0)){
				return false
			}
		}
		return true
	}
	
	def void setLaberintoSeleccionado(Laberinto laberinto){
		this.laberintoSeleccionado = laberinto
		this.actualizar()
	}
	
	
	def actualizar() {
		
	}
	
}