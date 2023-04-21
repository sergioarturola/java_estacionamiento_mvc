package controller;

import java.util.Scanner;
import model.Estacionamiento;


public class Operaciones {
	
	Scanner teclado = new Scanner(System.in);
	Estacionamiento est = new Estacionamiento();
	
	public void meterCarro() {
		
		if(est.estaLleno()) {
			System.out.println("-----------------------------");
			System.out.println("El estacionamiento esta lleno");
			System.out.println("NO se pueden meter nuevos autos");
			System.out.println("------------------------------");
		}
		else {
			est.setDisponibles();
			est.setOcupados();
		}
		
	}
	
	public void sacarCarro() {
		
		if(est.estaVacio()) {
			System.out.println("-- Ya no hay carros que sacar --");
		}
		else {
			est.quitDisponibles();
			est.quittOcupados();
		}
		
		
	}
	public int menu(){
		
		System.out.println("+-- Estacionamiento -- +");
		System.out.println("+--   1. Registrar   --+");
		System.out.println("+--   2. Cobrar      --+");
		System.out.println("+--   3. Salir       --+");
		System.out.print("+-- Opcion: ");
		int opcion = teclado.nextInt();
		
		return opcion;
		
	}
	
	public void pantalla() {
		
		System.out.println("******************");
		System.out.println("* Libres: "+ est.getDisponibles());
		System.out.println("* Ocupados: "+ est.getOcupados());
		System.out.println("******************");
	}

}
