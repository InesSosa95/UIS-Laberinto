package unq.edu.ar.UIS_Modelo

import static org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HabitacionTestCase {
	
	var Habitacion habitacion1
	var Habitacion habitacion2
	var Laberinto laberinto1
	var Accion accion
	var Item item
	
	@Before def void setUp(){
		val disponible = Disponibilidad.DISPONIBLE
		habitacion1 = new Habitacion("cocina", disponible, laberinto1)
		habitacion2 = new Habitacion("Baño", disponible, laberinto1)
		accion = new Accion(habitacion1)
		item = new Item("Llave maestra")
	}
	
	@Test def void testValues(){
		val nombre = habitacion1.nombreHabitacion
		val actual = habitacion1.vecinas.size
		val expected = 0
		
		assertEquals(expected, actual)
		assertEquals("cocina", nombre)
	}
	
	@Test def void testAgregarVecina(){
		habitacion1.agregarVecina(habitacion2)
		val vecinas = habitacion1.esHabitacionVecina(habitacion2)
		val actual = habitacion1.vecinas.size
		val expected = 1
		
		assertEquals(expected, actual)
		assertTrue(vecinas)
	}
	
	@Test def void testEliminarVecina(){
		habitacion1.agregarVecina(habitacion2)
		habitacion1.vecinas.remove(habitacion2)
		val esVecina = habitacion1.esHabitacionVecina(habitacion2)
		val actual = habitacion1.vecinas.size
		val expected = 0
		
		assertEquals(expected, actual)
		assertFalse(esVecina)
	}
	
	@Test def void testAgregarAccion(){
		habitacion1.agregarAccion(accion)
		val actual = habitacion1.acciones.size
		val expected = 1
		val tieneAccion = habitacion1.acciones.contains(accion)
		
		assertEquals(expected, actual)
		assertTrue (tieneAccion)
	}
	
	@Test def void testEliminarLaberinto(){
		habitacion1.agregarAccion(accion)		
		habitacion1.eliminarAccion(accion)
		
		val actual = habitacion1.acciones.size
		val expected = 0
		val tieneAccion = habitacion1.acciones.contains(accion)
		
		assertEquals(expected, actual)
		assertFalse(tieneAccion)
	}
	
	@Test def void testAgregarItem(){
		habitacion1.agregarItem(item)
		val actual = habitacion1.itemsDisponibles.size
		val expected = 1
		
		assertEquals(expected, actual)
		assertTrue(habitacion1.itemsDisponibles.contains(item))
	}
}