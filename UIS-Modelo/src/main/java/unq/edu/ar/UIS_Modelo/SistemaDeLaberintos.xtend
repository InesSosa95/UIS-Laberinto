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
	
}