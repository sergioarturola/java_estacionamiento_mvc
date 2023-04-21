package model;

public class Estacionamiento {
	
	private int ocupados = 0;
	private int disponibles = 10;
	
	
	public int getOcupados() {
		return ocupados;
	}


	public void setOcupados() {
		this.ocupados += 1;
	}

	public void quittOcupados() {
		this.ocupados -= 1;
	}

	public int getDisponibles() {
		return disponibles;
	}


	public void setDisponibles() {
		this.disponibles -= 1;
	}
	
	public void quitDisponibles() {
		this.disponibles += 1;
	}

	

	public boolean estaLleno() {
		if(ocupados == 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean estaVacio() {
		if(ocupados == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}