package com.generation.excepciones;

public class Division {
	private int numerador;
	private int denominador;
	
	
	public Division(int numerador, int denominador) throws OpException {
		
		if(denominador == 0) {
			throw new OpException("El denominador e sun cero");
		}
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public void visualizarD() {
		System.out.println("El resultado es: " + this.numerador / this.denominador);
	}
	
	
}

