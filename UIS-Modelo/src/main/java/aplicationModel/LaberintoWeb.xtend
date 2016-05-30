package aplicationModel

import java.util.List
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Item
import unq.edu.ar.UIS_Modelo.Laberinto

class LaberintoWeb {
	
	var String nombre
	var String path
	var List<Habitacion> habitaciones
	var List<Item> items
	var String habitacionInicial
	var String habitacionFinal
	
	new(Laberinto lab, String p){
		nombre = lab.nombreLaberinto
		path = p
		habitaciones = lab.habitaciones
		items = lab.items
		habitacionInicial = lab.habitacionInicial.toString
		habitacionFinal = lab.habitacionFinal.toString
	}
	
}