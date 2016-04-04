package view

import java.awt.Dialog

class AgregarAccionWindow extends Dialog<Accion>{
	
	new(WindowOwner parent, GatoEncerrado model ){
		super(parent, model)
		title = "Agregar Acción"
	}
	
	
		
}