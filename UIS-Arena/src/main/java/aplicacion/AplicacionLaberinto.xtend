package aplicacion

import unq.edu.ar.UIS_Modelo.Habitacion
import view.AgregarAccionWindow
import unq.edu.ar.UIS_Modelo.Accion
import unq.edu.ar.UIS_Modelo.SistemaDeLaberintos
import view.GatoEncerradoWindow

class AplicacionLaberinto {

def static main(String[] args){
		
		//new AgregarAccionWindow(new Accion("Mover", new Habitacion("", false, false, null, true))).startApplication
		new GatoEncerradoWindow(new SistemaDeLaberintos).startApplication
		// new(String id,Boolean esFinal, Boolean esInicial, Item itemUtilizable, Boolean habilitada)
	}
	
}