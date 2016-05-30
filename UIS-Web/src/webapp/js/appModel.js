


function actualizar_stats(name){

	for (var i = Things.length - 1; i >= 0; i--) {
		var character = Things[i];
		if (character.nombre.equals(name)){
			actualizar_jugadas(character.jugadas);
			actualizar_ganadascharacter.jugadas);
			actualizar_kills(character.jugadas);
			actualizar_deads(character.jugadas);
			actualizar_assists(character.jugadas);
			actualizar_linea(character.jugadas);
			actualizar_calificacion(character.jugadas);
		}

	};
}