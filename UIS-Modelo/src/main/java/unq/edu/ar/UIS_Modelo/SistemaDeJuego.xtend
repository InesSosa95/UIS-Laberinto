package unq.edu.ar.UIS_Modelo

class SistemaDeJuego {
	
	Usuario usuario
	Laberinto laberinto
	Habitacion habitacionActual
	
	
	new(Usuario user, Laberinto labyrinth, Habitacion room){
		usuario = user
		laberinto = labyrinth
		habitacionActual = room
	}
	
	def recogerItem(Item item){
		if(habitacionActual.tieneItem(item)){
			agregarItemAInventario(item)
			}
	}
		
	def moverAVecina(Habitacion habitacion){
		if(esVecina(habitacion)){
			habitacionActual = habitacion
		}
	}
	
	def arrojarItem(Item item){
		usuario.inventario.eliminarItem(item)
	}
	
	def agregarItemAInventario(Item item){
		usuario.inventario.agregarItem(item)
	}
	
	def eliminarItemDeHabitacion(Item item){
		habitacionActual.eliminarItem(item)
	}
	
	def esVecina(Habitacion habitacion){
		habitacionActual.esHabitacionVecina(habitacion)
	}
}