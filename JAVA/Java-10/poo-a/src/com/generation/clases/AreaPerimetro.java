package com.generation.clases;

public class AreaPerimetro {

	public double areaCuadrado(double lado) {
		double area = lado * lado;
		
		return area;
	}
	public double perimetroCadrado(double lado) {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public double areaTriangul(int base , int altura) {
		return (base * altura)/2;
	}
	
	public double perimetroTriangulo(double ladoA, double ladoB, double ladoC) {
		return ladoA + ladoB + ladoC;
		
	}
	
	public double areaCirculo(double radio) {
		return (3.1416 * (radio * radio));
	}
	
	public double perimetroCirculo(double radio) {
		return (radio * 2) * 3.1416;
		
	}

}
