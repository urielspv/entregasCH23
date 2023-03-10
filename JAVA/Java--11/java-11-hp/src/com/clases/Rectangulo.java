package com.clases;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas {
	private double base;
	private double altura;
	public Rectangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double b) {
		this.base = b;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double h) {
		this.altura = h;
	}
	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return base * altura;
	}
	
	public void pedirDatos() {
		Scanner datos = new Scanner(System.in);
		System.out.println("Introduzca la base");
		double b = datos.nextDouble();
		this.setBase(b);
		
		System.out.println("Introduzca la altura");
		double h = datos.nextDouble();
		this.setAltura(h);
		
		
		
	}
	
	

}
