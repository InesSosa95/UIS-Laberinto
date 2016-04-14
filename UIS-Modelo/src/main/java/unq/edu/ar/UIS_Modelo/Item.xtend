package unq.edu.ar.UIS_Modelo

import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.TransactionalAndObservable

@Accessors
@TransactionalAndObservable
class Item {
	
	String nombre
	Accion accion
	
	new(String nombreItem){
		nombre = nombreItem
	}
	
}