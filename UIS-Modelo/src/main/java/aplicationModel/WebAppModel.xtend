package aplicationModel

import unq.edu.ar.UIS_Modelo.Disponibilidad
import unq.edu.ar.UIS_Modelo.Habitacion
import unq.edu.ar.UIS_Modelo.Item
import unq.edu.ar.UIS_Modelo.Laberinto
import unq.edu.ar.UIS_Modelo.Usuario

class WebAppModel {
	
	var Usuario usuario
	
	new(Usuario user){
		usuario = user
	}
	
	def laberintos(){
		var  laberintos = newArrayList
		
		val cuchillo = new Item("Cuchillo")
		val pala = new Item ("Pala")
		val llaveMaestra = new Item("Llave maestra")
		
		val media = new Item("Media")
		val clip = new Item("Clip")
		
		val lupa = new Item("Lupa")
		val cepillo = new Item("Cepillo")
		
		val Laberinto laberinto1= new Laberinto("Castillo",usuario)
		val Laberinto laberinto2 = new Laberinto("Hospital abandonado", usuario)
		val Laberinto laberinto3 = new Laberinto ("Bosque", usuario)
		
		val cocina = new Habitacion("Comedor", Disponibilidad.DISPONIBLE, laberinto1)
		val patio = new Habitacion("Patio", Disponibilidad.NO_DISPONIBLE, laberinto1)
		
		val salaUrgencias = new Habitacion("Sala de Urgencias", Disponibilidad.DISPONIBLE, laberinto2)
		val recepcion = new Habitacion ("Recepcion", Disponibilidad.DISPONIBLE, laberinto2)
		
		val claro = new Habitacion("Claro", Disponibilidad.DISPONIBLE, laberinto3)
		val sotobosque = new Habitacion("Sotobosque", Disponibilidad.NO_DISPONIBLE, laberinto3)
		
		laberinto1 =>[
			agregarItem(cuchillo)
			agregarItem(pala)
			agregarItem(llaveMaestra)
			
			agregarHabitacion(cocina)
			agregarHabitacion(patio)
			
			setHabitacionInicial(cocina)
			setHabitacionFinal(patio)
		]
		
		
		laberinto2 =>[
			agregarItem(media)
			agregarItem(clip)
			
			agregarHabitacion(salaUrgencias)
			agregarHabitacion(recepcion)
			
			setHabitacionInicial(recepcion)
			setHabitacionFinal(salaUrgencias)
		]
		
		laberinto3 =>[
			agregarItem(lupa)
			agregarItem(cepillo)
			
//			agregarHabitacion(claro)
//			agregarHabitacion(sotobosque)
			
//			setHabitacionInicial(claro)
//			setHabitacionFinal(sotobosque)
		]
		
		laberintos => [
//			add(laberinto1)
//			add(laberinto2)
			add(laberinto3)
		]
	}
}