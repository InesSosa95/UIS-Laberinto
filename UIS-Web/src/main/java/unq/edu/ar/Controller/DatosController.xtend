package unq.edu.ar.Controller

import aplicationModel.WebAppModel
import org.uqbar.xtrest.api.Result
import org.uqbar.xtrest.api.XTRest
import org.uqbar.xtrest.api.annotation.Controller
import org.uqbar.xtrest.api.annotation.Get
import org.uqbar.xtrest.http.ContentType
import org.uqbar.xtrest.json.JSONUtils
import unq.edu.ar.UIS_Modelo.Usuario

@Controller
class DatosController {

	extension JSONUtils = new JSONUtils
	
	val repoWeb = new WebAppModel(new Usuario("Juan"))

	def static void main(String[] args) {
		XTRest.start(DatosController, 9000)
	}
	
	@Get("/laberintos")
	def Result laberintos(){
		val labs = repoWeb.laberintos
		response.contentType = ContentType.APPLICATION_JSON
		ok(labs.toJson)
	}
	
	@Get("/laberintosNombres")
	def Result laberintosNombres(){
		val labs = repoWeb.laberintos.map[nombreLaberinto]
		response.contentType = ContentType.APPLICATION_JSON
		ok(labs.toJson)
	}
}
