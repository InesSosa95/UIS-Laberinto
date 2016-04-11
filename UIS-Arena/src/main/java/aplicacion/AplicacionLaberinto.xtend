package aplicacion

import aplicationModel.GatoEncerradoModel
import org.uqbar.arena.Application
import view.GatoEncerradoWindow

class AplicacionLaberinto extends Application{

	
	override createMainWindow() {
		new GatoEncerradoWindow(this, new GatoEncerradoModel)
	}
	
	def static main(String[] args){
		new AplicacionLaberinto().start
	}
}