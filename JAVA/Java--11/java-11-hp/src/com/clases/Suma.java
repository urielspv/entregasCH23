package com.clases;

public class Suma implements OperacionesAritmeticas {
	
	private double a;
	private double b;
	
	
	
	public Suma(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double sumar() {
		return this.a + this.b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double multiplicar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double dividir() {
		// TODO Auto-generated method stub
		return 0;
	}

}
