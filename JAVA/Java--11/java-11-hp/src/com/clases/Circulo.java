package com.clases;

public  class Circulo extends FigurasGeometricas {
	private int radio;

	public Circulo(int radio) {
		super();
		this.radio = radio;
	}
	
	@Override
	public double areas() {
		return Math.PI *  Math.pow(radio,2);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	

}
