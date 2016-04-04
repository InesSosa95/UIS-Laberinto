package unq.edu.ar.UIS_Modelo

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.model.UserException
import org.uqbar.commons.utils.Observable

@Accessors
@Observable
class Habitacion {
	
	String id 
	List<Habitacion> vecinas
	List<String> itemUtilizable
	String itemDisponible
	Boolean esFinal
	Boolean esInicial
	
	new(String id,Boolean esFinal, Boolean esInicial ){
		this.id = id
		this.vecinas = newArrayList()
		this.itemUtilizable = newArrayList()
		this.esFinal = esFinal
		if(esFinal == true && esInicial == true)
			throw new UserException("La habitacion no puede ser inicial y final al mismo tiempo")
	}
	
	def esHabitacionVecina(Habitacion habitacion){
		vecinas.contains(habitacion)
	}
	
}