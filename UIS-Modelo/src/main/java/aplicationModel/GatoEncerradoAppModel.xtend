package aplicationModel

import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.uqbar.commons.utils.Observable
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Laberinto
import unq.edu.ar.UIS_Modelo.Usuario

@Accessors
@Observable
class GatoEncerradoAppModel {
	
	
	
	List<Laberinto> laberintos
	Laberinto laberintoSeleccionado
	Habitacion habitacionSeleccionada
	Accion accionSeleccionada
	Usuario administrador

	
	new(){
		laberintos = new ArrayList
		administrador = new Usuario("Pepito")
		laberintoSeleccionado = new Laberinto()
		}
	
	
	
	
	
	
	
	
	
	
}