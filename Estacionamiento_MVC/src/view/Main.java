package view;

import controller.Operaciones;

public class Main {

	public static void main(String[] args) {
		
		Operaciones operaciones = new Operaciones();
		boolean on = true;
		
		
		do {
			
			operaciones.pantalla();
			
			int seleccion = operaciones.menu();
			
			if(seleccion == 1) {
				operaciones.meterCarro();
			}
			
			if(seleccion == 2) {
				operaciones.sacarCarro();
			}
			
			if(seleccion == 3) {
				on = false;
			}
			
		}while(on);
		

	}

}
