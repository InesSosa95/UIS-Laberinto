package unq.edu.ar.UIS_Modelo

import static org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class LaberintoTestCase {
	
	var Laberinto laberinto
	var Usuario administrador
	var Habitacion habitacion1
	var Habitacion habitacion2
	var Habitacion habitacion3
	
	@Before def void setup(){
		val disponible = Disponibilidad.DISPONIBLE
		administrador = new Usuario("Pepe")
//		laberinto = new Laberinto()
		habitacion1 = new Habitacion("Patio", disponible, laberinto)
		habitacion2 = new Habitacion ("Catacumba", disponible, laberinto)
		habitacion3 = new Habitacion ("Catacumba", disponible, laberinto)	
	}
	
	@Test def void testAgregarHabitacion(){
		
		laberinto.agregarHabitacion(habitacion1)
		val actual = laberinto.habitaciones.size
		val expected = 1
		
		assertEquals(expected, actual)
		assertTrue(laberinto.habitaciones.contains(habitacion1))
	}
	
	@Test def void testEliminarHabitacion(){
		
		laberinto.agregarHabitacion(habitacion1)
		laberinto.eliminarHabitacion(habitacion1)
		val actual = laberinto.habitaciones.size
		val expected = 0
		
		assertEquals(expected, actual)
		assertFalse(laberinto.habitaciones.contains(habitacion1))
	}
}